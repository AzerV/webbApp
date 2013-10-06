/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package catchatbb;

import catchatmodel.Chat;
import catchatmodel.Username;
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
    
    private Chat chat;
    
    public void register() {        
        Username user = new Username(username, password);
        System.out.println(user.getName());
        System.out.println(user.getPassword());
        
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
