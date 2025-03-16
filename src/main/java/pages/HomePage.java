package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public ToolboxPage cliquerSurToolbox() {
        clickByTitle("TOOLBOX");
        return new ToolboxPage(driver);
    }


    public void clickByTitle(String titleText) {
        driver.findElement(By.linkText(titleText)).click();
    }

}
