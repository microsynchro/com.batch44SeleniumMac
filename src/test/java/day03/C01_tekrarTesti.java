package day03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_tekrarTesti {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//        youtube web sayfasina gidin ve sayfa basliginin "youtube olup olmadigini dogrulayin (verify),
//        eger degilse dogru basligi (actual title) konsolda yazdirin
        driver.navigate().to("http://youtube.com");
        driver.getTitle();
        String actualTitleOfYoutube = driver.getTitle();
        String titleYoutubeShould = "youtube";

        if (titleYoutubeShould.matches(actualTitleOfYoutube)){
            System.out.println("Title test PASSED");
        }else {
            System.out.println("Title test FAILED. " + "Actual title is: " + driver.getTitle());
        }

//        sayfa URL sinin youtube icerip icermedigini (contains) dogrulayin, icermiyorsa dogru URL yi yazdirin

        String actualYoutubeURL = driver.getCurrentUrl();
        String expectedYoutubeURL = "youtube";

        if (actualYoutubeURL.contains(expectedYoutubeURL)){
            System.out.println("URL test PASSED");
        } else {
            System.out.println("URL test FAILED. " + "Actual URL is: " + driver.getCurrentUrl());
        }

//        Daha sonra Amazon sayfasina gidin.
        driver.navigate().to("https://amazon.com");

//        youtube sayfasina geri donun
        driver.navigate().back();

//        sayfayi yenileyin
        driver.navigate().refresh();

//        amazon sayfasina donun
        driver.navigate().forward();

//        sayfayi fullscreen yapin
        driver.manage().window().fullscreen();

//        ardindan sayfa basliginin "Amazon" icerip icermedigini (contains) dogrulayin, yoksa
//        dogru basligi (actual title) yazdirin.

        String actualTitleOfAmazon = driver.getTitle();
        String amazonTitleHas = "Amazon";
        if(actualTitleOfAmazon.contains(amazonTitleHas)){
            System.out.println("Amazon.com title contains test PASSED");
        } else {
            System.out.println("Amazon.com title contains test FAILED. " + "Actual title is :" + driver.getTitle());
        }

//        sayfa URL sinin https://www.amazon.com/ olup olmadigini dogrulayin, dogru degilse URL yi yazdirin

        String actualAmazonUrl = driver.getCurrentUrl();
        String amazonUrl = "https://www.amazon.com/";

        if(actualAmazonUrl.equals(amazonUrl)){
            System.out.println("Amazon URL test PASSED");
        } else {
            System.out.println("Amazon URL test FAILED" + "Actual URL :" + driver.getCurrentUrl());
        }

        //        sayfayi kapatin
        driver.close();





    }
}
