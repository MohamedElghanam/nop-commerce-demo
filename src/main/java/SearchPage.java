import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends PageBase{
    public SearchPage(WebDriver driver) {
        super(driver);
    }
    private WebElement searchField = driver.findElement(By.id("small-searchterms"));
    private WebElement searchFieldElement;
    private WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button"));
    private WebElement searchButtonElement;


    public void EnterSearchField (String search)
    {
        searchFieldElement = searchField;
        sendText(searchFieldElement, search);
    }
    public void ClickOnSearchButton()
    {
        searchButtonElement = searchButton;
        Clicking(searchButtonElement);
    }
}
