package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class TestQuizzPage {
    private WebDriver driver;
    private By textLoad = By.xpath("//*[@id=\"loader\"]/p[1]");
    private By titlePageQuizz = By.cssSelector("h1");

    private By Q5 = By.xpath("//*[@id=\"main_content\"]//div[5]");
    private By Q8 = By.xpath("//*[@id=\"main_content\"]//div[8]");
    private By Q10 = By.xpath("//*[@id=\"main_content\"]//div[10]");
    private By Q13 = By.xpath("//*[@id=\"main_content\"]//div[13]");
    private By Q16 = By.xpath("//*[@id=\"main_content\"]//div[16]");
    private By Q19 = By.xpath("//*[@id=\"main_content\"]//div[19]");
    private By BTN = By.id("submit");

    private By R_Q1 = By.cssSelector("input[name='0'][value='1']");
    private By R_Q2 = By.cssSelector("input[name='1'][value='2']");
    private By R_Q3 = By.cssSelector("input[name='2'][value='1']");
    private By R_Q4 = By.cssSelector("input[name='3'][value='2']");
    private By R_Q5 = By.cssSelector("input[name='4'][value='2']");
    private By R_Q6 = By.cssSelector("input[name='5'][value='3']");
    private By R_Q7 = By.cssSelector("input[name='6'][value='2']");
    private By R_Q8 = By.cssSelector("input[name='7'][value='4']");
    private By R_Q9 = By.cssSelector("input[name='8'][value='1']");
    private By R_Q10 = By.cssSelector("input[name='9'][value='3']");
    private By R_Q11 = By.cssSelector("input[name='10'][value='4']");
    private By R_Q12 = By.cssSelector("input[name='11'][value='2']");
    private By R_Q13 = By.cssSelector("input[name='12'][value='3']");
    private By R_Q14 = By.cssSelector("input[name='13'][value='2']");
    private By R_Q15 = By.cssSelector("input[name='14'][value='4']");
    private By R_Q16 = By.cssSelector("input[name='15'][value='3']");
    private By R_Q17 = By.cssSelector("input[name='16'][value='3']");
    private By R_Q18 = By.cssSelector("input[name='17'][value='1']");
    private By R_Q19 = By.cssSelector("input[name='18'][value='2']");
    private By R_Q20 = By.cssSelector("input[name='19'][value='2']");







    public TestQuizzPage(WebDriver driver){
        this.driver = driver;
    }

    public String getTextLoad(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(textLoad)).getText();
    }

    public String getTitleQuizz(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(titlePageQuizz)).getText();
    }

    private void waitForOneSecond() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Bonne pratique : réinterrompre le thread
        }
    }


    public void checkAnswer()  {
        Actions actions = new Actions(driver);
        //Scroll
        WebElement q5 = driver.findElement(Q5);
        WebElement q8 = driver.findElement(Q8);
        WebElement q10 = driver.findElement(Q10);
        WebElement q13 = driver.findElement(Q13);
        WebElement q16 = driver.findElement(Q16);
        WebElement q19 = driver.findElement(Q19);
        WebElement btn = driver.findElement(BTN);

        //Check
        WebElement rq1 = driver.findElement(R_Q1);
        WebElement rq2 = driver.findElement(R_Q2);
        WebElement rq3 = driver.findElement(R_Q3);
        WebElement rq4 = driver.findElement(R_Q4);
        WebElement rq5 = driver.findElement(R_Q5);
        WebElement rq6 = driver.findElement(R_Q6);
        WebElement rq7 = driver.findElement(R_Q7);
        WebElement rq8 = driver.findElement(R_Q8);
        WebElement rq9 = driver.findElement(R_Q9);
        WebElement rq10 = driver.findElement(R_Q10);
        WebElement rq11 = driver.findElement(R_Q11);
        WebElement rq12 = driver.findElement(R_Q12);
        WebElement rq13 = driver.findElement(R_Q13);
        WebElement rq14 = driver.findElement(R_Q14);
        WebElement rq15 = driver.findElement(R_Q15);
        WebElement rq16 = driver.findElement(R_Q16);
        WebElement rq17 = driver.findElement(R_Q17);
        WebElement rq18 = driver.findElement(R_Q18);
        WebElement rq19 = driver.findElement(R_Q19);
        WebElement rq20 = driver.findElement(R_Q20);


        rq1.click();
        rq2.click();
        rq3.click();
        actions.scrollToElement(q5).perform();
        waitForOneSecond();

        rq4.click();
        rq5.click();
        actions.scrollToElement(q8).perform();
        waitForOneSecond();
        rq6.click();
        rq7.click();
        actions.scrollToElement(q10).perform();
        waitForOneSecond();
        rq8.click();
        rq9.click();

        actions.scrollToElement(q13).perform();
        waitForOneSecond();
        rq10.click();
        rq11.click();
        rq12.click();


        actions.scrollToElement(q16).perform();
        waitForOneSecond();
        rq13.click();
        rq14.click();
        rq15.click();

        actions.scrollToElement(q19).perform();
        rq16.click();
        rq17.click();
        rq18.click();

        actions.moveToElement(btn).perform();
        actions.scrollByAmount(0, 200).perform();
        waitForOneSecond();
        rq19.click();
        rq20.click();
        btn.click();



    }
}
