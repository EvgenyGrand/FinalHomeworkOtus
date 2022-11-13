package components.dropdownmenuCCL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AbsBasePages;

public class FieldDropdownMenu extends AbsBasePages implements IDropdownMenuCCL {

    public FieldDropdownMenu(WebDriver driver) {
        super(driver);
    }


    public void sendDropDownMenuCountry() {

    }

    @Override
    public void sendDropDownMenuCity() {

    }

    @Override
    public void sendDropDownMenuLanguage() {

    }

    public void sendDropDownMenuCountry(WebElement country, WebElement changecountry) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 5);
        webDriverWait.until(ExpectedConditions.not(ExpectedConditions.attributeContains(By.cssSelector("input[name='country']"), "disabled", "true")));
        country.click();
        explicitWait(changecountry);
        changecountry.click();
    }

    public void sendDropDownMenuCity(WebElement city, WebElement changeCity) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 5);
        webDriverWait.until(ExpectedConditions.not(ExpectedConditions.attributeContains(By.cssSelector("input[name='city']"), "disabled", "true")));
        city.click();
        explicitWait(changeCity);
        changeCity.click();
    }

    public void sendDropDownMenuLanguage(WebElement language, WebElement changeLanguage) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 5);
        webDriverWait.until(ExpectedConditions.not(ExpectedConditions.attributeContains(By.cssSelector("input[name='english_level']"), "disabled", "true")));
        language.click();
        explicitWait(changeLanguage);
        changeLanguage.click();
    }


}


