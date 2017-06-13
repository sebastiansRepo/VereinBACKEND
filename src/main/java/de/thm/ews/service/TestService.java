package de.thm.ews.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by sebb9 on 13.06.2017.
 */
@Path("test")
public class TestService {


    @GET
    public String echoTest() {
        return "Test";
    }

}
