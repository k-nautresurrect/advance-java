package com.learn.bankinapp;

import com.learn.io.StdOut;
import com.learn.io.StdIn;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankinApp {
    private static final String CONTEXT_PATH = 
            "bankinApp/applicationContext.xml";
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = 
                new ClassPathXmlApplicationContext(CONTEXT_PATH);
        
        UserCredentials credentials = 
                context.getBean("UserCredentials",UserCredentials.class);      
    }
}
