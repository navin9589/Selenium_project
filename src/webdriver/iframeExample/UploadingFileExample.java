package webdriver.iframeExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadingFileExample {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement uploadFile = driver.findElement(By.id("file-upload"));
        uploadFile.sendKeys("C:\\Users\\navin\\OneDrive\\Desktop\\desktop\\company.properties");
        driver.findElement(By.id("file-submit")).click();

        WebElement fileUploaded = driver.findElement(By.xpath("File Uploaded!"));

        if (fileUploaded.getText().equalsIgnoreCase("File Uploaded!")) {
            System.out.println("Yes file is uploaded successfully");
        } else {
            System.out.println("Yes file is not uploaded ");


        }

        driver.close();


    }


}
