package FindElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsExample {
    public static  void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        //Return type of FindElements is List<WebElement>
       List<WebElement> allElements = driver.findElements(By.tagName("a"));
        System.out.println( allElements.size());
        Thread.sleep(5000);
        driver.close();
        //if no elements found then it will not throw any exception it will throw empty or 0 value.
    }
}