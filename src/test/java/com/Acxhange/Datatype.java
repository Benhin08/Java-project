package com.Acxhange;
import org.testng.annotations.Test;

public class Datatype { 
	public static void main(String[] args) {
        byte b = 10;
        short s = 200;
        int i = 1000;
        float f = 10.5f;
        double d = 99.99;
        char c = 'M';
        boolean bool = true; 
        
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
        
        // String
        String str = "Mano";
        System.out.println("string: " + str);
        
        // Array
        int[] arr = {1, 2, 3, 4};
        System.out.println("Array using index numbers:");
        System.out.println("Element at index 0: " + arr[0]);
        System.out.println("Element at index 1: " + arr[1]);
        System.out.println("Element at index 2: " + arr[2]);
        System.out.println("Element at index 3: " + arr[3]);
    }
}

