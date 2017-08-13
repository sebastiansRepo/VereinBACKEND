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

    @Path("{id}")
    @GET
    public Termin read(@PathParam("id") Long id) {
        return em.find(Termin.class, id);
    }

    @Path("{id}")
    @PUT
    public Termin update(@PathParam("id") Long id, Termin termin) {
        em.merge(termin);
        return termin;
    }

    @Path("{id}")
    @DELETE
    public Termin update(@PathParam("id") Long id) {
        Termin termin = em.find(Termin.class, id);

        if(termin != null) {
            em.remove(termin);
            return termin;
        }

        return null;
    }

}
