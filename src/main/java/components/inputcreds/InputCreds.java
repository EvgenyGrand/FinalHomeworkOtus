package components.inputcreds;

import org.openqa.selenium.WebDriver;
import pages.AbsBasePages;

public class InputCreds  extends AbsBasePages implements ICredInput {

    public InputCreds(WebDriver driver) {
        super(driver);
    }

    private String login = System.getProperty("login");
    private String password = System.getProperty("password");

@Override
    public String inputLogin() {
        System.getProperty(login);
        return login;
    }
@Override
    public String inputPassword() {
        System.getProperty(password);
        return password;
}
}