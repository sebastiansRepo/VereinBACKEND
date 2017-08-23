package de.thm.ews.service;

import de.thm.ews.model.Mitglied;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Stateless
@Path("mitglied")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public class MitgliedService {

    @PersistenceContext
    private EntityManager em;

    /**
     * Wird verwendet, um ein neues Mitglied anzulegen.
     * @param mitglied Objekt, welches persistiert werden soll
     * @return persistiertes Mitglied Objekt
     */
    @POST
    public Mitglied create(Mitglied mitglied) {
        em.persist(mitglied);
        return mitglied;
    }

    /**
     * Liefert Mitglied Objekt zur passenden id
     * @param id des gewünschten Mitglied Objekts
     * @return Mitglied mit der id
     */
    @Path("{id}")
    @GET
    public Mitglied read(@PathParam("id") Long id) {
        return em.find(Mitglied.class, id);
    }

    /**
     * Wird verwendet, um Mitglied Daten zu verändern
     * @param id gibt an, welches Mitglied Objekt überschrieben werden soll
     * @param mitglied Objekt, das ein anderes Mitglied Objekt überschreiben soll
     * @return Verändertes Mitglied Objekt
     */
    @Path("{id}")
    @PUT
    public Mitglied update(@PathParam("id") Long id, Mitglied mitglied) {
        em.merge(mitglied);
        return mitglied; //maybe 'return read(id)' to prove it has been updated
    }

    /**
     * Wird verwendet, um ein Mitglied Objekt zu löschen
     * @param id des Mitglied Objekts
     * @return Falls ein Objekt gelöscht wurde : das gelöschte Objekt
     *         sonst : null
     */
    @Path("{id}")
    @DELETE
    public Mitglied delete(@PathParam("id") Long id) {
        Mitglied mitglied = em.find(Mitglied.class, id);

        if (mitglied != null) {
            em.remove(mitglied);
            return mitglied;
        }

        return null;
    }
}
