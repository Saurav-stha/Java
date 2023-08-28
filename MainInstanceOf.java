class Animal {}

class Dog extends Animal {}

class Cat extends Animal {}

public class MainInstanceOf {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(dog instanceof Animal); // true, Dog is an instance of Animal (subclass)
        System.out.println(cat instanceof Animal); // true, Cat is an instance of Animal (subclass)
        System.out.println(animal instanceof Animal); // true, an Animal is an instance of itself

        System.out.println(animal instanceof Dog); // false, an Animal is not an instance of Dog
        System.out.println(dog instanceof Cat); // false, a Dog is not an instance of Cat

        // Checking against interfaces
        System.out.println(dog instanceof Runnable); // false, Dog does not implement Runnable interface

        // Checking against parent class
        System.out.println(dog instanceof Object); // true, all classes in Java implicitly inherit from Object class
    }
}
