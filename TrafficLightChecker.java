/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;
import java.util.Scanner;

public class TrafficLightChecker {

    public static void main(String args[]) {
        Scanner input = new Scanner (System.in);

        System.out.println("input current color in number (red = 1, green = 2, yellow = 3) : ");
        int currentColor = input.nextInt();
        String color1 = "Red";
        String color2 = "Green";
        String color3 = "Yellow";

        if(currentColor == 1 ){
            System.out.println("Next traffic light is "+ color2);
        }else if(currentColor == 2){
            System.out.println("Next traffic light is "+ color3);
        }else if(currentColor == 3){
            System.out.println("Next traffic light is "+ color1);
        }else{
            System.out.println("invalid color");
        }

        input.close();
    }

}
