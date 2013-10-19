/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package catchatbb;

import catchatmodel.ChatFactory;
import catchatmodel.IChat;
import catchatmodel.UserAccount;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import security.PasswordHash;

/**
 * Registers a new user
 * @author Grupp 17
 */
@Named("addUser")
@RequestScoped
public class AddUserBB {
    @NotNull
    @Size(min=1, max=15, message="Username must be 1-15 characters")
    private String username;
    @NotNull
    @Size(min=7, max=15, message="Password must be 7-15 characters")
    private String password;
    final static String PU = "catchat_pu";
    private IChat chat;
    
    /**
     * If no useraccount with same username already exists, a new useraccount
     * is created and added to the chat DB.
     * 
     * @return navigation strings
     */
    public String register() {
        chat = ChatFactory.getChat(PU);
        if(chat.getByName(username)==null){
            try{UserAccount user = new UserAccount(username, PasswordHash.createHash(password));
                  
            chat.add(user);
            return "REGISTER_SUCCESS";
            }
            catch(Exception e){
               return "EXCEPTION" ;
            }
        }
        else{
            FacesContext.getCurrentInstance().addMessage("takenUsername", new FacesMessage("ERROR: Username already taken."));
            return "REGISTER_FAIL";
        } 
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void checkUser(){
        
        
        
    }
}
