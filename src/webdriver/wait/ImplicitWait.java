package webdriver.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ImplicitWait {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");

      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      //it is also called globally wait i.e it will apply to all the elements.

        WebElement element = driver.findElement(By.id("openwindow"));
        System.out.println(element);
        driver.close();

    }
}