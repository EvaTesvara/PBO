package com.practice;
import java.util.Scanner;

public class Terminal {
    private card terminalCard;
    private int topUpCredit;
    private int barbieDollQuantity = 0, schoolBookQuantity = 3, butterflyHairPinQuantity = 3;

    Scanner sc = new Scanner(System.in);

    void equipCard(card cardNumber){
        this.terminalCard = cardNumber;
    }

    void cardTopUp(int topUpMoney){
        this.topUpCredit = topUpMoney * 2;
        this.terminalCard.setCreditBalance(terminalCard.getCreditBalance() + topUpCredit);
    }

    void checkCardAndTicketBalance(){
        System.out.println("Your card number is: " + terminalCard.getCardNumber());
        System.out.println("Your card balance is: " + terminalCard.getCreditBalance());
        System.out.println("Your card ticket balance is: " + terminalCard.getTicketBalance());
    }

    void transferCreditBalance(card transferToThisCard, int creditBalanceThatWillBeTransfered){
        if (this.terminalCard.getCreditBalance() >= creditBalanceThatWillBeTransfered){
            this.terminalCard.setCreditBalance(this.terminalCard.getCreditBalance() - creditBalanceThatWillBeTransfered);
            transferToThisCard.setCreditBalance(transferToThisCard.getCreditBalance() + creditBalanceThatWillBeTransfered);
            System.out.println(creditBalanceThatWillBeTransfered + " credit balance transferred from " + this.terminalCard.getCardNumber() + " to " + transferToThisCard.getCardNumber());
            System.out.println("credit balance left in " + this.terminalCard.getCardNumber() + " : " + terminalCard.getCreditBalance());
        }else if (this.terminalCard.getCreditBalance() < creditBalanceThatWillBeTransfered){
            System.out.println("Not enough balance");
        }
    }

    void transferTicketBalance(card transferToThisCard, int ticketBalanceThatWillBeTransfered){
        if (this.terminalCard.getTicketBalance() >= ticketBalanceThatWillBeTransfered){
            this.terminalCard.setTicketBalance(this.terminalCard.getTicketBalance() - ticketBalanceThatWillBeTransfered);
            transferToThisCard.setTicketBalance(transferToThisCard.getTicketBalance() + ticketBalanceThatWillBeTransfered);
            System.out.println(ticketBalanceThatWillBeTransfered + " ticket balance transferred from " + this.terminalCard.getCardNumber() + " to " + transferToThisCard.getCardNumber());
            System.out.println("tickeet balance left in " + this.terminalCard.getCardNumber() + " : " + terminalCard.getTicketBalance());
        }else if (this.terminalCard.getTicketBalance() < ticketBalanceThatWillBeTransfered){
            System.out.println("Not enough balance");
        }
    }

    void exchangePrize (){
        System.out.println("=== Prize ===");
        System.out.println("1. Barbie Doll : 30 tickets");
        System.out.println("2. School Exercise Book : 25 tickets");
        System.out.println("3. Butterfly Hair Pin : 10 Tickets");
        System.out.println("Enter a prize Number: ");
        int prizeWanted = sc.nextInt();

        switch(prizeWanted){
            case 1 : barbieDollPrize(); break;
            case 2 : schoolBookPrize(); break;
            case 3 : hairPinPrize(); break;
            default : System.out.println("invalid number");
        }

    }

    void barbieDollPrize(){
        if (this.terminalCard.getTicketBalance()>=30){
            if(barbieDollQuantity<1){
                System.out.println("Barbie doll is out of stock");
            }else{
                this.terminalCard.setTicketBalance(this.terminalCard.getTicketBalance() - 30);
                barbieDollQuantity = barbieDollQuantity - 1;
                System.out.println("You've won a barbie doll! \nBarbie doll quantity remaining : " + barbieDollQuantity);
            }
        }else if (this.terminalCard.getTicketBalance() < 30){
            System.out.println("Insufficient ticket balance");
        }
    }

    void schoolBookPrize(){
        if (this.terminalCard.getTicketBalance()>=25){
            if(schoolBookQuantity<1){
                System.out.println("School Exercise book is out of stock");
            }else{
                this.terminalCard.setTicketBalance(this.terminalCard.getTicketBalance() - 25);
                schoolBookQuantity = schoolBookQuantity - 1;
                System.out.println("You've won a school exercise book! \nSchool exercise book quantity remaining : " + schoolBookQuantity);
            }
        }else if (this.terminalCard.getTicketBalance() < 25){
            System.out.println("Insufficient ticket balance");
        }
        
    }

    void hairPinPrize(){
        if (this.terminalCard.getTicketBalance()>=10){
            if (butterflyHairPinQuantity<1){
                System.out.println("Butterfly hair pin is out of stock");
            }else{
                this.terminalCard.setTicketBalance(this.terminalCard.getTicketBalance() - 10);
                butterflyHairPinQuantity = butterflyHairPinQuantity - 1;
                System.out.println("You've won a cute butterfly hair pin! \nbutterfly hair pin quantity remaining : " + butterflyHairPinQuantity);
            }
        }else if (this.terminalCard.getTicketBalance() < 10){
            System.out.println("Insufficient ticket balance");
        }
    }
}
