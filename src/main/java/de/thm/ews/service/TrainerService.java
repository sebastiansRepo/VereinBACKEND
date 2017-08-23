package de.thm.ews.service;

import de.thm.ews.model.Trainer;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Stateless
@Path("trainer")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class TrainerService {

    @PersistenceContext
    private EntityManager em;

    /**
     * Liefert Trainer Objekt zur passenden id
     * @param id des gewünschten Trainer Objekts
     * @return Trainer mit der id
     */
    @Path("{id}")
    @GET
    public Trainer read(@PathParam("id") Long id) { return em.find(Trainer.class, id); }

    /**
     * Wird verwendet, um Trainer Daten zu verändern
     * @param id gibt an, welches Trainer Objekt überschrieben werden soll
     * @param trainer Objekt, das ein anderes Trainer Objekt überschreiben soll
     * @return Verändertes Trainer Objekt
     */
    @Path("{id}")
    @PUT
    public Trainer update(@PathParam("id") Long id, Trainer trainer) {
        em.merge(trainer);
        return trainer;
    }

    /**
     * Wird verwendet, um ein Trainer Objekt zu löschen
     * @param id des Trainer Objekts
     * @return Falls ein Objekt gelöscht wurde : das gelöschte Objekt
     *         sonst : null
     */
    @Path("{id}")
    @DELETE
    public Trainer delete(@PathParam("id") Long id) {
        Trainer trainer = em.find(Trainer.class, id);
        if(trainer != null) {
            em.remove(trainer);
            return trainer;
        }
        return null;
    }

}
