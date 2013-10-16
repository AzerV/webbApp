package catchatmodel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elikarl
 */
public class ChatFactory {

    private ChatFactory() {
    
    }
    
        // If initTestData there will be some data to use
    public static Chat getChat(String persistenceUnitName) {
        Chat c = new Chat(persistenceUnitName);
        return c;
    }  
}
