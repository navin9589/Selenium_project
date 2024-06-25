package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DriverMethods {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.driver.chrome","");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/");

      WebElement element = driver.findElement(By.xpath("//input[@class='Pke_EE']"));

       element.sendKeys("t shirt");
       element.sendKeys(Keys.ENTER);
       Actions actions = new Actions(driver);


       Thread.sleep(3000);
       driver.close();






    }
}
