import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase{
    private HomePage homePage;
    private RegisterPage registerPage;
    @Test
    public void ValidRegisterTC()
    {
        homePage = new HomePage(driver);
        registerPage = homePage.clickOnRegisterButton();
        registerPage.chooseGender();
        registerPage.EnterFirstName("Mohammed");
        registerPage.EnterLastName("Elghanam");
        registerPage.EnterEmail("mohamedelghanam.st@gmail.com");
        registerPage.EnterCompanyName("Utrust");
        registerPage.EnterPassword("Mido18121994##");
        registerPage.EnterCoPassword("Mido18121994##");
        registerPage.ClickOnRegisterButton();
    }
}
