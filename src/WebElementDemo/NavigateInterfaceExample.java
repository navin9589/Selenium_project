package WebElementDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateInterfaceExample {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webDriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi"); //other than get() we can also open url with navigate()to
        driver.findElement(By.xpath("//u[text()='Create a new account']")).click();
        Thread.sleep(5000);

        driver.navigate().back();
        Thread.sleep(5000);

        driver.navigate().forward();
        Thread.sleep(5000);

        driver.navigate().refresh();
        Thread.sleep(3000);

        driver.close();
    }
}
