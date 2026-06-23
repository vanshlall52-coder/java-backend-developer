package PatternPrinting;
import java.util.Scanner;
public class PrintT {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of I. ");
        int I = sc.nextInt();

        int i,j;

        for(i = 1; i <= I; i++){
            for(j = 1; j <= I; j++){
                if(i == 1 || j == 3)
                    System.out.print("*");

                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}