package components.addcontact;

import components.dropdownmenuCCL.FieldDropdownMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class AddContact extends FieldDropdownMenu implements IAddContact {

    public AddContact(WebDriver driver) {
        super(driver);
    }

    @Override
    public void addContact() {

    }
}
