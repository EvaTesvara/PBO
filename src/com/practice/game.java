package com.practice;
import java.util.Random;

public class game{
    card gameCard;
    private int randomTicketObtained;

    Random randNum = new Random();

    void equipCard(card cardNumber){  //insert nomor kartu
        this.gameCard = cardNumber;
    }

    void play(){
        if(this.gameCard.getCreditBalance() >= 10){  //mesin berjalan bila kredit > 5
            gameCard.setCreditBalance(gameCard.getCreditBalance() - 10);//min 10 setiap permainan
            randomTicketObtained = randNum.nextInt(51) + 1; //ekstrak rand dan store ke randomTicketObtained
            gameCard.setTicketBalance(gameCard.getTicketBalance() + randomTicketObtained); //ticket balance kartu + tiket balance yang didapat
            System.out.println("You've got " + randomTicketObtained + " ticket/tickets");
        }else if(this.gameCard.getCreditBalance() < 10){
            System.out.println("This card has insufficient credit to play a game");
        }
    }
    
}