package catchatmodel;

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
public class UserEntity {
    private List<Username> elems;
    
    public UserEntity(){
        elems = new ArrayList<Username>();
    }

    public void add(Username t) {
        if (t == null) {
            throw new IllegalArgumentException("Nulls not allowed");
        }
        elems.add(t);
    }

    public void remove(String id) {
        Username t = find(id);
        if (t != null) {
            elems.remove(t);
        }
    }

    public void update(Username t) {
        Username old = find(t.getName());
        if (old != null) {
            elems.remove(old);
        }
        elems.add(t);
    }

    public Username find(String name) {
        for (Username t : elems) {
            if (t.getName().equals(name)) { // NOTE: equals, not ==
                return t;
            }
        }
        return null;
    }

    public List<Username> getRange(int first, int nItems) {
        // From inclusive, to exclusive
        return elems.subList(first, first + nItems);
    }

    public int getCount() {
        return elems.size();
    }

    /**
    public void sort(Comparator<User> comp) {
        Collections.sort(elems, comp);
    }
    */
}
