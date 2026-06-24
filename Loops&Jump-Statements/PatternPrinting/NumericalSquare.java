package PatternPrinting;
import java.util.Scanner;
public class NumericalSquare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. or row. ");
        int row = sc.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}