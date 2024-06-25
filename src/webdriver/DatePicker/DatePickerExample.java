package webdriver.DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DatePickerExample {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webDriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.abhibus.com/");

        Thread.sleep(3000);

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(3));

        WebElement fromStation = driver.findElement(By.xpath("//input[@placeholder='From Station']"));
        fromStation.sendKeys("Pune");

        List<WebElement> allCities = driver.findElements(By.xpath("//input[@placeholder='From Station']//following::div[@class=' col']"));
        for (WebElement element : allCities) {
            if (element.getText().contentEquals("Pune")) {
                webDriverWait.until((ExpectedConditions.elementToBeClickable(element))).click();
                break;
            }
        }
        WebElement toStation = driver.findElement(By.xpath("//input[@placeholder='To Station']"));
        toStation.sendKeys("Nagpur");

        List<WebElement> allDestinationCities = driver.findElements(By.xpath("//input[@placeholder='To Station']//following::div[@class=' col']"));
        for (WebElement element : allDestinationCities) {
            if (element.getText().contentEquals("Nagpur")) {
                webDriverWait.until(ExpectedConditions.elementToBeClickable(element)).click();
                break;
            }


            List<WebElement> allDates = driver.findElements(By.xpath("//input[@placeholder='Onward Journey Date']"));
            for (WebElement element1 : allDates) {
                if (element.getText().contentEquals("28")) {
                    element.click();
                    break;
                }
            }

            driver.findElement(By.id("search-button")).click();

            driver.close();
        }

    }

}
