package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.TableHeaderUI;
import java.time.Duration;

public class C08_ImplicitlyWait {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // implicitly wait testimiz boyunca sayfa acilmasi ve elemen bulunmasi konusunda driver'in
        // bekleyecegi maximum sureyi belirler.
        // bu sure icerisinde gorevini bitirir bitirmez, bir sonraki adima gecer.
        // bu sure icerisinde gorevini bitiremezse o zaman hata verir.

        // belirlenen maximum sure Thread.sleep'teki gibi mutlak bekleme suresi degildir.
        // yani Thread.sleep'teki gibi orn. 10 saniye yazildiysa 10 saniyenin tamamini beklemez.
        // 1 saniyede bile bitirse hemen gecer ve isleme devam eder.


        driver.get("https://www.techproeducation.com");
        //Thread.sleep(5000);

        driver.close();

    }
}
