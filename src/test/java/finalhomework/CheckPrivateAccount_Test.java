package finalhomework;

import components.*;
import components.dpopdownlkmenu.DropdawnLKMenu;
import components.modalwindows.StartModalWindow;
import data.DriverData;
import exception.BrowserNotSupportException;
import factory.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
import pages.PageInputPesonalInfo;

public class CheckPrivateAccount_Test {
    private WebDriver driver;
    private WebDriverFactory webDriverFactory = new WebDriverFactory();

    @BeforeAll
    public static void init() {
        WebDriverManager.chromedriver().setup();

    }

    @BeforeEach
    public void initDriver() throws BrowserNotSupportException {

         driver = webDriverFactory.getDriver(DriverData.CHROME, null);

    }

    @Test
    public void testCheckPrivateAccount() throws InterruptedException, BrowserNotSupportException {
        driver.manage().window().maximize();
        MainPage mainPage = new MainPage(driver);
        StartModalWindow startModalWindow = new StartModalWindow(driver);
        DropdawnLKMenu changePersonal = new DropdawnLKMenu(driver);
        PageInputPesonalInfo inputPesonalInfo = new PageInputPesonalInfo(driver);
        CleanBrowser cleanBrowser = new CleanBrowser(driver);
        mainPage.open();
        mainPage.clickRegistrationButton();
        startModalWindow.inputCreds();
        changePersonal.gotoPersonalAccount();
        inputPesonalInfo.sendFilds();
        inputPesonalInfo.sendDropDownMenu();
        inputPesonalInfo.addContact();
        inputPesonalInfo.clickSave();
        inputPesonalInfo.closeSession();
        driver = webDriverFactory.getDriver(DriverData.CHROME, null);
        mainPage.open();






    }
}

//    @AfterEach
//    public void close() {
//        if (this.driver != null) {
//            this.driver.close();
//            this.driver.quit();
//        }




