/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Random;
import javax.swing.JOptionPane;
import java.lang.Math;

public class ComputeMethods {
    
    double FToC (double degreesF){
        Double outputCelcius = (5d/9d * (degreesF - 32.0));
        return outputCelcius;
    }

    double hypotenuse (int a, int b){
        Double sisiC = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
        return sisiC;
    }
    
    void penjumlahanDuaDadu(){

        Random randDadu = new Random();

        JOptionPane.showMessageDialog(null, "ini adalah program pengocokan dua dadu dan menjumlahkan keduanya.");
       
        JOptionPane.showMessageDialog(null, "kocok dadu 1");
        int daduSatu = randDadu.nextInt(6) + 1;
        JOptionPane.showMessageDialog(null, "hasil dari pengocokan dadu 1 adalah " + daduSatu);

        JOptionPane.showMessageDialog(null, "kocok dadu 2");
        int daduDua = randDadu.nextInt(6)+ 1 ;
        JOptionPane.showMessageDialog(null, "hasil dari pengocokan dadu 2 adalah " + daduDua);

        int hasilJumlahDadu = (daduSatu + daduDua);
        JOptionPane.showMessageDialog(null, "hasil dari penjumlahan dadu satu (" + daduSatu + ") dan dadu dua (" + daduDua + ") adalah " + hasilJumlahDadu);
    }
}

