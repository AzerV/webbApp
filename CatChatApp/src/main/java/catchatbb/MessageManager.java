/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package catchatbb;

import javax.inject.Named;
import catchatmodel.Message;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;


/**
 * Manage messages from the chat
 * @author Grupp 17
 */
@Named("message")
@SessionScoped
public class MessageManager implements Serializable{
    private String content;
    private String author;
    private Message newMess;
    private static List<Message> MessageList;
    
    public MessageManager(){
        
    }
    /**
     * Adds a message to the list
     */
    public void addMessage(){
        if(MessageList == null){
            MessageList = new ArrayList<Message>();
        }
        newMess = new Message(author, content);
        MessageList.add(newMess);
        content="";
    }
    /**
     * 
     * @return the list with messages 
     */
    public List<Message> getAll() {
        if(MessageList == null){
            MessageList= new ArrayList<Message>();
        }        
        return MessageList;
    }
     /**
     * @return content
     */
     public String getContent() {
        return content;
    }

      /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

     /**
     * @return author
     */
    public String getAuthor() {
        return author;
    }

     /**
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
    }
        
     /**
     * @return the time the message was created
     */
    public String getTime() {
        return newMess.getTime();
	}
 }

