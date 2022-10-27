package components;


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

  public void sendFilds() throws InterruptedException {
      fillField(fname,"Евгений");
      fillField(lname, "Чистяков");
      fillField(nameLatin,"Evgenii");
      fillField(lNAmeLatin, "Chistyakov");
      fillField(idBlogName, "Евгений");
  }

}

