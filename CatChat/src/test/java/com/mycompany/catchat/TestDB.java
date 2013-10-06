/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.catchat;

import catchatmodel.User;
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
    final static String PU = "catchat_pu";

    @Before // Run before each test
    public void before() {
        //shop = JPAShopFactory.getShop(PU);
    }
    
    
    @Test
    public void testAddUser() {
        
       User u = new User("elin", "elin");
        
        //IProductCatalogue pc = shop.getProductCatalogue();
        
        for( int i = 0; i < 10 ; i++){
          //  pc.add(new Product(String.valueOf(i), i));
        }
       // List<Product> ps = pc.getRange(2, 3);
        //System.out.println(ps.size());
        //System.out.println(ps);
        //assertTrue(ps.size() == 2);
    }   
}
