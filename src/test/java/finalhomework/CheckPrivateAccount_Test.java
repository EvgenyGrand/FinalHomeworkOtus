package finalhomework;

import components.ChangePersonal;
import components.InputPesonalInfo;
import components.MainPage;
import components.StartModalWindow;
import data.DriverData;
import exception.BrowserNotSupportException;
import factory.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class CheckPrivateAccount_Test {
    private WebDriver driver;

    @BeforeAll
    public static void init() {
        WebDriverManager.chromedriver().setup();

    }

    @BeforeEach
    public void initDriver() throws BrowserNotSupportException {

        driver = new WebDriverFactory().getDriver(DriverData.CHROME, null);

    }

    @Test
    public void testCheckPrivateAccount() throws InterruptedException {
        driver.manage().window().maximize();
        MainPage mainPage = new MainPage(driver);
        StartModalWindow startModalWindow = new StartModalWindow(driver);
        ChangePersonal changePersonal = new ChangePersonal(driver);
        InputPesonalInfo inputPesonalInfo = new InputPesonalInfo(driver);
        mainPage.open();
        mainPage.clickRegistrationButton();
        startModalWindow.inputCreds();
        changePersonal.gotoPersonalAccount();
        inputPesonalInfo.sendFilds();



    }
}

//    @AfterEach
//    public void close() {
//        if (this.driver != null) {
//            this.driver.close();
//            this.driver.quit();
//        }




