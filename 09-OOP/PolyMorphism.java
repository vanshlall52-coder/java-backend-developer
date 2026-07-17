public class PolyMorphism {
    // One name and different forms of the same method is called polymorphism. In this example, we have two classes Dog and Cat, both having a method speak() but with different implementations. This is an example of compile-time polymorphism (method overloading) in Java.
    public static class Dog {
        void speak() { // 
            System.out.println("Woof!");
        }
    }
    public static class Cat {
        void speak() {
            System.out.println("Meow!");
        }
    }
    public static void main(String[] args){
        Dog d = new Dog();
        Cat c = new Cat();
        d.speak();
        c.speak();
    }
}
