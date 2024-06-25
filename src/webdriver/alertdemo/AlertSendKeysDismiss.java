package webdriver.alertdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertSendKeysDismiss {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webDriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");


        driver.findElement(By.id("confirmbtn")).click();

        Alert alert = driver.switchTo().alert();

        alert.dismiss();
        Thread.sleep(3000);

        driver.close();
    }
}

