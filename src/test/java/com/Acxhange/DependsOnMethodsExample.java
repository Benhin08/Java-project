package com.Acxhange;

import org.testng.annotations.Test;

public class DependsOnMethodsExample {

    @Test
    public void testSetup() {
        System.out.println("Setup Test");
    }

    @Test(dependsOnMethods = {"testSetup"})
    public void testExecution() {
        System.out.println("Execution Test");
    }

    @Test(dependsOnMethods = {"testExecution"})
    public void testClosure() {
        System.out.println("testClosure");
    }
}
