 public class NestedIf {
    public void main(String[] args){
        // Nested If
        int i = 10;

        if (i > 9){
            if (i < 15){
                System.out.println(" i is less than 15");
            }
            else {
                System.out.println(" i is greater than 15 ");
            }

            System.out.println(" i is greater than 9 ");
        }
        else {
            System.out.println(" i is less than 9");
        }
        
    }
 
    
}              
    // 2nd variation of nested if
    class NestedIf2 {
        public void main(String[] args){
            int x = 25;

            if (x > 20 && x < 30){
                System.out.println(" x is greater than 20 and Less than 30");
            }
        }
    }
