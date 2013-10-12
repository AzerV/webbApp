/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import catchatmodel.Chat;
import catchatmodel.ChatFactory;
import catchatmodel.UserAccount;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Högerklicka på RESTful>HTTP Methods>getOnlineUsers()>Test Resource Uri
 * 
 * @author Nora
 */
@Path("onlineUsers")
public class UserResource {
    private Chat chat;
    private List<UserAccount> onlineUserList;
    final static String PU = "catchat_pu";
    
    @GET
    @Path("users")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response getOnlineUsers() {
        
        onlineUserList = new ArrayList<UserAccount>();
        chat = ChatFactory.getChat(PU);
 
        for (UserAccount u : chat.getRange(0, chat.getCount())) {
            if (u.getStatus().equals("online")) {
                onlineUserList.add(u);
            }
        }
        return Response.ok(onlineUserList).build();
    }
}
