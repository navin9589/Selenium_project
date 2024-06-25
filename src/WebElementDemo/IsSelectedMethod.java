package WebElementDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webDriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        WebElement radioBtn = driver.findElement(By.id("bmwradio"));



        System.out.println(radioBtn.isSelected());  //false bcoz pehele se select nahi hai
        radioBtn.click();
        Thread.sleep(5000);
        System.out.println(radioBtn.isSelected());  //true bcoz abhi click krke select hua.





        Thread.sleep(5000);
        driver.close();
    }
}
