class Animal {
    public void speak() {
        System.out.println("I am an animal");
    }
}

class Dog extends Animal {

    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {

    @Override
    public void speak() {
        System.out.println("Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.speak();

        animal = new Cat();
        animal.speak();
    }
}
