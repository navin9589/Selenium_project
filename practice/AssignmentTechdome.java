package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentTechdome {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chrome-win64\\chrome.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        WebElement loginBtn = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
        loginBtn.click();

        WebElement numberTxtBox = driver.findElement(By.xpath("//input[@id='ap_email']"));
        numberTxtBox.sendKeys("9589120674");

        WebElement continueBtn = driver.findElement(By.xpath("//input[@id='continue']"));
        continueBtn.click();

        WebElement passTxtBox = driver.findElement(By.xpath("//input[@id='ap_password']"));
        passTxtBox.sendKeys("Samplepassword95");

        WebElement signBtn = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
        signBtn.click();


        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("almonds");

        WebElement searchBtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        searchBtn.click();


        WebElement almond = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]"));
        almond.click();

        WebElement productTitile = driver.findElement(By.xpath(" //span[@id='productTitle']"));
        System.out.println(productTitile.getText());

        WebElement productPrice = driver.findElement(By.xpath("(//span[text()='409'])[1]"));
        System.out.println(productPrice.getText());


        WebElement addToCartBtn = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
        addToCartBtn.click();

        WebElement goToCart = driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']"));
        goToCart.click();
        WebElement checkoutBtn = driver.findElement(By.xpath("//span[@id='sc-buy-box-ptc-button-announce']"));



      /*  WebElement productTitile = driver.findElement(By.xpath(""));
        WebElement productTitile = driver.findElement(By.xpath(""));

        WebElement productTitile = driver.findElement(By.xpath(""));
*/

        Thread.sleep(3000);
        driver.close();


    }
}