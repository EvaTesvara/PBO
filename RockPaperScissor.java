/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;
import java.util.Random;
import java.lang.Math;

public class RockPaperScissor {

    public static void main(String[] args) {
        
        Random randAngka = new Random ();

        int randNum = randAngka.nextInt(3) + 1;
        System.out.println(randNum);
        
        if(randNum == 1){
            System.out.println("Paper");
        }else if(randNum == 2){
            System.out.println("Scissor");
        }else{
            System.out.println("Rock");
        }

        System.out.println(Math.abs(-1.23));
        System.out.println(Math.pow(3,2));
        System.out.println(Math.sqrt(121.0) - Math.sqrt(256.0));
        System.out.println(Math.abs(Math.min(-3, -5)));
    
    }
}
