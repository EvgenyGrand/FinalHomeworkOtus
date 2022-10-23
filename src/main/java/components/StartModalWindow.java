package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StartModalWindow extends MainPage {

    public StartModalWindow(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "input[type='text'][placeholder='Электронная почта']")
    private WebElement login;

    @FindBy(css = "input[type='password']")
    private WebElement password;

    @FindBy(css = "button[class='new-button new-button_full new-button_blue new-button_md']")
    private WebElement buttonLK;

    public void inputCreds(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(login));
        login.clear();
        login.sendKeys(inputLogin());
        password.clear();
        password.sendKeys(inputPassword());
        buttonLK.click();
    }
}
