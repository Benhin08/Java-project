package com.Acxhange;

import org.testng.annotations.Test;

public class priority {

    @Test(priority = 4)
    public void testDashboard() {
        System.out.println("Executing Login Test");
    }

    @Test(priority = -5)
    public void testLogout() {
        System.out.println("Executing Dashboard Test");
    }

    @Test(priority = 0)
    public void testLogin() {
        System.out.println("Executing Logout Test");
    }
}
