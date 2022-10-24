package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AbsBasePages;

import java.time.Duration;

public class ChangePersonal extends StartModalWindow{
    public ChangePersonal(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "div[class = 'header2-menu__item-wrapper header2-menu__item-wrapper__username']")
    private WebElement dropdownlist;

    @FindBy(css = "b[class='header2-menu__dropdown-text_name']")
    private WebElement myAccount;

//     Actions action = new Actions(driver);


    public void GotoPersonalAccount() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,(5));
        wait.until(ExpectedConditions.visibilityOf(dropdownlist));
        action.moveToElement(dropdownlist).moveToElement(myAccount).click().build().perform();

    }
}