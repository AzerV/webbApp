/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package catchatmodel;

import java.util.List;

/**
*Interface for DAO
*/
public interface IDAO<T,K> {
    
    public void add(T t);
    
    public void remove(K id);
    
       public T update(T t);
       
       public T find(K id);
       
       public List<T> getRange(int first, int nItems);
       
       public int getCount();
    
}
