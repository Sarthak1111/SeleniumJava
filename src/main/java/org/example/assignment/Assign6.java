package org.example.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign6 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.xpath("//label/input[@value=\"option2\"]")).click();
        String checkBox = driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/fieldset/label[2]")).getText();
        System.out.println(checkBox);
        WebElement staticDropdown=driver.findElement(By.id("dropdown-class-example"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByVisibleText(checkBox);

        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(checkBox);
        driver.findElement(By.xpath("//*[@id=\"alertbtn\"]")).click();

        String s=driver.switchTo().alert().getText();
        if(s.contains(checkBox)){
            System.out.println("Text found: " +checkBox);        }
        driver.switchTo().alert().accept();
        driver.close();
    }
}
