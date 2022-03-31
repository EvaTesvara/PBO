
 package com.example;

 public class ShoppingCart {

      public static void main(String[] args) {
          String custName = "Mary Smith";
          String itemDesc = "Shirt";

// 	// // numeric fields
        double price = 21.99;
        int quantity = 6;
        double tax = 1.04;
 	    double total;
 	    String message = custName+" wants to purchase "+quantity+" "+itemDesc;

// 	// // Calculating total cost
          total = (price*quantity)*tax;

        
//         // Declare outOfStock variable and initialize it

        int outOfStock = 5;
        boolean isItOutOfStock = (quantity>outOfStock);
        
//         // Test quantity and modify message if quantity > 1.  
        if(quantity >1){
            message = custName+" wants to purchase "+quantity+" "+itemDesc + "s";
        }
        
//         // Test outOfStock and notify user in either case.  
        if(isItOutOfStock){
            System.out.println("Sorry, the " + itemDesc + " is currently unavailabe, please come again later");
        }else{
            System.out.println(message + "\n total price : " + total);
        }
        
        
    }
    
 }


