/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package catchatmodel;

/**
 *
 * @author magnu_000
 */
public interface IChat extends IDAO<UserAccount,Long>{
     public IChatRoom getChatRoom();
     public UserAccount getByName(String name);
    
}
