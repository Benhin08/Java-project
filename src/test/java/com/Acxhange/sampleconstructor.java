package com.Acxhange;

public class sampleconstructor {
		    String name;
		    int age;
		    // Constructor
		    sampleconstructor(String name, int age) {
		        this.name = name;
		        this.age = age;
		    }
		    void displayDetails() {
		        System.out.println("Name: " + name);
		        System.out.println("Age: " + age);
		    }
		    public static void main(String[] args) {
		        // Create an object of the sampleconstructor
		        sampleconstructor person = new sampleconstructor("John", 25);

		        person.displayDetails();
		    }
		}
