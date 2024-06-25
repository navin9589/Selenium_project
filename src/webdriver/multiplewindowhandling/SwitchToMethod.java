package webdriver.multiplewindowhandling;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class SwitchToMethod {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");

        WebElement openWindowId = driver.findElement(By.id("openwindow"));
        openWindowId.click();

        String windowId = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for (String s : allWindows) {
            if (!s.contentEquals(windowId)){
                driver.switchTo().window(s);
                System.out.println(driver.getTitle());
                Thread.sleep(2000);
                driver.close();
            }
        }
        driver.switchTo().window(windowId);
        System.out.println(driver.getTitle());


        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(file, new File(""));

        driver.close();

    }
}




/*
WebElement element=driver.findEliments(By.xpath(""));
element.click();

String currentId=driver.getWindowHandle();
SOUT(currentId.getText());

Set<String> allid=driver.getWindowHandles();
for(String a:allid){
        if(!a.contentEquals(currentId)){
        driver.swithTo().window(a)
sout(driver.getTilte);
driver.close()
}

        }
        driver.swithTo().window(currentId);
sout(driver.getTilte())
        driver.close();*/
