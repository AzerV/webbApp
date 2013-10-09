package catchatmodel;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elikarl
 */
public class Chat extends AbstractDAO<UserAccount, Long>{
    UserEntity ue;
    String pun;
    ChatRoom chatRoom;
    
    public Chat(String persistenceUnitName) {
        super(UserAccount.class, persistenceUnitName);
        // pun = persistenceUnitName;
        Logger.getAnonymousLogger().log(Level.INFO, "Shop alive {0}", this.hashCode());
        chatRoom = new ChatRoom();
    }
    public ChatRoom getChatRoom(){
        return chatRoom;
    }

    
    public UserEntity getUserList(){
        return ue;
    }
    
     public UserAccount getByName(String name) {
        UserAccount found = null;
        for (UserAccount u : getRange(0, getCount())) {
            if (u.getName().equals(name)) {
                found = u;
            }
        }
        return found;
    }
    
}
