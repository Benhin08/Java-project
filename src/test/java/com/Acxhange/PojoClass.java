package com.Acxhange;

public class PojoClass {
    // Fields (private variables)
    private String name;
    private int age;

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating an instance of PojoClass
        PojoClass person = new PojoClass();
        
        // Setting values using setter methods
        person.setName("Mano");
        person.setAge(21);

        // Printing the values using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

    
    