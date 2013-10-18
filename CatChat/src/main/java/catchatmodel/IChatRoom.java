/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package catchatmodel;

import java.util.List;

/**
 *
 * @author Grupp 17
 */
public interface IChatRoom {
    
   
    public void add(Message m);

    public List<Message> getRange(int first, int nItems);

    public List<Message> getAll();

    public int getCount();

    
    
}
