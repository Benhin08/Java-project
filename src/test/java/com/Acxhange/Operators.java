package com.Acxhange;

public class Operators {
	public static void main(String[] args) {
	// Arithmetic Operators
    int a = 10, b = 20;
    System.out.println("Addition : " + (a + b));
    System.out.println("Subtraction : " + (a - b));
    System.out.println("Multiplication : " + (a * b));
    System.out.println("Division : " + (b / a));
    System.out.println("Modulus : " + (b % a));
    
    // Relational Operators
    System.out.println("Equal to : " + (a == b));
    System.out.println("Not Equal : " + (a != b));
    System.out.println("Greater than : " + (a > b));
    System.out.println("Lesser than : " + (a < b));
    System.out.println("Greater than or Equal to : " + (a >= b));
    System.out.println("Lesser than or Equal to : " + (a <= b));
    
    // Logical Operators
    boolean x = true, y = false;
    System.out.println("AND : " + (x && y)); 
    System.out.println("OR :  " + (x || y));
    System.out.println("NOT : " + (!x));
}
}