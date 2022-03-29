package com.exersice;

import javax.swing.JOptionPane;

public class Section3Practice {
    
    public static void main (String args[])
    {
        String namaKarakter = JOptionPane.showInputDialog(null, "Masukkan nama karakter");
        String makananKesukaan = JOptionPane.showInputDialog(null, "Apa makanan yang diinginkan " + namaKarakter + "?");
        String porsiMakanan = JOptionPane.showInputDialog(null, "Berapa porsi " + makananKesukaan + " yang diinginkan? ");
        String hargaMakanan = JOptionPane.showInputDialog(null, "Berapa harga " + makananKesukaan + " per porsi?");
        

        int porsiMakananInt = Integer.parseInt(porsiMakanan);
        int hargaMakananInt = Integer.parseInt(hargaMakanan);
        Double pajak = 0.02;
        Double totalPajak = porsiMakananInt*hargaMakananInt*pajak;
        
        JOptionPane.showMessageDialog
        (null, namaKarakter + " memesan " + makananKesukaan + " sebanyak " + porsiMakanan + " \ndengan harga satuan " + hargaMakanan +
        " dan dikenai pajak sebesar 2% , total harga yang harus dibayar : " + ((porsiMakananInt * hargaMakananInt) + totalPajak));
      

    }
}
