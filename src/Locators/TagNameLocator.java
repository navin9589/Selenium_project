package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagNameLocator {
    public static  void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        //Retrun type of FindElements is List<WebElement>
        List<WebElement> allelements = driver.findElements(By.tagName("input"));
        System.out.println( allelements.size());

       /* WebElement element= driver.findElement(By.id("login1"));
        System.out.println(element);
        */


        Thread.sleep(5000);
        driver.close();

    }}