package com.Acxhange;
import org.testng.annotations.Test;
public class Controlflow {
    public static void main(String[] args) {    
        int number = 10;
        // Using if-else
        System.out.println("Using if-else:");
        if (number == 1) {
            System.out.println("You entered ONE.");
        } else if (number == 2) {
            System.out.println("You entered TWO.");
        } else if (number == 3) {
            System.out.println("You entered THREE.");
        } else if (number == 4) {
            System.out.println("You entered FOUR.");
        } else if (number == 5) {
            System.out.println("You entered FIVE.");
        } else {
            System.out.println("Invalid number : " + number); }
        int num = 3;
        // Using switch-case
        System.out.println("\nUsing switch-case:");
        switch (num) {
            case 1:
                System.out.println("You selected ONE.");
                break;
            case 2:
                System.out.println("You selected TWO.");
                break;
            case 3:
                System.out.println("You selected THREE.");
                break;
            case 4:
                System.out.println("You selected FOUR.");
                break;
            case 5:
                System.out.println("You selected FIVE.");
                break;
            default:
                System.out.println("Invalid number : " + num);
        }}}

