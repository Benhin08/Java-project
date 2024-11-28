package com.Acxhange;

// Base class
class Animal {
    void eat() {
        System.out.println("This animal is eating.");
    }
}

// Derived class
class Dog extends Animal {
    void bark() {
        System.out.println("The dog is barking.");
    }
}

// Main class
public class Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  
        myDog.bark(); 
    }
}
