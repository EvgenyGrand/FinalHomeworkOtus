package components.dpopdownlkmenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbsBasePages;

public class DropdawnLKMenu extends AbsBasePages implements IDropDownMenuLK {
    public DropdawnLKMenu(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "p.header2-menu__item-text.header2-menu__item-text__username")
    private WebElement dropdownlist;

    @FindBy(css = "b[class='header2-menu__dropdown-text_name']")
    private WebElement myAccount;



    public void gotoPersonalAccount() {
        explicitWait(dropdownlist);
        moveToElement(dropdownlist,myAccount);
    }
}