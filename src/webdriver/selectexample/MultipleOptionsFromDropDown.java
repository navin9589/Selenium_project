package webdriver.selectexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleOptionsFromDropDown {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webDriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        WebElement dropDown = driver.findElement(By.id("multiple-select-example"));

        Select select = new Select(dropDown);
        select.selectByValue("apple");
        Thread.sleep(3000);
        select.selectByIndex(1);
        Thread.sleep(3000);
        select.selectByVisibleText("Peach");
        Thread.sleep(3000);


       /* Select select1 = new Select(dropDown);
        select1.deselectByValue("apple");
        Thread.sleep(3000);
        select1.deselectByIndex(1);
        Thread.sleep(3000);
        select1.deselectByVisibleText("Peach");
        Thread.sleep(3000);
        */

        select.deselectAll();

        driver.close();
    }
}
