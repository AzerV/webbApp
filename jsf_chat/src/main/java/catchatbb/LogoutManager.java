
/**
 *
 * @author Azer/*
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
@Named("logoutUser")
@SessionScoped
public class LogoutManager implements Serializable {
    private String username;
    private Chat chat;
    
    public String logout() {   
        chat = ChatFactory.getChat(PU);
        this.username = LoginManager.username;
        UserAccount user = getByName(username);
        
        if(user != null){
            user.setStatus("offline");
            chat.update(user);
            return "LOGOUT_SUCCESS";
        }
        else
            return "LOGOUT_FAIL";
    }
    
    public UserAccount getByName(String name) {
        UserAccount found = null;
        for (UserAccount u : chat.getRange(0, chat.getCount())) {
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
}

