package webdriver.actionexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ContextClickExample {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webDriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");


        WebElement rightClick = driver.findElement(By.xpath("right click me"));

        Actions actions = new Actions(driver);

        actions.contextClick(rightClick)
                .pause(Duration.ofSeconds(4))
                .perform();
        driver.close();



    }
}


