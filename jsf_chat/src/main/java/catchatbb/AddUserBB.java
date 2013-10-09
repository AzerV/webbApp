/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package catchatbb;

import catchatmodel.Chat;
import catchatmodel.ChatFactory;
import catchatmodel.UserAccount;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Nora
 */
@Named("addUser")
@RequestScoped
public class AddUserBB {
    @NotNull
    private String username;
    @NotNull
    private String password;
    final static String PU = "catchat_pu";
    private Chat chat;
    
    public void register() {        
        UserAccount user = new UserAccount(username, password);
        chat = ChatFactory.getChat(PU);
        chat.add(user);
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
}
