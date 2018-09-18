package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Launch {

    static WebDriver driver;

    @BeforeTest
    public static void capabilities(){
        System.setProperty("webdriver.chrome.driver", "lib/WebDrivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://beta.tickitforhealth.com/test/login");


    }

    @Test
    public static void launch(){

        String TITLE = driver.getTitle();
        String URL = driver.getCurrentUrl();

        if (TITLE.equals("Log in > Demo Clinic | Tickit")){
            System.out.println("Title " +TITLE+ " is correct");
        }
        else{
            System.out.println("Title " +TITLE+ " is not correct");
        }

        if (URL.equals("https://beta.tickitforhealth.com/test/login")){
            System.out.println("URL " +URL+ " is correct");
        }
        else{
            System.out.println("URL " +URL+ " is not correct");
        }

        driver.quit();
    }


}