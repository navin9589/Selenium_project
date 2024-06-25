package webdriver.multiplewindowhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetWindowHandle {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");

        WebElement openWindowId = driver.findElement(By.id("openwindow"));
        openWindowId.click();

        String windowId = driver.getWindowHandle();   //Will return the current window id.
        System.out.println(windowId);

        Set<String> allWindows = driver.getWindowHandles();
        System.out.println(allWindows);                 // this will return parent and child window id.

        Thread.sleep(2000);

        //driver.close;      // this only closes the parent window.

        driver.quit();      // this will close both parent and child window.


    }
}