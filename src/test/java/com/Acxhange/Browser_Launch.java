package com.Acxhange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://www.kemper.com/");
}
}