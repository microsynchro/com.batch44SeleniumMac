package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02LoginTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//      1. Aşağıdaki görevi tamamlayın.
//          a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
//          b. Sign in butonuna basin
        WebElement signInLink = driver.findElement(By.id("sign-in")); // sadece locate ettik ve bir variable'a asign ettik.
        signInLink.click();
//          c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        WebElement passwordBox = driver.findElement(By.id("session_password"));
        WebElement signInButton = driver.findElement(By.name("commit"));
//          d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
//          i. Username : testtechproed@gmail.com
//          ii. Password : Test1234!
        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordBox.sendKeys("Test1234!");
//        Thread.sleep(3000);
        signInButton.click();
//          e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement expectedUserId = driver.findElement(By.tagName("h1"));
        System.out.println(expectedUserId.getText());
        String expectedUserIdText = "Welcome to Address Book";
        String actualUserIdText = expectedUserId.getText();

        if (actualUserIdText.equals(expectedUserIdText)){
            System.out.println("Sign in test PASSED");
        } else {
            System.out.println("Sign in test FAILED");
        }
//          f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement adresses = driver.findElement(By.linkText("Addresses"));
        WebElement signOut = driver.findElement(By.linkText("Sign out"));
        System.out.println(adresses.isDisplayed());

        if (adresses.isDisplayed()){
            System.out.println("Adresses text display test PASSED");
        } else {
            System.out.println("Adresses text display test FAILED");
        }

        if (signOut.isDisplayed()){
            System.out.println("SignOut text display test PASSED");
        } else {
            System.out.println("SignOut text display test FAILED");
        }
//      2. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linklist = driver.findElements(By.tagName("a"));
        System.out.println("There are " + linklist.size() + " links in the page");

        driver.close();

    }
}
