package com.learn.bankinapp;

import com.learn.io.StdIn;
import com.learn.io.StdOut;

public class RegularInfo {
    
    private final int[] Choices = {1,2,3};
    private int Choice;
    
    public int welcome(){
        StdOut.println("Welcome to the banking application");
        StdOut.println("Choose Any Services from below");
        StdOut.println("[1].Enter Your Card Details.");
        StdOut.println("[2].Register for a new Card.");
        StdOut.println("[3].Update Card Details");
        StdOut.println("Enter your Choice : ");
        this.Choice = StdIn.readInt();
        if(checkAvailableChoices(Choice) != -1){
            return Choice;
        }
        return welcome();
    }
    private int checkAvailableChoices(int Choice){
        for(int availableChoice : Choices){
            if(Choice == availableChoice){
                return Choice;
            }
        }
        return -1;
    } 
}
