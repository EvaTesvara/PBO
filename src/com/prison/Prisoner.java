package com.prison;


public class Prisoner {
    static int prisonerCount = 0; 
    public int bookingNumber;
    public String name; 
    public double height;
    public int sentenceYear;
    public cell prisonerCell;

    Prisoner (String name,double height, int sentenceYear, cell cellName){
        prisonerCount += 1;
        bookingNumber = prisonerCount;
        this.name = name;
        this.height = height;
        this.sentenceYear = sentenceYear; 
        this.prisonerCell = cellName;
    }

    void think (){
        System.out.println("im going to take my revenge!!!");
    }
 

    void displayPrisoner(){
        System.out.println(name);
        System.out.println(height);
        System.out.println(sentenceYear);
        System.out.println("prisoner count : " + bookingNumber);
        System.out.println(prisonerCell.getName());;
    }

    static void dispayStaticPrisoner(){
        System.out.println("static prisoner count : " + prisonerCount);
    }

    void displayPrisoner (boolean revenge){
        this.displayPrisoner();
        think();
    }
}
