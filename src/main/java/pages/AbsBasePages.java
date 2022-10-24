package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public abstract class AbsBasePages {


        private String hostname = System.getProperty("base.url");
        private String login = System.getProperty("login");
        private String password = System.getProperty("password");

        protected WebDriver driver;
        protected Actions action;

        public AbsBasePages(WebDriver driver){
            this.driver=driver;
            this.action = new Actions(driver);
            PageFactory.initElements(driver, this);
        }
        public void open(){
            driver.get(hostname);
        }

        public CharSequence inputLogin(){
            System.getProperty(login);
            return login;
        }
        public CharSequence inputPassword(){
            System.getProperty(password);
            return password;
        }

    }

