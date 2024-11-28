package com.Acxhange;

public class strg {
	public static void main(String[] args) {
	        String name = "Mano";
	        String greeting = "Hello";

	        // Concatenate strings
	        String fullGreeting = greeting + ", " + name + "!";
	        System.out.println("Greeting: " + fullGreeting);

	        // Find string length
	        System.out.println("Length of greeting: " + fullGreeting.length());

	        // Convert to uppercase
	        System.out.println("Greeting in uppercase: " + fullGreeting.toUpperCase());

	        // Check if it contains a word
	        System.out.println("Does the greeting contain 'John'? " + fullGreeting.contains("John"));

	        // Access a character
	        System.out.println("First character of greeting: " + fullGreeting.charAt(0));
	    }
	}



