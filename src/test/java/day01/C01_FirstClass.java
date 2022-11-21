package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_FirstClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        // biz driver objesi olusturdugumuzda bos bir chore browser acilir

        driver.get("https://wwww.amazon.com");
        // drver.get metod'u driver'a gidecegi web adresini girmemizi saglar.

        Thread.sleep(3000);

        driver.close();


    }
}
