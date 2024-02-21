import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private WebElement emailLoginField = driver.findElement(By.id("Email"));
    private WebElement emailLoginFieldElement;
    private WebElement passwordLoginField = driver.findElement(By.id("Password"));
    private WebElement passwordLoginFieldElement;
    private WebElement LoginButton = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));
    private WebElement loginButtonElement;

    public void EnterLoginEmail(String logEmail)
    {
        emailLoginFieldElement = emailLoginField;
        sendText(emailLoginFieldElement,logEmail);
    }
    public void EnterPasswordLogin(String passEmail)
    {
        passwordLoginFieldElement = passwordLoginField;
        sendText(passwordLoginFieldElement,passEmail);
    }
    public void ClickOnLoginButton()
    {
        loginButtonElement = LoginButton;
        Clicking(loginButtonElement);
    }
}
