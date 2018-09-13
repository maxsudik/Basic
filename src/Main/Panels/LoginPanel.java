package Main.Panels;

import Helper.Helper;
import Main.Objects.UserObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPanel {

    //Locators
    private static final String USERNAME_FIELD = "user_session_username";
    private static final String PASSWORD_FIELD = "user_session_password";
    private static final String LOGIN_BUTTON = "//input[@value='Login']";


    //Elements
    private static WebElement element = null;

    public static WebElement Username (WebDriver driver) {

        element = driver.findElement(By.id(USERNAME_FIELD));
        return element;
    }
    public static WebElement Password (WebDriver driver) {

        element = driver.findElement(By.id(PASSWORD_FIELD));
        return element;
    }
    public static WebElement Login (WebDriver driver) {

        element = driver.findElement(By.xpath(LOGIN_BUTTON));
        return element;
    }

    //Methods
    public void loginAdmin (WebDriver driver){

        Helper.waitForElement(driver, LOGIN_BUTTON);

        Username(driver).sendKeys(UserObject.User_Name);

        Password(driver).sendKeys(UserObject.User_Password);

        Login(driver).click();


    }
}
