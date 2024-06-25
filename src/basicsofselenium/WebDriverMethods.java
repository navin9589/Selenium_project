package basicsofselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

    public static  void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\navin\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        driver.get("http://www.amazon.in"); // To open a url.

      String url =  driver.getCurrentUrl(); // Url open and print url
        System.out.println(url);
        System.out.println(driver.getCurrentUrl()); //can also be print directly without above.
 
        String title =  driver.getTitle(); // to get title of webpage
        System.out.println(title);

       // String pagesource = driver.getPageSource(); // to fetch all the data of website
        //System.out.println(pagesource);

Thread.sleep(3000);
    driver.close();
    }
}
