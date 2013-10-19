/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package catchatmodel;


/**
 *
 * @author Grupp 17
 */
public class ChatFactory {

    private ChatFactory() {
    
    }
    
    /**
     * If initTestData there will be some data to use
     * @param persistenceUnitName
     * @return 
     */
    public static IChat getChat(String persistenceUnitName) {
        Chat c = new Chat(persistenceUnitName);
        return c;
    }  
}
