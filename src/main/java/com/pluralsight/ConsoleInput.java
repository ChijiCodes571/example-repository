package com.pluralsight;

import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);

//        System.out.println("Enter you name: ");
//        String name = myScanner.nextLine();
//        System.out.println("Howdy " + name);
//
//        System.out.println("How old are you? ");
//        int age = myScanner.nextInt();
//        System.out.println("Didn't know you are " + age);

         System.out.println("Enter you int: ");
         int i  = myScanner.nextInt();
         System.out.printf("You entered: %d \n ", i );


    }
}
