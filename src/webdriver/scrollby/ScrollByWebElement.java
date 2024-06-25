package webdriver.scrollby;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByWebElement {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        WebElement element = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

        javascriptExecutor.executeScript("arguments[0].scrollIntoView();",element); // scroll down

        javascriptExecutor.executeScript("window.scrollBy(0,-1000)"); // to scroll up.

        Thread.sleep(3000);

        driver.close();

    }


}
