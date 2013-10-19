/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package catchatmodel;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Grupp 17
 */
public class Chat extends AbstractDAO<UserAccount, Long> implements IChat{
    String pun;
    
    
    public Chat(String persistenceUnitName) {
        super(UserAccount.class, persistenceUnitName);
        Logger.getAnonymousLogger().log(Level.INFO, "Shop alive {0}", this.hashCode());
    }
    
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
