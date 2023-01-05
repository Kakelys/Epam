package page;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends AbstractPage {

    private Logger log = Logger.getLogger(SearchPage.class.getName());

    private final String BASE_URL = "https://xistore.by/search/";

    @FindBy(xpath = "//div[contains(@class, 'search__block')]/form/input[contains(@name, 'q')]")
    private WebElement searchInput;

    @FindBy(xpath = "//div[contains(@class, 'search__block')]/form/input[4]")
    private WebElement searchButton;

    @FindBy(xpath = "//*[contains(@class, 'product-tabs clearfix')]/li/a/span")
    private WebElement goodsAmount;

    public SearchPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public AbstractPage openPage() {
        driver.navigate().to(BASE_URL);

        log.info("opening loogin page");
        return this;
    }

    public void putDataIntoSearchInput(String query) {
        searchInput.sendKeys(query);
    }

    public void searchClick() {
        searchButton.click();
    }

    public Integer getGoodAmount() {
        return Integer.parseInt(goodsAmount.getText());
    }

}
