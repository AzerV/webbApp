/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package catchatmodel;

/**
 *
 * @author elikarl
 */
public class User {
    private Double id;
    private String name;
    private String password;
    
    public User(Double id, String name, String password){
        this.id = id;
        this.name = name;
        this.password = password;
    }
    
    public Double getId(){
        return id;
    }
    
    public String getPassword(){
        return password;
    }
    public String getName(){
        return name;
    }
    
}
