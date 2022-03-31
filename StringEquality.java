/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author anshenoy
 */

import java.util.Scanner;
public class StringEquality {

    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("input name");
    String name = sc.nextLine();

    boolean king = (name.equals("moe"));

    if(king){
       System.out.println("YOU ARE THE KING OF ROCK AND ROLL!!!");
    }else{
       System.out.println("you are not the king");
    }
    
   sc.close();
}

}