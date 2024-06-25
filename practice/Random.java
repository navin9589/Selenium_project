package practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Random {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chromedriver","path");
        WebDriver driver = new ChromeDriver();

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

        javascriptExecutor.executeScript("window.scrollBy(0,2000)"); // we have to guess.
        javascriptExecutor.executeScript("window.scrollBy(0,-200)");

        Thread.sleep(3000);
        driver.close();


     }
}
