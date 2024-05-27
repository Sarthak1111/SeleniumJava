package org.example.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Assign3 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();
        int j=0;
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("learning");
        driver.findElement(By.cssSelector("input[value='user']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[value='user']")).isSelected());
        //Thread.sleep(3000);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn"))).click();

        WebElement staticDrop = driver.findElement(By.cssSelector("select[class='form-control']"));
        Select dropdown = new Select(staticDrop);
        dropdown.selectByVisibleText("Consultant");

        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
        //Signin
        //driver.findElement(By.xpath("//input[@class=\"btn btn-info btn-md\"]")).click(); // by xPath
        driver.findElement(By.cssSelector(".btn.btn-info.btn-md")).click(); // by spaces in classname so use . and cssSelector

        //adding item in cart

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-info']"))).click();

        List<WebElement> addButton= driver.findElements(By.xpath("//button[contains(@class,'btn')]"));

        for(int i=0; i<addButton.size(); i++){

            addButton.get(i).click();
            /*String[] name=allItems.get(i).getText().split(" ");
            String formattedName= name[0].trim();
            //trim/format it to get actual item name
            //converted array to ArrayList to use the contains method in if condition
            //Check whether the name extracted is present in the Arraylist or not
            List arr=Arrays.asList(arrayItems);*/

            /*if(arr.contains(formattedName)) {
                j++;
                //driver.findElements(By.cssSelector(".card-footer .btn-info")).get(i).click();
                driver.findElements(By.xpath("//button[contains(@class,'btn')]")).get(i).click();
            }//4 items we need
                *//*if(j== arr.size())
                    break;*/
            }
        driver.findElement(By.xpath("//a[contains(@class,'btn-primary')]")).click();
        }
    }
