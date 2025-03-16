package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SendMailPage {
    private WebDriver driver;
    private By mailField = By.id("email");
    private By btn = By.id("submitMail");
    private By text = By.cssSelector("h2");

    public SendMailPage(WebDriver driver){
        this.driver = driver;
    }

    public void setMail (String mail){
        driver.findElement(mailField).sendKeys(mail);
    }

    public void clickBtn(){
        driver.findElement(btn).click();
    }

    private void waitForOneSecond() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Bonne pratique : réinterrompre le thread
        }
    }

    public String getText(){
        waitForOneSecond();
        waitForOneSecond();
        return driver.findElement(text).getText();
    }




}
