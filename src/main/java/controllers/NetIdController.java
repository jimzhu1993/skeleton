package controllers;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("")
@Produces({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON})
public class NetIdController {
    @Path("/netid")
    @GET
    public String getNetId() {
        return "yz2329";
    }

    @Path("")
    @GET
    public String getIndex() {
        return "yz2329";
    }
}
