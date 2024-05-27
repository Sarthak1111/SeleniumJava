package org.example.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assign7 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //check instructor example for xpath
        //css.class - .table-display th
        List<WebElement> rows= driver.findElements(By.xpath("//div[@class=\"left-align\"]/fieldset/table[@id=\"product\"][1]/tbody/tr"));
        System.out.println(rows.size());

        //css - .table-display th
        List<WebElement> column = driver.findElements(By.xpath("//div[@class=\"left-align\"]/fieldset/table[@id=\"product\"][1]/tbody/tr/th"));
        System.out.println(column.size());

        List<WebElement> data= driver.findElements(By.xpath("//div[@class=\"left-align\"]/fieldset/table[@id=\"product\"][1]/tbody/tr[3]"));
        for(int i=0; i<data.size();i++){
            System.out.println(data.get(i).getText());;
        }
    }
}
