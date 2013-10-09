/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package catchatbb;

import static catchatbb.AddUserBB.PU;
import catchatmodel.Chat;
import catchatmodel.ChatFactory;
import catchatmodel.UserAccount;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

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
        UserAccount user = chat.getByName(username);
        if(user != null){
            user.setStatus("online");
            chat.update(user);
            return "LOGIN_SUCCESS";
        }
        else
            return "LOGIN_FAIL";
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
