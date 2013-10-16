/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package catchatmodel;

/**
 *
 * @author magnu_000
 */
interface IUserAccount {
    
   
    public long getId();
 
    public String getPassword();

    public String getName();
 
    public String getStatus();

    public void setId(long id);
 
    public void setPassword(String password);
    
    public void setName(String name);
  
    public void setStatus(String status);

    
}
