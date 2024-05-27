package org.example.Selenium4LatestFeatures;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class MultiWindowsTabsSshotHeightWidth {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        //Multi Window/TAB
        driver.switchTo().newWindow(WindowType.WINDOW);
        //driver.switchTo().newWindow(WindowType.TAB);

        Set<String> handles=driver.getWindowHandles();
        Iterator<String>it=handles.iterator();
        String parent=it.next();
        String child = it.next();
        driver.switchTo().window(child);
        driver.get("https://rahulshettyacademy.com/");

        String courseName=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']"))
                .get(3).getText();
        driver.switchTo().window(parent);

        WebElement name= driver.findElement(By.cssSelector("[name='name']"));
        name.sendKeys(courseName);
        //Partial ScreenShot
        File file=name.getScreenshotAs(OutputType.FILE); //source file
        FileUtils.copyFile(file, new File("ss.png"));

        //Height and Width of WebElement
        System.out.println(name.getRect().getHeight());
        System.out.println(name.getRect().getWidth());
        name.getRect().getDimension().getHeight();

        driver.quit();

    }
}
