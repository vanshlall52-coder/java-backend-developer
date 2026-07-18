class Pokemon {
    int power;
    String type;

    // Parameterized Constructor
    Pokemon(String type, int power) {
        this.power = power;
        this.type = type;
    }
    // Default Constructor
    Pokemon() {
    }

    // Method
    void print() {
        System.out.println(this.power + " " + this.type);
    }
}
// Child Class
class LegendaryPokemon extends Pokemon {

    String ability;

    // Parameterized Constructor
    LegendaryPokemon(String type, int power, String ability) {
        super(type, power); // Call to Parent Constructor
        this.ability = ability;
    }
}
public class Inheritance {

    public static void main(String[] args) {

        // Child Class Object
        LegendaryPokemon mewtwo = new LegendaryPokemon("Psychic", 680, "Pressure");

        System.out.println("Legendary Pokemon");
        mewtwo.print();
        System.out.println("Ability : " + mewtwo.ability);

        System.out.println();

        // Parent Class Object
        Pokemon pikachu = new Pokemon("Electric", 320);

            System.out.println("Normal Pokemon");
        pikachu.print();
    }
}