package com.Acxhange;

import org.testng.annotations.Test;

public class GroupsExample {

    @Test(groups = {"setup"})
    public void setupDatabase() {
        System.out.println("Setting up");
    }

    @Test(groups = {"execution"})
    public void runTests() {
        System.out.println("Running tests");
    }

    @Test(groups = {"closure"})
    public void closure() {
        System.out.println("Signing OFF");
    }
}
