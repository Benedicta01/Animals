// This activity is mainly to explain Hierarchical Inheritance

// Parent class
class Mammals {
    void mam() {
        System.out.println("Inside Mammals Class");
    }
}

// Child class
class Lion extends Mammals {
    void roar() {
        System.out.println("Inside Lion class");
    }
}

// Another child class
class Human extends Mammals {
    void hum() {
        System.out.println("Inside Human");
    }
}

// Main class
public class main {
    public static void main(String[] args) {
        Lion obj = new Lion(); // Object of child class (Lion)

        // obj.hum(); // This will cause an error because Lion doesn't have hum() method

        obj.roar();
        obj.mam();
    }
}
