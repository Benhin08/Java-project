package com.Acxhange;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.Set;

public class MultipleWindows {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        try {
            driver.get("https://demo.automationtesting.in/Windows.html");
            driver.findElement(By.xpath("//button[contains(text(),'click')]")).click();
            Set<String> windowHandles = driver.getWindowHandles();
            ArrayList<String> handlesList = new ArrayList<>(windowHandles);
            driver.switchTo().window(handlesList.get(1));
            Thread.sleep(3000);
            driver.close();
            driver.switchTo().window(handlesList.get(0));

        } finally {
            driver.quit();
        }
    }
}


