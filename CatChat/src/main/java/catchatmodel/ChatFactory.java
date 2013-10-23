
package catchatmodel;
/**
 * Used to create a chat
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
