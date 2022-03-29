/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;
import java.util.Scanner;

public class NameMaker {
    
    public static void main(String args[])
    {
        String firstName, middleName, lastName, fullName;
        
        Scanner newScanner = new Scanner(System.in);
        
        System.out.println("Masukkan nama depan : ");
        firstName = newScanner.nextLine();

        System.out.println("Masukkan nama tengah : ");
        middleName = newScanner.nextLine();

        System.out.println("Masukkan nama belakang : ");
        lastName = newScanner.nextLine();

        fullName = firstName + " " + middleName + " " + lastName ; 
        System.out.println("Nama lengkapmu adalah : " + fullName);

        newScanner.close();
    }
    
}
