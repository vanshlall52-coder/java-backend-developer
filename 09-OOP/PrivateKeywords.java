class Student {
    String name;
    int age;
    private int rollNo = 101;// rollNo is private and cannot be accessed outside the Student class
    void print(){
        System.out.println("Name: " + name + ", Age: " + age + ", Roll No: " + rollNo);
    }
}
public class PrivateKeywords {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Vansh";
        s1.age = 20;
        /* s1.rollNo = 101; // This line will give an error because rollNo is private
         and cannot be accessed outside the Student class
         */
        s1.print();
    }
    
}
