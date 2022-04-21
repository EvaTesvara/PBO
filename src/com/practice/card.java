package com.practice;

public class card {
    private int creditBalance;
    private int ticketBalance;
    private int cardNumber;

    card(int cardNumber){
        this.cardNumber = cardNumber;
    }
    
    int getTicketBalance(){
        return ticketBalance;
    }

    int getCreditBalance(){
        return creditBalance;
    }

    int getCardNumber(){
        return cardNumber;
    }

    void setTicketBalance(int newTicketBalance){
        this.ticketBalance = newTicketBalance;
    }

    void setCreditBalance(int newCreditBalance){
        this.creditBalance = newCreditBalance;
    }

    
}
