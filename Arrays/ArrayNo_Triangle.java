import java.util.Scanner;
public class ArrayNo_Triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of rows:");
        int rows = sc.nextInt();

        int[][] arr = new int[rows][]; //Array of arrays

        // Declaring the size of each row
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];

        System.out.println("Enter elements: ");

        // Input elements into the multi-dimensional array
        for(int i=0; i<rows; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = sc.nextInt();

            }
        }
        System.out.println("Array: ");

        // Output elements of the multi-dimensional array
        for(int i=0; i<rows; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr [i][j] + " ");
            }
            System.out.println();
        }
    }
}