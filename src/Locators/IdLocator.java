package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

        public static  void main(String[] args) throws InterruptedException {


            System.setProperty("webdriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

           driver.findElement(By.id("login1")).sendKeys("Navin@123");

            Thread.sleep(3000);
            driver.close();
        }}


