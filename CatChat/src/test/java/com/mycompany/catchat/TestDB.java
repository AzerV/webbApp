/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.catchat;

import catchatmodel.Chat;
import catchatmodel.ChatFactory;
import catchatmodel.Username;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
 *
 * @author Elin
 */
public class TestDB {
    //static IShop shop;
    static Chat chat;
    final static String PU = "catchat_pu";
    
    final static String TEST_PU = "catchat_test_pu";

    @Before // Run before each test
    public void before() {
        //shop = JPAShopFactory.getShop(PU);
        chat = ChatFactory.getChat(TEST_PU);
    }
    
    
    @Test
    public void testAddUser() {
        
       Username u = new Username("elin", "elin");
        
        //IProductCatalogue pc = shop.getProductCatalogue();
       chat.add(u);
       chat.add(new Username("Nora", "Nora"));
        
          //  pc.add(new Product(String.valueOf(i), i));
        
       List<Username> l = chat.getRange(0, 1);
        //System.out.println(ps.size());
        //System.out.println(ps
       System.out.println(l.size());
        assertTrue(l.size() == 2);
    }   
}
