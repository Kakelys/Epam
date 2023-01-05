import org.testng.Assert;
import org.testng.annotations.Test;

import page.MainPage;
import test.CommonConditions;

public class NavbarTest extends CommonConditions {

    @Test
    public void SalesNavigateCheck() {

        var navbar = new MainPage(driver);
        navbar.openPage();
        var isNavigated = navbar.navigateToSales();

        Assert.assertTrue(isNavigated);
    }
}
