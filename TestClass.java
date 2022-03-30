/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import javax.swing.JOptionPane;
/**
 *
 * @author anshenoy
 */
public class TestClass {

    public static void main(String args[]) {
        
        ComputeMethods computeMethods = new ComputeMethods();

        Double fahrenheitSuhu = Double.parseDouble(JOptionPane.showInputDialog(null, "masukkan suhu dalam fahrenheit "));
        JOptionPane.showMessageDialog(null, fahrenheitSuhu + " derajat fahrenheit = " + computeMethods.FToC(fahrenheitSuhu) + " derajat celcius");

        
        int sisiA = Integer.parseInt(JOptionPane.showInputDialog(null, "masukkan sisi a dari segitiga siku-siku"));
        int sisiB = Integer.parseInt(JOptionPane.showInputDialog(null, "masukkan sisi b dari segitiga siku-siku"));
        JOptionPane.showMessageDialog(null, "sisi c dari segitiga siku-siku tersebut adalah : " + computeMethods.hypotenuse(sisiA, sisiB));

        
        computeMethods.penjumlahanDuaDadu();
        //Create an instance of ComputeMethods, 
        //invoke the 3 methods and dispay their results
    }
}
