package PracticeQuestions;
import java.util.Scanner;
public class LargestOfThreeNumbers{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the 1st no.");
        int num1 = scanner.nextInt();

        System.out.print("Enter the 2nd no.");
        int num2 = scanner.nextInt();

        System.out.print("Enter the 3rd no.");
        int num3 = scanner.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.print("Num 1 is largest.");
        }else if (num2 >= num1 && num2 >= num3){
            System.out.print("Num 2 is largest.");
        }else {
            System.out.print("Num 3 is largest.");
        }
        scanner.close();

    }
}