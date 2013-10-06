package catchatmodel;

import catchatmodel.Chat;
import java.util.ArrayList;
import java.util.List;

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
    public static Chat getShop(boolean initTestData) {
        Chat c = new Chat();
        if (initTestData) {
            initTestData(c);
        }
        return c;
    }
    
    private static void initTestData(Chat c){
        c.getUserList().add(new User(Long.parseLong("1"), "Elin","a"));
        c.getUserList().add(new User(Long.parseLong("2"), "Nora", "b"));
        c.getUserList().add(new User(Long.parseLong("3"), "Magnus", "c"));
        
        
    }    
}
