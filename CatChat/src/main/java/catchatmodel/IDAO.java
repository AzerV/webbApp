/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package catchatmodel;

import java.util.List;

/**
 * Interface to AbstractDAO
 * T is type of elements in container
 * K is type of id (primary key)
 * Grupp 17
*/
public interface IDAO<T,K> {
    
    public void add(T t);
    
    public void remove(K id);
    
       public T update(T t);
       
       public T find(K id);
       
       public List<T> getRange(int first, int nItems);
       
       public int getCount();
    
}
