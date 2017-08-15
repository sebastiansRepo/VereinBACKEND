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

    @POST
    public Mitglied create(Mitglied mitglied) {
        em.persist(mitglied);
        return mitglied;
    }

    @Path("{id}")
    @GET
    public Mitglied read(@PathParam("id") Long id) {
        return em.find(Mitglied.class, id);
    }

    @Path("{id}")
    @PUT
    public Mitglied update(@PathParam("id") Long id, Mitglied mitglied) {
        em.merge(mitglied);
        return mitglied; //maybe 'return read(id)' to prove it has been updated
    }

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
