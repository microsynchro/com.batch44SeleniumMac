package day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_ManageWindowSetPractice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver");
        WebDriver driver=new ChromeDriver();

        // Amazon sayfasina gidelim
        driver.navigate().to("https://www.amazon.com");

        // sayfanin konumu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        // sayfanin konumu ve boyutunu isteginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(40,25));
        driver.manage().window().setSize(new Dimension(800,600));

        // sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        int xPosition = driver.manage().window().getPosition().getX();
        int yPosition = driver.manage().window().getPosition().getY();
        int xSize = driver.manage().window().getSize().getWidth();
        int ySize = driver.manage().window().getSize().getHeight();

        if (xPosition==40 && yPosition== 25 && xSize== 800 && ySize== 600){
            System.out.println("Position & size test PASSED");

        } else {
            System.out.println("Position & size test FAILED");
        }
        // sayfayi kapatin
        driver.close();
    }
}
