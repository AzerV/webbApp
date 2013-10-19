/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import catchatmodel.ChatFactory;
import catchatmodel.IChat;
import catchatmodel.UserAccount;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Returns an array containing all online users
 * 
 * @author Greupp 17
 */
@Path("onlineUsers")
public class UserResource {
    private IChat chat;
    private List<String> onlineUserList;
    final static String PU = "catchat_pu";
    
    /**
     * Returns an array containing all online users
     * @return 
     */
    @GET
    @Path("users")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response getOnlineUsers() {
        
        onlineUserList = new ArrayList<String>();
        chat = ChatFactory.getChat(PU);
 
        for (UserAccount u : chat.getRange(0, chat.getCount())) {
            if (u.getStatus().equals("online")) {
                onlineUserList.add(u.getName());
            }
        }
        return Response.ok(onlineUserList).build();
    }
}
