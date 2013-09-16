package org.elikarl.catchatmodel;

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
public class Contacts extends UserEntity {
    
    
    public Contacts(){
        super();
    }
    
    public void addContact(String name){
        add(find(name));
    }
    
}
