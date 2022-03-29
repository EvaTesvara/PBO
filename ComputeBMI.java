/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;


import java.util.Scanner;
import java.lang.Math;

public class ComputeBMI {
    public static void main(String[] args)
	{
            Scanner TB = new Scanner(System.in);
            Scanner BB = new Scanner(System.in);

            System.out.println("Berapa tinggi badan Anda?(inci)");
            Double tinggiBadan = TB.nextDouble();
            System.out.println("Berapa berat badan Anda?(pounds)");
            Double beratBadan = BB.nextDouble();

            Double BMI = beratBadan / (Math.pow(tinggiBadan,2)) * 703;
            System.out.println("BMI Anda : " + BMI);
            System.out.println("BMI Anda setelah dibulatkan : " + Math.round(BMI));
        
        }
}
