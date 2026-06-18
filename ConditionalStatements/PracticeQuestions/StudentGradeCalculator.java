package PracticeQuestions;
import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the number: ");
        int number = scanner.nextInt();

        if ( number >= 90 ){
            System.out.print("Grade - A");
        }else if ( number >= 75 ){
            System.out.print("Grade - B");
        }else if ( number >= 60 ){
            System.out.print("Grade - C");
        }else if ( number >= 40 ){
            System.out.print("Grade - D");
        }else {
            System.out.print("No Grade");
        }scanner.close();

        

    }
}
