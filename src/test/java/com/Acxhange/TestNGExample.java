package com.Acxhange;

import org.testng.annotations.*;

public class TestNGExample {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @Test
    public void Dog() {
        System.out.println("Test Method 1");
    }

    @Test
    public void Cat() {
        System.out.println("Test Method 2");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }
}
