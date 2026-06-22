package SimpleCalculator;
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the 1st no. ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the 2nd no. ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the operator:- (+ , - , * , /): ");
        char op = scanner.next().charAt(0);

        // Switch
        switch(op){
            case '+':
            System.out.print("Result = " + (num1 + num2));
            break;

            case '-':
            System.out.print("Result = " + (num1 - num2));
            break;

            case '*':
            System.out.print("Result = " + (num1 * num2));
            break;

            case '/':
            System.out.print("Result = " + (num1 / num2));
            break;

            default:
            System.out.print("Invalid Operator.");

        }scanner.close();

    }
}