package com.Acxhange;

import org.testng.annotations.Test;

public class EnabledExample {

    @Test(enabled = true)
    public void testActive() {
        System.out.println("Hello");
    }

    @Test(enabled = false)
    public void testSkipped() {
        System.out.println("World");
    }
}

