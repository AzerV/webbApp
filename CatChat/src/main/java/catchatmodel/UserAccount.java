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
 *UserAccount table in databse, has a unique id, a username, a password and a status that can be Online or Offline
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
    
    /**
    * 
    * @return Returns the unique id of a user 
    */
    public long getId(){
        return id;
    }
    /**
     * 
     * @return Returns the password of a user 
     */

    public String getPassword(){
        return password;
    }

    /**
     * 
     * @return Returns the name of a user
     */
    public String getName(){
        return name;
    }
    
  /**
   * 
   * @return Returns the current status of a user, Online or Offline
   */
    public String getStatus(){
        return status;
    }
    
   /**
    * Sets a unique id to the user
    * @param id 
    */
    public void setId(long id){
        this.id = id;
    }

    /**
     * Sets the choosen password to the user
     * @param password 
     */
    public void setPassword(String password){
        this.password = password;
    }
   /**
    * Sets the choosen name to the user
    * @param name 
    */
    public void setName(String name){
        this.name = name;
    }
    
  /**
   * Sets the current status to a User Online or Offline
   * @param status 
   */
    public void setStatus(String status){
        this.status = status;
    }
    
}
