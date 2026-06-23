package PatternPrinting;
import java.util.Scanner;
public class PrintSquarePattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of i. ");
        int I = sc.nextInt();

        for(int i = 1; i <= I; i++){
            for(int j = 1; j <= I; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
