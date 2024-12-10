package com.Acxhange;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class DataDrivenTest {

    WebDriver driver;  
    String filePath = "C:\\Users\\manov\\Downloads\\Sample Login Details.xlsx"; 

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();  
        driver.manage().window().maximize();
    }

    @Test
    public void testLogin() throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(fis); 
        XSSFSheet sheet = workbook.getSheetAt(0);  
        String username = sheet.getRow(3).getCell(0).getStringCellValue(); 
        String password = sheet.getRow(3).getCell(1).getStringCellValue(); 

        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("submit")).click();

        workbook.close();
        fis.close();
    }
}


