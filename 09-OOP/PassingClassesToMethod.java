public class PassingClassesToMethod {
    public static class Car {// Create own data type
        String name;
        String colour;
        int length;
        int seats;
        int tourque;
        void print(){ // Method to print the details of the car
            System.out.println("Name: " + name + ", Colour: " + colour + ", Length: " + length + ", Seats: " + seats + ", Tourque: " + tourque);
        }
    }
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "BMW";
        c1.colour = "Black";
        c1.length = 4;
        c1.seats = 5;
        c1.tourque = 500;

        Car c2 = new Car();
        c2.name = "Audi";
        c2.colour = "White";
        c2.length = 4;
        c2.seats = 5;
        c2.tourque = 250;

        Car c3 = new Car();
        c3.name = "Mercedes";
        c3.colour = "Silver";
        c3.length = 4;
        c3.seats = 5;
        c3.tourque = 400;

       
        change(c1);// Passing object of Car class to method change
        System.out.println("Seats of c1 after change: " + c1.seats);

        c1.print();
        c2.print();
        c3.print();
        
        
    }
    private static void change(Car c1) {// Method to change the seats of car
        c1.seats = 7;// Changing the seats of car c1 to 7
    }
}