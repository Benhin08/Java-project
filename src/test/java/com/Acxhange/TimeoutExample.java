package com.Acxhange;
import org.testng.annotations.Test;

public class TimeoutExample {

    @Test(timeOut = 2000) 
    public void testmethod1() throws InterruptedException {
        Thread.sleep(1000); 
        System.out.println("Test completes within time");
    }
}
