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
public class UserAccount implements Serializable,IUserAccount {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(nullable = false) 
    private long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String status;

    public UserAccount() {
    }
    
    public UserAccount(String name, String password){
        this.name = name;
        this.password = password;
        status = "offline";
    }
    
    public UserAccount(long id, String name, String password){
        this.id = id;
        this.name = name;
        this.password = password;
        status = "offline";
    }
    
    @Override
    public long getId(){
        return id;
    }
    @Override
    public String getPassword(){
        return password;
    }
    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public String getStatus(){
        return status;
    }
    
    @Override
    public void setId(long id){
        this.id = id;
    }
    
    @Override
    public void setPassword(String password){
        this.password = password;
    }
    @Override
    public void setName(String name){
        this.name = name;
    }
    
    @Override
    public void setStatus(String status){
        this.status = status;
    }
    
}
