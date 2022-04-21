package com.practice;

import java.util.Scanner;

public class ArcadeProgram {
    public static void main (String[] Args){
        card card01 = new card(12345);
        card card02 = new card(98345);

        Terminal terminalArcadeGame = new Terminal();
        game randomTicketGame = new game();
        WhatToDo whatToDo = new WhatToDo();
        Scanner sc = new Scanner (System.in);

        boolean redo = true;
        boolean skip = false;

        do{
            //equip card
            System.out.println("Equip your card : \n 1. card 01 \n 2. card 02");
            int equipCard = sc.nextInt();
            if(equipCard == 1){
                terminalArcadeGame.equipCard(card01);
                randomTicketGame.equipCard(card01);
                System.out.println("card 01 equipped");
                skip = false;
            }else if(equipCard == 2){
                terminalArcadeGame.equipCard(card02);
                randomTicketGame.equipCard(card02);
                System.out.println("card 02 equipped");
                skip = false;
            }else{
                System.out.println("invalid enter");
                skip = true;
            }


            while (skip == false){
                whatToDo.toDoList();
                int toDoListChoice = sc.nextInt();
    
                switch(toDoListChoice){
                    case 1: 
                        terminalArcadeGame.checkCardAndTicketBalance();
                        break;
                    case 2:
                        System.out.println("Transfer credit to : ");
                        System.out.println("1. card 01");
                        System.out.println("2. card 02");
                        int inputTransferCredit = sc.nextInt();
                        if(inputTransferCredit == 1){
                            System.out.println("input transfer amount");
                            int transferAmount = sc.nextInt();
                            terminalArcadeGame.transferCreditBalance(card01, transferAmount);
                            System.out.println("transferred succesfuly");
                        }else if(inputTransferCredit == 2){
                            System.out.println("input transfer amount");
                            int transferAmount = sc.nextInt();
                            terminalArcadeGame.transferCreditBalance(card02, transferAmount);
                        }else{
                            System.out.println("invalid enter");
                            break;
                        }
                        break;
                    case 3:
                        System.out.println("Transfer ticket to : ");
                        System.out.println("1. card 01");
                        System.out.println("2. card 02");
                        int inputTransferTicket = sc.nextInt();
                        if(inputTransferTicket == 1){
                            System.out.println("input transfer amount");
                            int transferAmount = sc.nextInt();
                            terminalArcadeGame.transferTicketBalance(card01, transferAmount);
                            System.out.println("transferred succesfuly");
                        }else if(inputTransferTicket == 2){
                            System.out.println("input transfer amount");
                            int transferAmount = sc.nextInt();
                            terminalArcadeGame.transferTicketBalance(card02, transferAmount);
                        }else{
                            System.out.println("invalid enter");
                            break;
                        }
                        break;
                    case 4:
                        randomTicketGame.play(); break;
                    case 5:
                        System.out.println("top up money amount : ");
                        int inputTopUpMoney = sc.nextInt();
                        terminalArcadeGame.cardTopUp(inputTopUpMoney); break;
                    case 6:
                        terminalArcadeGame.exchangePrize(); break;
                    default :
                        System.out.println("invalid enter"); skip = true;
                }

                skip = true;
            };
            
        
            

            //exit or redo
            System.out.println("do you want to exit? yes/no :");
            sc.nextLine();
            String exit = sc.nextLine();

            if(exit.equals("yes")){
                redo = false;
            }else if(exit.equals("no")){
                redo = true;
            }else{
                System.out.println("invalid input");
                redo = true;
            }

        }while(redo == true);

        sc.close();
}
}
