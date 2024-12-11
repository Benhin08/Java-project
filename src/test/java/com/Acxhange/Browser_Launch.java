package com.Acxhange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browser_Launch {
		@Test
		private void ChromeBrowser() {
			// TODO Auto-generated method stub

		
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://www.kemper.com/");
}
}