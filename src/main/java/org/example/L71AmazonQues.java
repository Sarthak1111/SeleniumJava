package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class L71AmazonQues {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        int j=0;
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        String[] itemsNeeded={"Brocolli","Cucumber","Brinjal"};
        List<WebElement> items=driver.findElements(By.cssSelector("h4.product-name"));

        for (int i=0; i<items.size();i++){

            String[] name=items.get(i).getText().split("-");
            String formattedText=name[0].trim(); //removes whitespace from array from both sides

            List veg=Arrays.asList(itemsNeeded); //converted Array to List at runtime to use the contains
            //methods becoz declaration of list takes more mem than array

             //declaring j to count only 3 itemsNeeded matches and comes out of the loop
            if(veg.contains(formattedText)) {
                j++;
                driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();

            }
                if(j== veg.size())
                    break;
        }
    }
}
