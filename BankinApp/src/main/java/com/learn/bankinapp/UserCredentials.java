package com.learn.bankinapp;

import com.learn.io.StdIn;
import com.learn.io.StdOut;
import java.util.Arrays;

public class UserCredentials {
    private RegularInfo regularInfo;
    private final int CARD_NUMBER_SIZE = 12;
    private final int PIN_SIZE = 4;
    private int userService;
    private String userName;
    private String passWordToken;
    private String accountNumber;
    private String cardNumber;
    private String PIN;
    
    public UserCredentials(RegularInfo regularInfo){
        this.regularInfo = regularInfo;
        this.userService = regularInfo.welcome();
        switch(this.userService){
            case 1 -> getCardDetails();
            case 2 -> registerForCard();
            case 3 -> updateCard();
        }
    }
    
    private void getCardDetails(){
        StdOut.println("Enter your card number : ");
        StdIn.readNext();
        this.cardNumber = StdIn.readLine();
        StdOut.println("Enter your PIN : ");
        this.PIN = StdIn.readLine();
        generateToken(this.cardNumber, this.PIN);
    }
    
    private String generateToken(String cardNumber, String PIN){
        int[] cardNums = new int[CARD_NUMBER_SIZE];
        int[] Pin;
        Pin = new int[PIN_SIZE];
        int pos = 0;
        for(char num: cardNumber.toCharArray()){
            cardNums[pos] = (int)num - '0';
            pos++;
        }
        pos = 0;
        for(char num: PIN.toCharArray()){
            Pin[pos] = (int)num - '0';
            pos++;
        }
        StdOut.println(Arrays.toString(cardNums));
        StdOut.println(Arrays.toString(Pin));
        for(int itr = 1; itr < CARD_NUMBER_SIZE; itr++){
            StdOut.print((char)(cardNums[itr-1] + cardNums[itr] + '0'));
        }
        return "";
    }

    private void registerForCard() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void updateCard() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
