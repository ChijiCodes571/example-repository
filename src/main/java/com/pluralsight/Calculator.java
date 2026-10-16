package com.pluralsight;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        //get two numbers, and add them together, and display the sum.

        System.out.println("Enter first number ");
        int num1 = myScanner.nextInt();

        System.out.println("Enter second number ");
        int num2 = myScanner.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum is " + sum);
    }

}
