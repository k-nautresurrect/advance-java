package com.learn.io;

import java.util.Scanner;

public class StdIn {
    private static Scanner input = new Scanner(System.in);
    
    public static int readInt(){
        return input.nextInt();
    }
    public static double readDouble() {
        return input.nextDouble();
    }
    public static float readFloat(){
        return input.nextFloat();
    }
    public static char readChar(){
        String str = input.nextLine();
        return str.charAt(0);
    }
    public static String readLine(){
        String str = input.nextLine();
        return str;
    }
    public static String readNext(){
        return input.nextLine();
    }
}
