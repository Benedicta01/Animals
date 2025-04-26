// This activity is mainly to explain multi-level inheritance

// Parent class
class Animal {
    void eat() {
        System.out.println("eating... Animal class... eat method");
    }
}

// Child class
class Lion extends Animal {
    void roar() {
        System.out.println("Roar... Lion class... roar method");
    }
}

// Child of child
class BabyLion extends Lion {
    void weep() {
        System.out.println("weeping... BabyLion class... weep method");
    }
}

// Main class
public class main {
    public static void main(String[] args) {
        BabyLion obj = new BabyLion(); // Object of child of child class
        obj.weep();
        obj.roar();
        obj.eat();
    }
}
