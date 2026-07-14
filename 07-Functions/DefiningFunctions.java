import java.util.Scanner;
public class DefiningFunctions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Calling the function
        greet(); // Calling the 1st function

        // 2nd function
        System.out.print("Enter your name: ");
        String name = sc.nextLine();// Taking input from user
        SayHello(name); // Calling the 2nd function

        // 3rd function
        int number = GetNumber(); // Calling the 3rd function
        System.out.println("Number = " + number);

        // 4th function
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Multiplication = " + Multiply(a, b));// Calling the 4th function

    }
    // Making a function in java

    // 1- No input parameters and no return value
    public static void greet(){
        System.out.println("Hello, welcome to java functions");
        return;// optional
    }
    // 2- Input parameters and no return value
    public static void SayHello(String name){// No. of parameters can be anything
        System.out.println("HEllo " + name);
    }
    // 3- No input parameters and return value
    public static int GetNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        return num;
    }
    // 4- Input parameters and return value
    public static int Multiply(int a, int b){
        return (a * b);
    }

}
