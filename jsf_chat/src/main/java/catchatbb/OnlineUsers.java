/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package catchatbb;

import static catchatbb.AddUserBB.PU;
import catchatmodel.Chat;
import catchatmodel.ChatFactory;
import catchatmodel.UserAccount;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Nora
 */

public class OnlineUsers {
    private Chat chat;
    private List<UserAccount> onlineUserList;
    
    public List<UserAccount> getByStatus(String status) {
        onlineUserList = new ArrayList<UserAccount>();
        chat = ChatFactory.getChat(PU);
 
        for (UserAccount u : chat.getRange(0, chat.getCount())) {
            if (u.getStatus().equals(status)) {
                onlineUserList.add(u);
            }
        }
        return onlineUserList;
    }
}
