package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_DriverManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver");
        WebDriver driver=new ChromeDriver();


        // amazon sayfasina gidelim
        driver.get("https://amazon.com");
        // sayfanin konumu ve boyutlarini yazdirin.
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        // sayfayi simge durumuna getirin
        driver.manage().window().minimize();
        //simge durumunda 3 saniye bekleyip sayfayi maximaze yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();
        // sayfanin konumu ve boyutlarini maximaze durumunda yazdirin
        System.out.println("max size:" + driver.manage().window().getPosition());
        System.out.println("max size:" + driver.manage().window().getSize());
        // sayfayi fullscreen yapin
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        // sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("fullsize:" + driver.manage().window().getPosition());
        System.out.println("fullsize:" + driver.manage().window().getSize());
        Thread.sleep(3000);
        // sayfayi kapatin
        driver.close();
    }
}
