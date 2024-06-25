package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webDriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
            driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        WebElement element = driver.findElement(By.xpath("//input[@id='login1']"));
        element.sendKeys("Hello");

        Thread.sleep(5000);
        driver.close();
    }
}
