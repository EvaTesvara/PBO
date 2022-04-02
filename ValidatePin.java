/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        
        int validPin = 12345678;

        Scanner enterPin = new Scanner (System.in);
        System.out.println("Enter your pin : ");
        int userPin = enterPin.nextInt();

        while(userPin != validPin){
            System.out.println("Pin is not correct, please re-enter your pin : ");
            userPin = enterPin.nextInt();
        }

        System.out.println("Pin is correct, now you can access your account");
    }
}
