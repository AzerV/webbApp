/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package catchatbb;

import static catchatbb.AddUserBB.PU;
import catchatmodel.ChatFactory;
import catchatmodel.IChat;
import catchatmodel.UserAccount;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Manages login and logout functions
 * @author Grupp 17
 */
@Named("status")
@SessionScoped
public class StatusManager implements Serializable {
    private String username;
    private String password;
    private IChat chat;
    
     @Inject
    private MessageManager messageManager;
    
    /**
     * Changes useraccount-status to online and forwards to chatroom.xhtml if the
     * useraccount is found in database.
     * 
     * @return navigation strings
     */
    public String login() {   
        chat = ChatFactory.getChat(PU);
        UserAccount user = chat.getByName(username);
        try {
            if((user != null) && security.PasswordHash.validatePassword(password, user.getPassword())){
                user.setStatus("online");
                chat.update(user);
                messageManager.setAuthor(username);
                return "LOGIN_SUCCESS";
            }
            else{
                FacesContext.getCurrentInstance().addMessage("loginFail", new FacesMessage("ERROR: Failed to login."));
                return "LOGIN_FAIL";
            }
        }catch(Exception e){
            return "EXCEPTION";
        }
    }
    
    /**
     * Changes useraccount-status to offline and forwards to index.xhtml if the
     * useraccount is found in database.
     * 
     * @return navigation strings
     */
    public String logout() {   
        chat = ChatFactory.getChat(PU);
        UserAccount user = chat.getByName(username);
        
        if(user != null){
            user.setStatus("offline");
            chat.update(user);
            return "LOGOUT_SUCCESS";
        }
        else
            return "LOGOUT_FAIL";
    }
    
     /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

     /**
     * @param username
     * 
     */
    public void setUsername(String username) {
        this.username = username;
    }
   
    /**
     * @return password
     * 
     */
    public String getPassword() {
        return password;
    }
    
     /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
     /**
     * @param messageManager
     */
       public void setMessageBean(MessageManager messageManager) {
        this.messageManager = messageManager;
    }
}