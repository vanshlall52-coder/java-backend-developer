import java.util.Scanner;
public class For{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter a no. ");
         int n = sc.nextInt();

         // For loop

         for( int i = 1; i <= n; i++ ){
            System.out.println(i);
         }
         
    }
}