package com.anudip.polymorphism;

class Animal{
    public void makeSound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("The Dog barks...");
    }
}
class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("The cat meows...");
    }
}
public class AnimalMain {
    public static void main(String[] args) {
//        To call the Superclass (Animal) method
        Animal animal = new Animal();
        animal.makeSound();

//        To call dog class makeSound() method
        Dog dog = new Dog();
        dog.makeSound();

//        To call dog class makeSound() method
        Cat cat = new Cat();
        cat.makeSound();

//        To call Dog class method  to assign the Dog object to the Parent class Reference
        Animal dog1 = new Dog();
        dog1.makeSound();

 //        To call Dog class method  to assign the Dog object to the Parent class Reference

        Animal cat1 = new Cat();
        cat1.makeSound();

    }
}
