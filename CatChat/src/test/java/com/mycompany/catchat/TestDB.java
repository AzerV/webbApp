/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.catchat;
import catchatmodel.Chat;
import catchatmodel.IChat;
import catchatmodel.ChatFactory;
import catchatmodel.Message;
import catchatmodel.UserAccount;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
 * Test class for the database
 * @author Grupp 17
 */
public class TestDB {
    IChat chat;
    final static String PU = "catchat_pu";
    final static String TEST_PU = "catchat_test_pu";
    final static String TEST_EMBEDDED_PU="catchat_embedded_test_pu";
    
    @Before // Run before each test
    public void before() {
        chat = ChatFactory.getChat(TEST_EMBEDDED_PU);
    }
   
   //@Test
    public void testAddUser() {
       UserAccount u = new UserAccount("Elina", "Elin");
       chat.add(u);
       chat.add(new UserAccount("Nora", "Nora"));
       assertTrue(chat.getCount() == 2);
    }  
    
    //@Test
    public void testGetRange() {
       chat.add(new UserAccount("Elin", "Elin"));
       chat.add(new UserAccount("Nora", "Nora"));
       chat.add(new UserAccount("Azer", "Azer"));
       chat.add(new UserAccount("Magnus", "Magnus"));
       List<UserAccount> l = chat.getRange(0, 1);
       System.out.println(l.size());
        assertTrue(l.size() == 2);
        assertTrue(l.get(0).getName().equals("Elin"));
    } 
    
   // @Test
    public void testDeleteUser() {
       UserAccount u = new UserAccount("Elin", "Elin");
       chat.add(u);
       chat.add(new UserAccount("Nora", "Nora"));
        assertTrue(chat.getCount() == 2);
        chat.remove(u.getId());
        assertTrue(chat.getCount() == 1);
    } 
   // @Test
     public void testUpdateUser() {
       UserAccount u = new UserAccount("Elin", "Elin");
       chat.add(u);
       UserAccount u2 = new UserAccount(u.getId(), "updated", "password");
        chat.update(new UserAccount(u.getId(), "updated", "password"));
        assertTrue(equals(u2, chat.find(u.getId())));
    } 
     
     //@Test
     public void testFindUser() {
       UserAccount u2 = new UserAccount("aaa", "aaa");
       chat.add(u2);
        UserAccount u1 = chat.find(u2.getId());
        assertTrue(equals(u2, u1));
    } 
    @Test
    public void testGetByName() {
        UserAccount u = new UserAccount("user", "password");
        chat.add(u);
        UserAccount ps = chat.getByName("user");
        assertTrue(ps.getName().equals("user"));
    }
    
    public boolean equals(UserAccount u1, UserAccount u2){
        if((u1.getId()==u2.getId()) &&(u1.getName().equals(u2.getName())) && u1.getPassword().equals(u2.getPassword()) ){
            return true;
        }
        return false;
        
    }
}