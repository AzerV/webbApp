/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package catchatmodel;

import java.io.Serializable;
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
public class Username implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(nullable = false) 
    private long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String password;

    public Username() {
    }
    
    public Username(String name, String password){
        this.name = name;
        this.password = password;
    }
    
    public Username(long id, String name, String password){
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
