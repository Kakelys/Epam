import org.testng.Assert;
import org.testng.annotations.Test;

import page.SearchPage;
import test.CommonConditions;

public class SearchTest extends CommonConditions {

    @Test
    public void TestSearch() {

        var page = new SearchPage(driver);

        page.openPage();
        page.putDataIntoSearchInput("вентилятор");
        page.searchClick();
        Assert.assertTrue(page.getGoodAmount() > 0);
    }
}
