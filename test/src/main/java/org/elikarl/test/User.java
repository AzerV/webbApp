package org.elikarl.test;


/**
 *
 * @author elikarl
 */
public class User {
    String name;
    String password;
    
    public User(String name, String password){
        this.name = name;
        this.password = password;
    }
    
    private String getPasszord(){
        return password;
    }
    private String getName(){
        return name;
    }
    private void hej(){
        int a =0;
    }
    
}
