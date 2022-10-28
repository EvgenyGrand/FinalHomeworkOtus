package components;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbsBasePages;

public class InputPesonalInfo extends AbsBasePages {

    public InputPesonalInfo(WebDriver driver) {
        super(driver);

    }

    @FindBy(id = "id_fname")
    private WebElement fname;

    @FindBy(id="id_lname")
    private WebElement lname;

    @FindBy(id = "id_fname_latin")
    private WebElement nameLatin;

    @FindBy(id = "id_lname_latin")
    private WebElement lNAmeLatin;

    @FindBy (id = "id_blog_name")
    private WebElement idBlogName;

    @FindBy(id = "input[title='День рождения")
    private WebElement dayOfBirth;

    @FindBy (css = "body > div.body-wrapper > div > div.js-lk-cv > div.container.container-padding-bottom > div.container__row > div.container__col.container__col_9.container__col_md-8.container__col_sm-12.container__col_border-left.lk-rightbar.print-block.print-wide > div > form > div:nth-child(2) > div.container__col.container__col_12 > div:nth-child(1) > div > div.container__col.container__col_9.container__col_ssm-12 > div:nth-child(1) > div.container__col.container__col_9.container__col_md-8.container__col_middle > div > label > div")
    private WebElement country;

    @FindBy (css = "button[title='Россия']")
    private WebElement changeCountry;

    @FindBy(css = "body > div.body-wrapper > div > div.js-lk-cv > div.container.container-padding-bottom > div.container__row > div.container__col.container__col_9.container__col_md-8.container__col_sm-12.container__col_border-left.lk-rightbar.print-block.print-wide > div > form > div:nth-child(2) > div.container__col.container__col_12 > div:nth-child(1) > div > div.container__col.container__col_9.container__col_ssm-12 > div:nth-child(2) > div.container__col.container__col_9.container__col_md-8.container__col_middle > div > label > div")
    private WebElement city;

    @FindBy(css = "button[title='Санкт-Петербург']")
    private WebElement changeCity;

    @FindBy (css = "body > div.body-wrapper > div > div.js-lk-cv > div.container.container-padding-bottom > div.container__row > div.container__col.container__col_9.container__col_md-8.container__col_sm-12.container__col_border-left.lk-rightbar.print-block.print-wide > div > form > div:nth-child(2) > div.container__col.container__col_12 > div:nth-child(1) > div > div.container__col.container__col_9.container__col_ssm-12 > div:nth-child(3) > div.container__col.container__col_9.container__col_md-8.container__col_middle > div > label > div")
    private WebElement englishLevel;

    @FindBy(css = "button[title='Ниже среднего (Pre-Intermediate)']")
    private WebElement changeLevel;

    @FindBy(css = "button.lk-cv-block__action.lk-cv-block__action_md-no-spacing.js-formset-add")
    private WebElement buttonAddContact;

    @FindBy (css = "body > div.body-wrapper > div > div.js-lk-cv > div.container.container-padding-bottom > div.container__row > div.container__col.container__col_9.container__col_md-8.container__col_sm-12.container__col_border-left.lk-rightbar.print-block.print-wide > div > form > div:nth-child(2) > div.container__col.container__col_12 > div:nth-child(2) > div.js-formset > div > div:nth-child(3) > div.container__col.container__col_9.container__col_ssm-12 > div > div > div > label > div")
    private WebElement fieldChangeAMassager;

    @FindBy(css = "body > div.body-wrapper > div > div.js-lk-cv > div.container.container-padding-bottom > div.container__row > div.container__col.container__col_9.container__col_md-8.container__col_sm-12.container__col_border-left.lk-rightbar.print-block.print-wide > div > form > div:nth-child(2) > div.container__col.container__col_12 > div:nth-child(2) > div.js-formset > div > div:nth-child(3) > div.container__col.container__col_9.container__col_ssm-12 > div > div > div > div > div > button:nth-child(8)")
    private WebElement contactWhatsapp;

    @FindBy(css = "#id_contact-1-value")
    private WebElement inputNumber;

    @FindBy (css = "button[title='Сохранить и продолжить']")
    private WebElement buttonSave;

    @FindBy (css = "p[class ='lk-cv-block__header']")
    private WebElement contactForScroll;




    public void sendFilds() throws InterruptedException {

        //Заполнение полей

        fillField(fname, "Евгений");
        fillField(lname, "Чистяков");
        fillField(nameLatin, "Evgenii");
        fillField(lNAmeLatin, "Chistyakov");
        fillField(idBlogName, "Евгений");
//      fillField(dayOfBirth, "20.06.1988");
    }


    public void sendDropDownMenu() throws InterruptedException {
        sendDropDownMenu(country, changeCountry);
        sendDropDownMenu(city,changeCity);
        sendDropDownMenu(englishLevel, changeLevel);

    }
    public void addContact(){
        scrolltoElement(contactForScroll);
        clickToElement(buttonAddContact);
        explicitWait(fieldChangeAMassager);
        clickToElement(fieldChangeAMassager);
        explicitWait(contactWhatsapp);
        clickToElement(contactWhatsapp);
        fillField(inputNumber, "89218466331");

    }
    public void clickSave(){
        scrolltoElement(buttonSave);
        clickToElement(buttonSave);
    }

}