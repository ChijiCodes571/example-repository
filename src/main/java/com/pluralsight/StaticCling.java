package com.pluralsight;

public class StaticCling {

    public static void main(String[] args) {
//         printMax(1, 2);
         int result = myMax(6, 7);
         System.out.println(result);


    }

    /**
     * Print the max of two numbers
     * @param a the first number to compare
     * @param b the second number to compare
     */
    //this is a method signature
    static int myMax(int a, int b){
//        //this is the method body
//        if (a > b) {
//            System.out.println(a);
//        }
//        else{
//            System.out.println(b);
//        }

         if (a > b) {
             return a;
         }
         else {
             return b;
         }
    }
}
