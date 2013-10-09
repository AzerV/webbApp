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
    private List<UserAccount> elems;
    
    public UserEntity(){
        elems = new ArrayList<UserAccount>();
    }

    public void add(UserAccount t) {
        if (t == null) {
            throw new IllegalArgumentException("Nulls not allowed");
        }
        elems.add(t);
    }

    public void remove(String id) {
        UserAccount t = find(id);
        if (t != null) {
            elems.remove(t);
        }
    }

    public void update(UserAccount t) {
        UserAccount old = find(t.getName());
        if (old != null) {
            elems.remove(old);
        }
        elems.add(t);
    }

    public UserAccount find(String name) {
        for (UserAccount t : elems) {
            if (t.getName().equals(name)) { // NOTE: equals, not ==
                return t;
            }
        }
        return null;
    }

    public List<UserAccount> getRange(int first, int nItems) {
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
