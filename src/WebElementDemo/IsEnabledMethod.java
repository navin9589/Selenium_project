package WebElementDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webDriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        WebElement textBoxElement = driver.findElement(By.id("enabled-example-input"));
        WebElement disableBtn = driver.findElement(By.id("disabled-button"));
        WebElement enableBtn = driver.findElement(By.id("enabled-button"));

        System.out.println(textBoxElement.isEnabled());    //true
        textBoxElement.click();

        System.out.println(disableBtn.isEnabled());      //false
        disableBtn.click();

        System.out.println(enableBtn.isEnabled());         //true
        enableBtn.click();

        Thread.sleep(5000);
        driver.close();
    }
}
//IsEnabled value only returns boolean value.