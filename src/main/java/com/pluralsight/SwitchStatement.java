package com.pluralsight;

public class SwitchStatement {
    public static void main(String[] args) {
        int menuChoice = 3;
        String menu = """
                Enter the number of the operationn you want:
                1. Multiply
                2.Substract
                3. Add
                """;

        System.out.println(menu);

        if(menuChoice == 1){
            System.out.println("Multiply");
        } else if (menuChoice == 2) {
            System.out.println("Subtract");
        } else if (menuChoice == 3) {
            System.out.println("Add");
        } else {
            System.out.println("Invalid choice.");
        }

        switch(menuChoice) {
            case 1 -> {
                System.out.println("We are gonna multiply...make babies");
            }
            case 2 -> {
                System.out.println("The operation is subtraction");
            }
            case 3 -> {
                System.out.println("Addition");
            }
            default -> {
                System.out.println("That wasn't an option, numbskull");
            }
        }
    }
}
