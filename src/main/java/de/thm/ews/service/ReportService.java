package de.thm.ews.service;

import de.thm.ews.model.Report;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Stateless
@Path("report")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class ReportService {

    @PersistenceContext
    private EntityManager em;


    @Path("{id}")
    @GET
    public Report createReportForTrainer(@PathParam("id") Long id) {
        //check if id 0= root User
        if (id ==  1) {


        } else {
            //special report only for the given trainer

        }

        return null;

    }
}
