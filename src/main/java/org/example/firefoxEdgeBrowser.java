package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxEdgeBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver","D:\\webdrivers\\geckodriver-v0.34.0-win64\\D:\\webdrivers\\geckodriver-v0.34.0-win64.exe");
        WebDriver driver= new FirefoxDriver();

        System.setProperty("webdriver.edge.drive","D:\\webdrivers\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver1=new EdgeDriver();
        driver.close();
        driver1.close();
    }
}
