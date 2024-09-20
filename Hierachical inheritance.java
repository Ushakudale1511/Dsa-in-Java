class Animal {
    void eat() {
        System.out.println("Animal can eat");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class Main {
    public static void main(String args[]) {
        // Dog object
        Dog d = new Dog();
        d.eat();   // Inherited from Animal class
        d.bark();  // Dog-specific method
        
        // Cat object
        Cat c = new Cat();
        c.eat();   // Inherited from Animal class
        c.meow();  // Cat-specific method
    }
}
