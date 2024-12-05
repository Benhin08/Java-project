package com.Acxhange;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();

        try {
            driver.get("https://demo.automationtesting.in/Frames.html");
            driver.switchTo().frame("singleframe");
            driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hellooooo!");
            Thread.sleep(5000); 
            driver.switchTo().defaultContent();
        } finally {
            driver.quit();
        }
    }
}
