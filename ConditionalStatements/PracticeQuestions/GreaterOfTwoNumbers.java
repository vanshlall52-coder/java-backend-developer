package PracticeQuestions;
import java.util.Scanner;
public class GreaterOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a scanne object

        System.out.print("Enter he first number: ");
        int num1 = scanner.nextInt(); // Read the first number from the user

        System.out.print("Enter the second number:");
        int num2 = scanner.nextInt(); // Read the second number from the user

        if (num1 > num2) {
            System.out.println(" The greater number is: " + num1);
        } else {
            System.out.println("The greater number is: " + num2);
        }
        scanner.close();

        
    }
}