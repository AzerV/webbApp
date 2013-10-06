/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package catchatmodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author elikarl
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(nullable = false) 
    private long id;
    private String name;
    private String password;

    public User() {
    }
    
    public User(String name, String password){
        this.name = name;
        this.password = password;
    }
    
    public User(long id, String name, String password){
        this.id = id;
        this.name = name;
        this.password = password;
    }
    
    public long getId(){
        return id;
    }
    
    public String getPassword(){
        return password;
    }
    public String getName(){
        return name;
    }
    
    public void setId(long id){
        this.id = id;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    public void setName(String name){
        this.name = name;
    }
    
}
