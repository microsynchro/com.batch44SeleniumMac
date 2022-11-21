package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigationMethodsPractice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver");
        WebDriver driver=new ChromeDriver();

        // youtube ana sayfasina git
        driver.navigate().to("https://youtube.com");
        // amazon ana sayfasina git
        driver.navigate().to("https://amazon.com");
        // tekrar youtube.com sayfasina git
        driver.navigate().back();
        // yeniden amazon.com sayfasina git
        driver.navigate().forward();
        // sayfayi yenile
        driver.navigate().refresh();
        // sayfayi tam ekran yapin
        driver.manage().window().fullscreen();
        // sayfayi kapatin / tum sayfalari kapatin
        driver.quit();
        // driver.quit, driver'in actigi tum sayfalari kapatir.
        // driver.close driver'in actigi sayfayi kapatir.
    }
}
