package page;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends AbstractPage {

    private Logger log = Logger.getLogger(MainPage.class.getName());

    private final String BASE_URL = "https://xistore.by/";

    @FindBy(xpath = "//*[text() = 'Скидки']")
    private WebElement salesButton;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public AbstractPage openPage() {
        log.info("opening main page");
        driver.navigate().to(BASE_URL);

        return this;
    }

    public boolean navigateToSales() {
        try {

            log.info("navigating to sales");

            salesButton.click();
            return true;

        } catch (Exception ex) {
            log.severe("something went wront during nabigating to Sales" + ex.getMessage());

            return false;
        }
    }

}
