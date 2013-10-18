/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package catchatmodel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Grupp 17
 */
public class ChatRoom implements IChatRoom {
    private List<Message> elems;
    
    public ChatRoom(){
        elems = new ArrayList<Message>();
    }

    @Override
    public void add(Message m) {
        if (m == null) {
            throw new IllegalArgumentException("Nulls not allowed");
        }
        elems.add(m);
    }
    
    @Override
    public List<Message> getRange(int first, int nItems) {
        return elems.subList(first, first + nItems);
    }
    @Override
    public List<Message> getAll() {
        return elems;
    }

    @Override
    public int getCount() {
        return elems.size();
    }
    
}
