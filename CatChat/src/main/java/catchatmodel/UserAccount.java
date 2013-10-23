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
 * UserAccount table in database, has a unique id, a username, a password and a status that can be Online or Offline
 * @author Grupp 17
 */
@Entity
public class UserAccount implements Serializable {
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
    
     /**
     * @param name
     * @param password
     */
    public UserAccount(String name, String password){
        this.name = name;
        this.password = password;
        status = "offline";
    }
        
     /**
     * @param id
     * @param name
     * @param password
     */
    public UserAccount(long id, String name, String password){
        this.id = id;
        this.name = name;
        this.password = password;
        status = "offline";
    }
    
     /**
     * return id
     */
    public long getId(){
        return id;
    }
    
     /**
     * @return password
     */
    public String getPassword(){
        return password;
    }

     /**
     * @return name
     */
    public String getName(){
        return name;
    }
    
     /**
     * @return status
     */
    public String getStatus(){
        return status;
    }
    
     /**
     * @param id
     */
    public void setId(long id){
        this.id = id;
    }

     /**
     * @param password
     */
    public void setPassword(String password){
        this.password = password;
    }
   
     /**
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }
     /**
     * @param status
     */
    public void setStatus(String status){
        this.status = status;
    }
    
}
