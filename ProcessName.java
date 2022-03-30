/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processingname;

import java.util.Scanner;

public class ProcessName {
    
    
public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int nameIndex;
        int nameLength;
        char firstNameChar;
        String lastName;

        System.out.print("Enter your full name: ");
        String fullName = console.nextLine();

        nameIndex = fullName.indexOf(" ");
        nameLength = fullName.length();
        firstNameChar = fullName.charAt(0);
        lastName = fullName.substring(nameIndex, nameLength);

        System.out.println("Welcome Mr/Mrs " + lastName + ", " + firstNameChar + ".");

        console.close();
        // your code goes here
        
        
    }
}