package de.thm.ews.service;

import de.thm.ews.model.Login;
import de.thm.ews.model.Person;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by sebb9 on 13.06.2017.
 */
@Stateless
@Path("login")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class LoginService {

    @PersistenceContext
    private EntityManager em;

    @Path("/register")
    @POST
    public Login create(Login login) {
        em.persist(login);
        return login;
    }

    @Path("{id}")
    @GET
    public Login read(@PathParam("id")Long id){
        return em.find(Login.class, id);
    }

    @PUT
    @Path("{id}")
    public Login update(@PathParam("id") Long id, Login login) {
        em.merge(login);
        return login;
    }

    @DELETE
    @Path("{id}")
    public Login delete(@PathParam("id") Long id) {
        Login login = em.find(Login.class, id);

        if (login != null) {
            em.remove(login);
            return login;
        }

        return null;
    }


    @Path("/auth")
    @POST
    public Login authenticate(Login login) {
        TypedQuery<Login> query = em.createQuery(
                "SELECT l FROM Login l WHERE l.username = :sentUsername",
                Login.class
        );
        return null;
    }

}
