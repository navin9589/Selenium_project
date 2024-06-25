package webdriver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Screenshot {

        public static void main(String[] args) throws InterruptedException, IOException {

            System.setProperty("webDriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.abhibus.com/");
            driver.manage().window().maximize();
            Thread.sleep(3000);

            File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileHandler.copy(file,new File("C:\\Users\\navin\\OneDrive\\Desktop\\it\\ss.jpg"));

            driver.close();

        }
  }