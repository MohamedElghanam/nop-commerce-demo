import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    WebElement registerButtonElement;
    WebElement loginButtonElement;
    WebElement searchTextElement;
    WebElement searchButtonElement;


    public RegisterPage clickOnRegisterButton()
    {
        registerButtonElement = driver.findElement(By.className("ico-register"));
        Clicking(registerButtonElement);
        return new RegisterPage(driver);
    }
    public LoginPage clickOnLoginButton()
    {
        loginButtonElement = driver.findElement(By.className("ico-login"));
        Clicking(loginButtonElement);
        return new LoginPage(driver);
    }
    public void sendingText(String search)
    {
        searchTextElement = driver.findElement(By.id("small-searchterms"));
        sendText(searchTextElement, search);
    }
    public SearchPage clickOnSearchButton()
    {
        searchButtonElement = driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button"));
        Clicking(searchButtonElement);
        return new SearchPage(driver);
    }


}
