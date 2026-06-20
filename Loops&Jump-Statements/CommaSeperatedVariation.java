import java.util.Scanner;
public class CommaSeperatedVariation{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of i.");
        int startI = sc.nextInt();

        System.out.print("Enter the value of j.");
        int startJ = sc.nextInt();

        // Common Seperated Variables

        for(int i = startI, j = startJ; i <= 10; i++, j++){
            System.out.println(i * j);
        }
        
    }
}