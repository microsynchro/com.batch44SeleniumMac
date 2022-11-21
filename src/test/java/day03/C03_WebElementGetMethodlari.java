package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_WebElementGetMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//        http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

        WebElement signin = driver.findElement(By.id("sign-in"));

        System.out.println("size: " + signin.getSize());
        System.out.println("aria role: " + signin.getAriaRole());
        System.out.println("accessible name: " + signin.getAccessibleName());
        System.out.println("attribute name: " + signin.getAttribute("id"));
        System.out.println("get location: " + signin.getLocation());
        System.out.println("with size: " + signin.getRect().width);
        System.out.println("css value of color: " + signin.getCssValue("color"));







    }
}
