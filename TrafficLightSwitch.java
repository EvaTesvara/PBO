
package com.example;
import java.util.Scanner;


public class TrafficLightSwitch {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("input a color in number (red = 1, green = 2, yellow = 3");
        int currentColor = input.nextInt();

        switch(currentColor){
            case 1 : 
            System.out.println("Next traffic light is green");
            break;
            case 2 : 
            System.out.println("Next traffic light is yellow");
            break;
            case 3 :
            System.out.println("Next traffic light is red");
            break;
            default : 
            System.out.println("invalid color");
        }

        input.close();
       
    }

}
