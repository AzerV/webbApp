/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package catchatmodel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Elin
 */
public class ChatRoom {
    private List<Message> elems;
    
    public ChatRoom(){
        elems = new ArrayList<Message>();
    }

    public void add(Message m) {
        if (m == null) {
            throw new IllegalArgumentException("Nulls not allowed");
        }
        elems.add(m);
    }
    
    public List<Message> getRange(int first, int nItems) {
        return elems.subList(first, first + nItems);
    }
    public List<Message> getAll() {
        return elems;
    }

    public int getCount() {
        return elems.size();
    }
    
}
