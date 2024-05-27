package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        /*driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        //driver.findElement(By.className("css-1dbjc4n"));
        driver.findElement(By.xpath("//*[contains(@class, 'css-1dbjc4n')]"));
        driver.findElement(By.xpath("//*[contains(@class,'r-1awozwy')]"));*/

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);
        int i=1;
        while(i<5)
        {
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }
        //OR use for loop
        /*for (int i=1;i<5;i++){
            driver.findElement(By.id("hrefIncAdt")).click();
        }*/
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
    }
}
