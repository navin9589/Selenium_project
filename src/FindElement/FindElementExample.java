package FindElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementExample {
    public static  void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        //Return type of FindElement() method is WebElement.
       WebElement element= driver.findElement(By.id("login1"));
       //If no desired element located then NoSuchElementException.
       element.sendKeys("Navin@123");

       Thread.sleep(3000);
       driver.close();
    }
}