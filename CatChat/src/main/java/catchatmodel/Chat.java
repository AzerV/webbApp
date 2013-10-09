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
    
    public Chat(String persistenceUnitName) {
        super(UserAccount.class, persistenceUnitName);
        // pun = persistenceUnitName;
        Logger.getAnonymousLogger().log(Level.INFO, "Shop alive {0}", this.hashCode());
    
    }

    
    public UserEntity getUserList(){
        return ue;
    }
    
}
