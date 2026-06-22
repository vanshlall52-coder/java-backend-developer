package PracticeQuestions;
import java.util.Scanner; // import the Scanner class to read user input

public class PositiveNumberCheck {
    public static void main(String[] args) {
        // Create a scanner object

        Scanner scanner = new Scanner(System.in);
        // Read a number from the user
        System.out.print("Enter the number:");
        int number = scanner.nextInt();

        // Check if the number is positive, negative
        // or zero using if-else statements
        if (number > 0) {
            System.out.println("The number is positive.");

        } 
        else if (number < 0) {
            System.out.println(" The number is negative.");

        }
        else {
            System.out.println("The number is zero.");

        }
        scanner.close(); // Close the scanner to prevent resource Leaks

    }
}