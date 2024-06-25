package webdriver.actionexample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyBoardBasedMethod {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");


        WebElement textBoxElement = driver.findElement(By.name("q"));
        Actions actions = new Actions(driver);

        actions.moveToElement(textBoxElement)
                .click(textBoxElement)
                .keyDown(Keys.SHIFT)
                .pause(Duration.ofSeconds(4))
                .sendKeys("mobiles")
                .keyUp(Keys.SHIFT)
                .build()
                .perform();
        Thread.sleep(4000);
        driver.close();
    }
}



