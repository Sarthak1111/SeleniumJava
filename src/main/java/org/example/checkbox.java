package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkbox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
        //System.out.println(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='IndArm'")).click();
        //System.out.println(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
        //no. of checkboxes on page
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
        Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(),6);
    }
}
