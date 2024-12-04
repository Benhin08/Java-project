package com.Acxhange;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Sample_Login {
	    public static void main(String[] args) throws InterruptedException {
	    
	        ChromeDriver driver = new ChromeDriver();

	            driver.get("https://practicetestautomation.com/practice-test-login/");

	            driver.manage().window().maximize();

	            WebElement usernameField = driver.findElement(By.id("username"));
	            usernameField.sendKeys("student");

	            WebElement passwordField = driver.findElement(By.id("password"));
	            passwordField.sendKeys("Password123");

	            WebElement submitButton = driver.findElement(By.id("submit"));
	            submitButton.click();
	            Thread.sleep(3000);

	            WebElement successMessage = driver.findElement(By.tagName("h1"));
	            if (successMessage.getText().equals("Logged In Successfully")) {
	            }
	        }
	    }


