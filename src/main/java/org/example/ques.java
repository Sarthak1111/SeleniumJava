package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ques {
    static String url = "https://rahulshettyacademy.com/locatorspractice/";

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.manage().window().maximize();
        driver.findElement(By.id("inputUsername")).sendKeys("arvind_001@hotmail.com");
        driver.findElement(By.name("inputPassword")).sendKeys("testing");
        driver.findElement(By.className("signInBtn")).click();

        Thread.sleep(2000);

        System.out.println(driver.findElement(By.cssSelector(".error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(("arvind"));
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("arvi001@gmil.com");
        driver.findElement(By.xpath("//input[@Type='text'][2]")).clear();
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("arvind_001@hotmail.com");

// driver.findElement(By.cssSelector("input[type='text']:nth-hild(3)")).sendKeys("arvind_001@hotmail.com");
// driver.findElement(By.xpath("//form/input[3]")).sendKeys("7049537586");

        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("arvind");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[id='chkboxOne']")).click();
        driver.findElement((By.xpath("//button[contains(@class,'submit')]"))).click();

    }
}