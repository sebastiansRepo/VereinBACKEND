package de.thm.ews.service;

import de.thm.ews.model.Termin;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Stateless
@Path("termin")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class TerminService {

    @PersistenceContext
    private EntityManager em;

    /**
     * Liefert Termin Objekt zur passenden id
     * @param id des gewünschten Termin Objekts
     * @return Termin mit der id
     */
    @Path("{id}")
    @GET
    public Termin read(@PathParam("id") Long id) {
        return em.find(Termin.class, id);
    }

    /**
     * Wird verwendet, um einen neuen Termin anzulegen.
     * @param termin Objekt, welches persistiert werden soll
     * @return persistiertes Termin Objekt
     */
    @POST
    public Termin update(Termin termin) {
        em.merge(termin);
        return termin;
    }

    /**
     * Wird verwendet, um ein Termin Objekt zu löschen
     * @param id des Termin Objekts
     * @return Falls ein Objekt gelöscht wurde : das gelöschte Objekt
     *         sonst : null
     */
    @Path("{id}")
    @DELETE
    public Termin delete(@PathParam("id") Long id) {
        Termin termin = em.find(Termin.class, id);

        if(termin != null) {
            em.remove(termin);
            return termin;
        }

        return null;
    }

}
