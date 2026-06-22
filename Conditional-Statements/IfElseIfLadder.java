public class IfElseIfLadder {
    public static void main(String[] args) {
        int age = 21;
        if (age < 18) {
            System.out.println("You are a minor.");
        }
        else if (age >= 18 && age < 65) {
            System.out.println(" You are an adult.");
        }
        else if (age >= 65) {
            System.out.println("You are a senior citizen.");
        }
        else if (age < 0){
            System.out.println("Invalid age.");
        }
            else {
                System.out.println("Invalid age.");
            }
        
    }
}