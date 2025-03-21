package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.WindowManager;

import java.util.List;

public class BaseTests {
    public WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        goHome();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://hightest.nc/");
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void teadDown(){
        driver.quit();
    }

    public WindowManager getWindowsManager(){
        return new WindowManager(driver);
    }
}
