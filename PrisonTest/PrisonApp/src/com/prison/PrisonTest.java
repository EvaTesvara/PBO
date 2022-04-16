package com.prison;


public class PrisonTest {
    public static void main(String[] args) {

        cell cell01 = new cell ("cell 01", true, 1234);
        cell cell02 = new cell ("cell 02", false, 4321);
        Prisoner bubba = new Prisoner("bubba", 2.08, 4, cell01);
        Prisoner twitch = new Prisoner("twitch", 1.73 , 3, cell02);

        bubba.displayPrisoner();
        System.out.println();
        twitch.displayPrisoner();
   
        
        System.out.println();
        
        System.out.println("cell 01 door is " + cell01.getIsDoorOpen() + " open");
        System.out.println("cell 02 door is " + cell02.getIsDoorOpen() + " open");

        cell01.setDoor(1234);
        cell02.setDoor(4321);

        System.out.println("cell 01 door is " + cell01.getIsDoorOpen() + " open");
        System.out.println("cell 02 door is " + cell02.getIsDoorOpen() + " open");

        cell01.setDoor(1234);
        cell02.setDoor(1234);
        
        System.out.println("cell 01 door is " + cell01.getIsDoorOpen() + " open");
        System.out.println("cell 02 door is " + cell02.getIsDoorOpen() + " open");

    }
}
