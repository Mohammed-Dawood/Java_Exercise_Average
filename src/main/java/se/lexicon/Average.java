package se.lexicon;


import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            int num1 = 0, num2 = 0, num3 = 0;
            boolean validInput = false;

            // Prompt the user to enter the first number
            while (!validInput) {
                try {
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextInt();
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.next(); // Clear the invalid input
                }
            }

            validInput = false; // Reset for the next number

            // Prompt the user to enter the second number
            while (!validInput) {
                try {
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextInt();
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.next(); // Clear the invalid input
                }
            }

            validInput = false; // Reset for the next number

            // Prompt the user to enter the third number
            while (!validInput) {
                try {
                    System.out.print("Enter the third number: ");
                    num3 = scanner.nextInt();
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.next(); // Clear the invalid input
                }
            }

            // Calculate the sum of the three numbers
            int sum = num1 + num2 + num3;

            // Calculate the average
            double average = sum / 3.0;

            // Print the result
            System.out.println("(" + num1 + " + " + num2 + " + " + num3 + ") / 3 = " + average);

            // Ask the user if they want to continue or quit
            System.out.print("Do you want to continue? Enter 'q' to quit or any other key to continue: ");
            input = scanner.next();
        } while (!input.equalsIgnoreCase("q"));

        // Close the scanner
        scanner.close();
        System.out.println("Program terminated.");
    }
}
