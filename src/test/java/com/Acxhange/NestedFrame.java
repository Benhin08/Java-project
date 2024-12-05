package com.Acxhange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();

        try {
            driver.get("https://demo.automationtesting.in/Frames.html");
            driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
            Thread.sleep(3000); 
            WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
            driver.switchTo().frame(outerFrame);
            WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
            driver.switchTo().frame(innerFrame);
            driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hellooooo!");
            Thread.sleep(3000); 
            driver.switchTo().defaultContent();

        } finally {
            driver.quit();
        }
    }
}
