package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocatorByClassAttribute {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webDriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

       // WebElement element = driver.findElement(By.cssSelector("input[class='signinbtn']"));
        WebElement element = driver.findElement(By.cssSelector("input.signinbtn"));
        //we can replace class with dot in css selector.


        element.click();

        Thread.sleep(3000);
        driver.close();

    }
}