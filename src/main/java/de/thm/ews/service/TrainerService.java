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

    @Path("{id}")
    @GET
    public Trainer read(@PathParam("id") Long id) { return em.find(Trainer.class, id); }

    @Path("{id}")
    @PUT
    public Trainer update(@PathParam("id") Long id, Trainer trainer) {
        em.merge(trainer);
        return trainer;
    }

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
