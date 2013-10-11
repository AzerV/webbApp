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
    private static String author;
    private Message m2;
    
    public void addMessage(){
        chat = ChatFactory.getChat(PU);
        m2 = new Message(LoginManager.username, content);
        chat.getChatRoom().add(m2);    
    }
    
    public List<Message> getAll() {
        if(chat.getChatRoom().getAll()==null){
            chat.getChatRoom().add(new Message(" "," ")); 
        }
        return chat.getChatRoom().getAll();
    }
    
    public String getmessage() {
        if(m2==null){
            return "";
        }
        Message m = new Message(LoginManager.username, "Hej hej");
        String s = m2.getAuthor()+": "+m2.getContent();
        
        return s;
    }
    public void ok(){
        
    }
    
     public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
}
