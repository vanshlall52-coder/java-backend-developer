public class Constructors {
    public static class Car {
        String name;
        String colour;
        int seats;
        Car(String x, String y, int z) { // Constructor with parameters
            name = x;
            colour = y;
            seats = z;
            
        }
        void print(){
            System.out.println("Name: " + name + ", Colour: " + colour + ", Seats: " + seats);
        }
    }
    public static void main(String[] args) {
        Car c1 = new Car("BMW", "Black", 5);
        Car c2 = new Car("Audi", "White", 5);
        Car c3 = new Car("Mercedes", "Silver", 5);

        c1.print();
        c2.print();
        c3.print();
    }
}