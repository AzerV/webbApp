/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package catchatmodel;

/**
 *Interface to Chat
 * @author Grupp 17
 */
public interface IChat extends IDAO<UserAccount,Long>{
     public UserAccount getByName(String name);
    
}
