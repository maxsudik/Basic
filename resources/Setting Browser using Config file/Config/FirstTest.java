package main.java;

import Config.PropertiesFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

    public static String browser;
    static WebDriver driver;

    public static void main (String[] args){
        //setBrowser();
        PropertiesFile.readPropertiesFile();
        setBrowserConfig();
        runTest();
        PropertiesFile.writePropertiesFile();
    }

    public static void setBrowser(){
        browser ="Firefox";

    }

    public static void setBrowserConfig(){

        if(browser.contains("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "lib/WebDrivers/geckodriver");
            driver = new FirefoxDriver();
        }

        if(browser.contains("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "lib/WebDrivers/chromedriver");
            driver = new ChromeDriver();
        }
    }

    public static void runTest(){
        driver.get("https://beta.tickitforhealth.com/test/login");
        driver.quit();
    }


}
