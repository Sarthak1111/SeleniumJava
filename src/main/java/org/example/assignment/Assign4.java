package org.example.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.Set;

public class Assign4 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
        Set<String> windows=driver.getWindowHandles();
        Iterator<String> it =windows.iterator();
        String parent_Id=it.next();
        driver.findElement(By.cssSelector("a[href='/windows/new']")).click();

        System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
        driver.switchTo().window(parent_Id);
        System.out.println(driver.findElement(By.cssSelector("a[href='/windows/new']")).getText());
    }
}
