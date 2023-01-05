package page;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import model.User;

public class Login extends AbstractPage {

    private Logger log = Logger.getLogger(Login.class.getName());

    private final String BASE_URL = "https://xistore.by/";

    @FindBy(className = "navigation-cabinet-link")
    private WebElement buttonLogin;

    @FindBy(name = "USER_LOGIN")
    private WebElement emailInput;

    @FindBy(name = "USER_PASSWORD")
    private WebElement passwordInput;

    @FindBy(name = "Login")
    private WebElement loginButton;

    private WebElement errorText;

    public Login(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public AbstractPage openPage() {
        driver.navigate().to(BASE_URL);
        buttonLogin.click();

        log.info("opening loogin page");
        return this;
    }

    public void putLoginData(User user) {

        log.info("puting data into fields");

        emailInput.sendKeys(user.getUsername());
        passwordInput.sendKeys(user.getUsername());

    }

    public boolean loginClick() {

        log.info("clicking on login");

        loginButton.click();

        return BASE_URL.equals(driver.getCurrentUrl());
    }

}
