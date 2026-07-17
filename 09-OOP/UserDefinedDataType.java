public class UserDefinedDataType {
    public static class Student { // Create own data type
        String name;
        int age;
        double cgpa;

    }
    public static void main(String[] args){
        Student s1 = new Student(); // Create object of Student class
        s1.name = "Vansh";
        s1.age = 20;
        s1.cgpa = 9.5;

        Student s2 = new Student(); // Create another object of Student class
        s2.name = "Uday";
        s2.age = 20;
        s2.cgpa = 7.5;

        Student s3 = new Student();
        s3.name = "Gaurav";
        s3.age = 21;
        s3.cgpa = 8.5;

        System.out.println("Name: " + s1.name + ", Age: " + s1.age + ", CGPA: " + s1.cgpa);
        System.out.println("Name: " + s2.name + ", Age: " + s2.age + ", CGPA: " + s2.cgpa);
        System.out.println("Name: " + s3.name + ", Age: " + s3.age + ", CGPA: " + s3.cgpa);
    }

}