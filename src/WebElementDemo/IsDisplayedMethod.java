package WebElementDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webDriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        WebElement textBoxElement = driver.findElement(By.id("displayed-text"));
        WebElement hidebtn = driver.findElement(By.id("hide-textbox"));
        WebElement showbtn = driver.findElement(By.id("show-textbox"));



        System.out.println(hidebtn.isDisplayed());      //true
        hidebtn.click();
        Thread.sleep(5000);

        System.out.println(showbtn.isDisplayed());         //true
        showbtn.click();
        Thread.sleep(5000);


        System.out.println(textBoxElement.isDisplayed());
        textBoxElement.click();
        Thread.sleep(5000);




        Thread.sleep(5000);
        driver.close();
    }
}

