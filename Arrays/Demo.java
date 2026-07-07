import java.util.Scanner;
public class Demo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] rollNums = new int[3];

        System.out.print("Enter roll numbers: ");
        int x = sc.nextInt();

        for(int i = 0; i < rollNums.length; i++){
            rollNums[i] = x;
            x++;
        }
        for(int i = 0; i < rollNums.length; i++){
            System.out.println(rollNums[i]);
        }




    }
}