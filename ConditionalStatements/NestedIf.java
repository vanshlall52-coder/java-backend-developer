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
