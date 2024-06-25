package webdriver.actionexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MoveToElementMethod {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");


        WebElement element = driver.findElement(By.xpath("//span[text()='Beauty, Toys & More']"));


        Actions actions = new Actions(driver);

        actions.moveToElement(element)
                .pause(Duration.ofSeconds(4))
                .perform();

        Thread.sleep(4000);
        driver.close();
    }
}
