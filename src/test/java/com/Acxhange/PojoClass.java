package com.Acxhange;
public class PojoClass {
    private String name;
    private int age;
    // Setter method for name and age
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    // Getter method for name and age
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        PojoClass person = new PojoClass(); 
        person.setName("Mano");
        person.setAge(21);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
    }

    
    