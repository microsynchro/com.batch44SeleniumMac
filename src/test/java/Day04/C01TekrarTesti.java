package Day04;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01TekrarTesti {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//        a.google web sayfasına gidin. https://www. amazon.com/
        driver.navigate().to("https://wwww.amazon.com");
//        b. Search(ara) “city bike”
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("city bike"+ Keys.ENTER);
//        searchBox.submit();

//        c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement resultTextElement = driver.findElement(By.className("sg-col-inner"));
        System.out.println(resultTextElement.getText());

//        e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
       /*
       WebElement firstItemOfResult = driver.findElement(By.className("s-image"));
        firstItemOfResult.click();
        */

//        sadece click yapmak gibi basit bir islemde kullanacagimiz webelementler icin
//        variable olusturmadan direk locate edip, istedigimiz islemi yapabiliriz
        driver.findElement(By.className("s-image")).click();


    }
}
