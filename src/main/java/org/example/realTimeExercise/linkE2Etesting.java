package org.example.realTimeExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class linkE2Etesting {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

//1. Give me the count of links on the page.
        //2. Count of footer section-

        System.setProperty("webdriver.chrome.driver","D:\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("http://qaclickacademy.com/practice.php");

        System.out.println(driver.findElements(By.tagName("a")).size());

        WebElement footerdriver=driver.findElement(By.id("gf-BIG"));// Limiting webdriver scope

        System.out.println(footerdriver.findElements(By.tagName("a")).size());

        //3-
        WebElement coloumndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(coloumndriver.findElements(By.tagName("a")).size());

        //4- click on each link in the coloumn and check if the pages are opening-
        for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++) {

            String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

            coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
            //Thread.sleep(5000L);

        }

        Set<String> a= driver.getWindowHandles();
        Iterator<String> it=a.iterator();

        while (it.hasNext()){  //has.Next() -checks if the iteration has more elements. and Next() directly jumps on next element
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());

        }
    }
}