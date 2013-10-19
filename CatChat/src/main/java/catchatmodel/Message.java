/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package catchatmodel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Class that creates messages with time and author
 * @author Grupp 17
 */
public class Message {
    
    private String author;
    private String content;
    private DateFormat time = new SimpleDateFormat("HH:mm:ss");
    private Date date = Calendar.getInstance().getTime();

    public  Message(String author, String content) {
            this.author = author;
            this.content = content;
    }
    /**
     * 
     * @return the name of the author
     */
    public String getAuthor() {
            return author;
    }

    /**
     * 
     * @return the content of the message 
     */
    public String getContent() {
            return content;
    }

    /**
     * 
     * @return the current time
     */
    public String getTime() {
            return time.format(date);
    }
}