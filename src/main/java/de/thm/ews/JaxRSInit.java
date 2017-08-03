package de.thm.ews;

import de.thm.ews.model.Login;
import de.thm.ews.model.Trainer;
import org.hibernate.Hibernate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Created by sebb9 on 13.06.2017.
 */
@ApplicationPath("rs")
public class JaxRSInit extends Application {

}
