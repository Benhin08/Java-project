package com.Acxhange;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertCheck {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();

        try {
           driver.get("https://demo.automationtesting.in/Alerts.html");
           driver.findElement(By.xpath("//button[contains(text(),'alert box:')]")).click();
           Alert simpleAlert = driver.switchTo().alert();
           System.out.println("Simple Alert Text: " + simpleAlert.getText());
           Thread.sleep(6000);
           simpleAlert.accept(); 
           Thread.sleep(6000);
        } finally {
            driver.quit();
        }
    }
}
