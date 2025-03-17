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

    private By toolbox = By.linkText("TOOLBOX");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public ToolboxPage cliquerSurToolbox() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement toolboxClick = wait.until(ExpectedConditions.visibilityOfElementLocated(toolbox));
        toolboxClick.click();
        return new ToolboxPage(driver);
    }

}
