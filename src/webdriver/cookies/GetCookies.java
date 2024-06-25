package webdriver.cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetCookies {

    public static void main(String[] args) {

        System.setProperty("webDriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tcs.com/");

        Set<Cookie> allCookies = driver.manage().getCookies();
        for (Cookie c: allCookies){
            System.out.println(c);
        }
        driver.close();
    }
}
