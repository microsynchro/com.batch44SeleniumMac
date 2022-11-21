package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_GetMethods {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://amazon.com");
        System.out.println(driver.getTitle());

        String actualTitle= driver.getTitle();
        String searchString= "Amazon";

        if (actualTitle.contains(searchString)){
            System.out.println("Title test PASSED!");
        } else {
            System.out.println("Title test FAILDED");
        }

        System.out.println(driver.getCurrentUrl());
        String actualUrl= driver.getCurrentUrl();
        String UrlSearchWord="amazon";

        if (actualUrl.contains(UrlSearchWord)){
            System.out.println("Url test PASSED");
        } else {
            System.out.println("Url test FAILED");
        }

        System.out.println(driver.getWindowHandle());

        String actualPageSource=driver.getPageSource();
        String pageSourceSearchWord="alisveris";

        if (actualPageSource.contains(pageSourceSearchWord)){
            System.out.println("Page source test PASSED");
        } else {
            System.out.println("Page source test FAILED");
        }




        driver.close();
    }


}
