/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package catchatbb;

import static catchatbb.AddUserBB.PU;
import catchatmodel.Chat;
import catchatmodel.ChatFactory;
import catchatmodel.Username;
import java.awt.Component;
import java.io.Serializable;
import java.security.Provider.Service;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.inject.Scope;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Nora
 */
@Named("loginUser")
@SessionScoped
public class LoginManager implements Serializable {
    private String username;
    private String password;
    private Chat chat;
    
    public String login() {   
        chat = ChatFactory.getChat(PU);
        Username user = getByName(username);
        if(user != null){
            return "LOGIN_SUCCESS";
        }
        else
            return "LOGIN_FAIL";
    }
    
    public Username getByName(String name) {
        Username found = null;
        for (Username u : chat.getRange(0, chat.getCount())) {
            if (u.getName().equals(name)) {
                found = u;
            }
        }
        return found;
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
