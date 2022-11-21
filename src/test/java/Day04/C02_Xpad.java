package Day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class C02_Xpad {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


//        1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

//        2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
//        3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
        if (deleteButton.isDisplayed()) {
            System.out.println("Delete Button is visible test PASSED");
        } else {
            System.out.println("Delete Button is visible test FAILED");
        }
//        4- Delete tusuna basin
        deleteButton.click();

//        5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElementsText = driver.findElement(By.xpath("//h3"));
        if (addRemoveElementsText.isDisplayed()) {
            System.out.println("Add/Remove Elements text is visible test PASSED");
        } else {
            System.out.println("Add/Remove Elements text is visible test FAILED");
        }

        driver.close();
    }
}
