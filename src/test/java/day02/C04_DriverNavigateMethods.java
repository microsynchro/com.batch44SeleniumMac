package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://amazon.com");
        // driver.get ile ayni islemi yapar ama daha hizlidir.

        driver.navigate().to("https://techproeducation.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();


    }
}
