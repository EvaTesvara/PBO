/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalex;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class WatchMovie {

    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter the movie ticket price \n");
        int ticketPrice = sc.nextInt();

        System.out.println("Enter the movie rating");
        int movieRating = sc.nextInt();

        if((ticketPrice<12) && (movieRating==5)){
            System.out.println("I'm interested in watching the movie");
        }else{
            System.out.println("I'm not interested in watching the movie");
        }

        sc.close();

    }
}
