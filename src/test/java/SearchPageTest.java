import org.testng.annotations.Test;

public class SearchPageTest extends TestBase{
    private HomePage homePage;
    private SearchPage searchPage;

    @Test
    public void SearchField()
    {
        homePage = new HomePage(driver);
        searchPage = homePage.clickOnSearchButton();
        searchPage.EnterSearchField("Apple MacBook Pro 13-inch");
        searchPage.ClickOnSearchButton();
    }
}
