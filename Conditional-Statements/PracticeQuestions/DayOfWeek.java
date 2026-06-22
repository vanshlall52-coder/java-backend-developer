package PracticeQuestions;
import java.util.Scanner;
public class DayOfWeek{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter the no. ");
        int num = scanner.nextInt();

        //Switch
        switch(num){

            case 1:
                System.out.print("1 is Monday.");
                break;
            case 2:
                System.out.print("2 is Tuesday.");
                break;
            case 3:
                System.out.print("3 is Wednesday.");
                break;
            case 4:
                System.out.print("4 is Thursday.");
                break;
            case 5:
                System.out.print("5 is Friday.");
                break;
            case 6:
                System.out.print("6 is Saturday.");
                break;
            case 7:
                System.out.print("7 is Sunday.");
            default:
                System.out.print("Invalid number! Enter 1-7.");

        }scanner.close();

        
        
        


    }
}