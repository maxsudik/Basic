import Main.Panels.LoginPanel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {

    private WebDriver driver;

    @BeforeTest

    public void beforeTest(){

        System.setProperty("webdriver.chrome.driver", "lib/WebDrivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://beta.tickitforhealth.com/test/login");
    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }

    @Test
    public void creatingNewUser(){

        LoginPanel login = new LoginPanel();
        login.loginAdmin(driver);
    }

}
