package webdriver.actionexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ClickAndHoldExample {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webDriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");


        WebElement elementA = driver.findElement(By.xpath("//li[text()='A']"));
        Actions actions = new Actions(driver);

        actions.clickAndHold(elementA)
                .pause(Duration.ofSeconds(4))
                .release()
                .pause(Duration.ofSeconds(4))
                .build()
                .perform();
        driver.close();
    }
}
