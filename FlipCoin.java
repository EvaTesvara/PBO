/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Random;


public class FlipCoin {

    public static void main(String[] args) {

        // 50% chance heads, 50% chance tails
        Random rand = new Random();
        double chance = rand.nextDouble();
        System.out.println(chance);
        if(chance<0.5){
            System.out.println("Head");
        }else{
            System.out.println("Tail");
        }
        
        //rand int 50-55
        int randInt = rand.nextInt(6) + 50;
        System.out.println("random generated integer: " + randInt);
        }
    }

