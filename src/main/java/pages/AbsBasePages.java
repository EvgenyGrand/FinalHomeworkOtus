package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbsBasePages {


    private String hostname = System.getProperty("base.url");
    private String explisityWait = System.getProperty("explisityWait");


    protected WebDriver driver;
    protected Actions action;



    public AbsBasePages(WebDriver driver) {
        this.driver = driver;
        this.action = new Actions(driver);


        PageFactory.initElements(driver,  this);

    }

    public void open() {
        driver.get(hostname);

    }

    public void explicitWait(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt(explisityWait));
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public void moveToElement(WebElement elementFirst, WebElement elementSecond) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", elementFirst);
        action.moveToElement(elementFirst).moveToElement(elementSecond).click().build().perform();
    }

    public void fillField(WebElement element, String input) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        element.clear();
        element.sendKeys(input);
    }

    public void clickToElement(WebElement element) {
        element.click();
    }



        public void scrolltoElement (WebElement element){
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        }

    }


