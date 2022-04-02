/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
       
        Scanner inputNumber = new Scanner (System.in);

        System.out.println("Enter a number : ");
        int enterNumber = inputNumber.nextInt();

        for(int i = 0; i <= 12 ; i++){
            System.out.println("multiples of " + enterNumber + " and " + i + " = " + (enterNumber * i));
        }

        inputNumber.close();
    }

}
