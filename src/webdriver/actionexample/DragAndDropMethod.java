package webdriver.actionexample;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static jdk.internal.org.jline.terminal.spi.TerminalProvider.Stream.Output;

public class DragAndDropMethod {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");


        WebElement srcElement = driver.findElement(By.id("draggable"));
        WebElement dropElement = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);

        actions.dragAndDrop(srcElement,dropElement)
                .pause(Duration.ofSeconds(4))
                .perform();

        Thread.sleep(4000);

        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(file, new File("C:\\Users\\navin\\OneDrive\\Desktop\\ScreeenShot jira\\a.txt"));
        driver.close();
    }
}
