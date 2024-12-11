package com.Acxhange;

import org.testng.annotations.Test;

public class sample_constructor {
    String name;
    int age;

    // Default Constructor (Required for TestNG instantiation)
    public sample_constructor() {
        // Default values
        this.name = "Default Name";
        this.age = 0;
    }

    // Parameterized Constructor
    public sample_constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // TestNG Test Method
    @Test
    public void testConstructorRunner() {
        // Using the parameterized constructor
        sample_constructor person = new sample_constructor("John", 25);
        person.displayDetails();
    }
}
