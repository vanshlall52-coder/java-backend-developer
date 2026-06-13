public class BitwiseOperator {
    static void main(String[] args){
        //Bitwise Operators
        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary 

        int c = a & b; // Bitwise AND
        int d = a | b; // Bitwise OR
        int e = a ^ b; // Bitwise XOR
        int f = ~a; // BItwise NOT
        
        System.out.println(c + " , " + d + " , " + e + " , " + f);
    }
    
}
