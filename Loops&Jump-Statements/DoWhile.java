import java.util.Scanner;
public class DoWhile{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a no. ");
        int n =  sc.nextInt();
        
        int i = 1;

        //Do While Loop 

        do{
            System.out.println(i);
            i++;
        }while ( i <= n );
        sc.close();
    }
}

