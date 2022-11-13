package components.modalwindows;

import components.inputcreds.InputCreds;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartModalWindow extends InputCreds implements IModalWindow {

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
        explicitWait(login);
        fillField(login,inputLogin());
        fillField(password,inputPassword());
        clickToElement(buttonLK);
    }

    @Override
    public void modalShouldNotBePresent() {

    }

}
