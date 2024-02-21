import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends PageBase{

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    private WebElement gender = driver.findElement(By.id("gender-male"));
    private WebElement genderMaleElement;
    private WebElement firstName = driver.findElement(By.id("FirstName"));
    private WebElement firstNameElement;
    private WebElement lastName = driver.findElement(By.id("LastName"));
    private WebElement lastNameElement;
    private WebElement emailField = driver.findElement(By.name("Email"));
    private WebElement emailFieldElement;
    private WebElement companyName = driver.findElement(By.id("Company"));
    private WebElement companyNameElement;
    private WebElement passwordField = driver.findElement(By.id("Password"));
    private WebElement passwordFieldElement;
    private WebElement confirmPasswordField = driver.findElement(By.id("ConfirmPassword"));
    private WebElement confirmPasswordFieldElement;
    private WebElement registerButton = driver.findElement(By.id("register-button"));
    private WebElement registerButtonElement;

    public void EnterFirstName (String fName)
    {
        firstNameElement = firstName;
        sendText(firstNameElement,fName);
    }
    public void EnterLastName (String lName)
    {
        lastNameElement = lastName;
        sendText(lastNameElement,lName);
    }
    public void EnterEmail (String Email)
    {
        emailFieldElement = emailField;
        sendText(emailFieldElement,Email);
    }
    public void EnterCompanyName (String cNAme)
    {
        companyNameElement = companyName;
        sendText(companyNameElement,cNAme);
    }
    public void EnterPassword (String Password)
    {
        passwordFieldElement = passwordField;
        sendText(passwordFieldElement,Password);
    }
    public void EnterCoPassword (String coPassword)
    {
        confirmPasswordFieldElement = confirmPasswordField;
        sendText(confirmPasswordFieldElement,coPassword);
    }
    public void chooseGender()
    {
        genderMaleElement = gender;
        Clicking(genderMaleElement);
    }
    public void ClickOnRegisterButton()
    {
        registerButtonElement = registerButton;
        Clicking(registerButtonElement);
    }
}
