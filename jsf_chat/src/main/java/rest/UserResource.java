/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Nora
 */
@Path("users")
public class UserResource {

    @Path("hello")
    @Produces({MediaType.TEXT_PLAIN})
    public String test() {
        return "Yo!";
    }
}