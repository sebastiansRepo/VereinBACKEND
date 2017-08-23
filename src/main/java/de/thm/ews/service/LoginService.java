package de.thm.ews.service;

import de.thm.ews.model.Login;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Stateless
@Path("login")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class LoginService {

    @PersistenceContext
    private EntityManager em;

    /**
     * Wird verwendet, um einen neuen Login anzulegen.
     * @param login Objekt, welches persistiert werden soll
     * @return persistiertes Login Objekt
     */
    @Path("/register")
    @POST
    public Login create(Login login) {
        em.persist(login);
        return login;
    }


    /**
     * Liefert Login Objekt zur passenden id
     * @param id des gewünschten Login Objekts
     * @return Login mit der id
     */
    @Path("{id}")
    @GET
    public Login read(@PathParam("id") Long id){
        return em.find(Login.class, id);
    }

    /**
     * Wird verwendet, um Login Daten zu verändern
     * @param id gibt an, welches Login Objekt überschrieben werden soll
     * @param login Objekt, das ein anderes Login Objekt überschreiben soll
     * @return Verändertes Login Objekt
     */
    @Path("{id}")
    @PUT
    public Login update(@PathParam("id") Long id, Login login) {
        em.merge(login);
        return login; //maybe 'return read(id)' to prove it has been updated
    }

    /**
     * Wird verwendet, um ein Login Objekt zu löschen
     * @param id des Login Objekts
     * @return Falls ein Objekt gelöscht wurde : das gelöschte Objekt
     *         sonst : null
     */
    @Path("{id}")
    @DELETE
    public Login delete(@PathParam("id") Long id) {
        Login login = em.find(Login.class, id);

        if (login != null) {
            em.remove(login);
            return login;
        }

        return null;
    }

    /**
     * Wird verwendet um einen Trainer zu authentifizieren
     * @param login Objekt, das in der Datenbank gesucht werden soll
     * @return Falls keine Datenbank Exception auftritt, das gefundene Objekt
     */
    @Path("/auth")
    @POST
    public Login authenticate(Login login) {

        TypedQuery<Login> query = em.createQuery("SELECT l FROM Login l WHERE l.username = :name AND l.password = :password", Login.class);
        try {
            return query.setParameter("name", login.getUsername()).setParameter("password", login.getPassword()).getSingleResult();
        } catch(Exception e) {
            System.out.println(e);
            return null;
        }
    }

}
