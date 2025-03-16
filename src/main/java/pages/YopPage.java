package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class YopPage {
    private WebDriver driver;
    private By mailField = By.id("login");
    private By cookie = By.xpath("(//p[@class='fc-button-label'])[1]");
    private String mailIframeId = "ifmail";
    private By mailReponse = By.xpath("//*[@id=\"mail\"]/div/div/div[2]/div[1]");

    public YopPage (WebDriver driver){
        this.driver = driver;
    }

    public void goToUrl(String url){
        driver.get(url);
    }

    public void autoriserCookie(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement autoriserButton = wait.until(ExpectedConditions.visibilityOfElementLocated(cookie));
        autoriserButton.click();
    }

    public void setMail(String mail){
        driver.findElement(mailField).sendKeys(mail);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();
    }

    public String getHundread(){
        switchToMailArea();
        String texte = driver.findElement(mailReponse).getText();
        return texte;
    }

    private void switchToMailArea(){
        driver.switchTo().frame(mailIframeId);
    }
}
