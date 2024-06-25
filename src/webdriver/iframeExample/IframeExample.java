package webdriver.iframeExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class IframeExample {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();

        List<WebElement> elements = driver.findElements(By.tagName("iframe"));  //total iframe in wep page
        System.out.println(elements.size());


        //  driver.switchTo().frame("frame1");

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']"))); //by web element


        //WebElement textElement = driver.findElement(By.xpath("//h1[@id = 'sampleHeading']")); //xpath didn't work on iframe
        // that's why we use switchTo() for iframe handling.
        WebElement textElement = driver.findElement(By.id("sampleHeading"));
        System.out.println(textElement.getText());  // to get text

        driver.switchTo().parentFrame();
        WebElement element = driver.findElement(By.xpath("//h1[text()='Frames']"));
        System.out.println(element.getText());
        Thread.sleep(3000);
    }
}