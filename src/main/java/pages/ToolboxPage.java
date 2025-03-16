package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ToolboxPage {
    private WebDriver driver;
    private By clickQuizz = By.xpath("(//div[@class='d-flex absolute lang'])[1]/a[1]");

    public ToolboxPage (WebDriver driver){
        this.driver = driver;
    }

    public void ouvrirQuizz(){
        Actions actions = new Actions(driver);
        WebElement bonQuizz = driver.findElement(clickQuizz);
        actions.scrollToElement(bonQuizz).perform();
        bonQuizz.click();
    }


}
