/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

/**
 *
 * @author 17salvadorj
 */
public class storestore 
{
   String name;
   String location;
   String owner;
   String pnum;
   
   public class Item
   {
       String iname;
       String desc;
       double price;
       int stock;
       
       public Item()
       {
           iname = "Product";
           desc = "Product product is the best product for all your product needs";
           price = .99;
           stock = 100;
           
       }
       
       public Item(String a, String b, double c, int d)
       {
           iname = a;
           desc = b;
           price = c;
           stock = d;
           
       } 
       
   
   }
   
   Item item[];
   
   
   
    public storestore()
    {
        name = "Store";
        location = "001 Location Ave , Location City 12345";
        owner = "Owning O, Owner";
        pnum = "123-456-7890";
        
        Item genesis = new Item(); 
       
        item[1] = genesis;
        item[2] = genesis;
        item[3] = genesis;
        item[4] = genesis;
        item[5] = genesis;
    }
    
    public storestore(String a, String b, String c, String d, Item[] e)
    {
        name = a;
        location = b;
        owner = c;
        pnum = d;
                
    }
}
