package webdriver.cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetSingleCookies {


    public static void main(String[] args) {

        System.setProperty("webDriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tcs.com/");


        Cookie cookie = new Cookie("name","Edso Services");
        driver.manage().addCookie(cookie);

        System.out.println(driver.manage().getCookieNamed("name"));
        driver.close();
    }
}


