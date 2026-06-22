package PracticeQuestions;
import java.util.Scanner;
public class TemperatureCategory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the temperature:");
        int temp = scanner.nextInt();

        if ( temp < 10 ) {
            System.out.print("Very Cold");
        }
        else if ( temp >= 10  && temp < 25) {
            System.out.print("Moderate");
        }
        else if ( temp >= 25 ) {
            System.out.print("Hot");
        }
        scanner.close();
        
        }
}