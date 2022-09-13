package com.learn.io;

import java.io.PrintStream;

public class StdOut {
    public static PrintStream output = new PrintStream(System.out);
    public static void println(Object obj){
        output.println(obj);
    }
    public static void print(Object obj){
        output.print(obj);
    }
    public static void println(){
        output.println();
    }
}
