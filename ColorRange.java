/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ColorRange {

    public static void main(String args[]) {
            Scanner sc = new Scanner (System.in);
            
            System.out.println("Enter a color code : ");
            double waveLength = sc.nextDouble();

            if(waveLength>=380 && waveLength<450){
                System.out.println("The color is Violet");
            }
            else if(waveLength>=450 && waveLength<495){
                System.out.println("The color is Blue");
            }
            else if(waveLength>=495 && waveLength<570){
                System.out.println("The color is Green");
            }
            else if(waveLength>=570 && waveLength<590){
                System.out.println("The color is Yellow");
            }
            else if(waveLength>=590 && waveLength<620){
                System.out.println("The color is Orange");
            }
            else if(waveLength>=620 && waveLength<750){
                System.out.println("The color is Red");
            }
            else {
                System.out.println("The entered wavelength is not a part of visible spectrum");
            }
        }
    }
