/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package catchatmodel;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class is used to access the database 
 * @author Grupp 17
 */
public class Chat extends AbstractDAO<UserAccount, Long> implements IChat{
    String pun;

     /**
     * @param persistenceUnitName
     */
    public Chat(String persistenceUnitName) {
        super(UserAccount.class, persistenceUnitName);
        Logger.getAnonymousLogger().log(Level.INFO, "Chat alive {0}", this.hashCode());
    }
    
 /**
 * Gets a user by name. 
 * @param name
 * @return found
 * @author Grupp 17
 */
    
   @Override
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
