import java.util.Scanner;
public class Demo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] rollNums = new int[10]; // intializing an array of size 10

        System.out.print("Enter roll numbers: ");
        int x = sc.nextInt();

        for(int i = 0; i < rollNums.length; i++){ // loop to take input from user
            rollNums[i] = x;// storing the input in the array
            x++;
        }
        for(int i = 0; i < rollNums.length; i++){// loop to print the roll numbers
            System.out.println(rollNums[i]);// printing the roll numbers
        }




    }
}