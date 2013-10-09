/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package catchatbb;

import javax.inject.Named;
import static catchatbb.AddUserBB.PU;
import catchatmodel.Chat;
import catchatmodel.ChatFactory;
import catchatmodel.Message;
import catchatmodel.UserAccount;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author Elin
 */
@Named("message")
@SessionScoped 
public class MessageManager implements Serializable{
    private Chat chat;
    private String content;
    //private UserAccount author;
    private String author;
    
    public void addMessage(){
        //chat = ChatFactory.getChat(PU);
      //  chat.getChatRoom().add(new Message(author, content));    
    }
    
    public List<Message> getAll() {
        List<Message> m = new ArrayList<Message>();
        return chat.getChatRoom().getAll();
    }
    public String getmessage() {
        return "Här är ett meddelande";
    }
    public void ok(){
        
    }
    
}
