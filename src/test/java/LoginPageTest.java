import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    private HomePage homePage;
    private LoginPage loginPage;

    @Test(priority = 1)
    public void ValidLoginTC()
    {
        homePage = new HomePage(driver);
        loginPage = homePage.clickOnLoginButton();
        loginPage.EnterLoginEmail("mohamedelghanam.st@gmail.com");
        loginPage.EnterPasswordLogin("Mido18121994##");
        loginPage.ClickOnLoginButton();
        WebElement logoutButton = driver.findElement(By.className("ico-logout"));
        logoutButton.click();
    }
    @Test(priority = 2)
    public void InValidLoginTC()
    {
        homePage = new HomePage(driver);
        loginPage = homePage.clickOnLoginButton();
        loginPage.EnterLoginEmail("mohamedelghanam.st@gmail.com");
        loginPage.EnterPasswordLogin("Mido18121994#");
        loginPage.ClickOnLoginButton();
    }
    @Test(priority = 3)
    public void InValidLoginTC2()
    {
        homePage = new HomePage(driver);
        loginPage = homePage.clickOnLoginButton();
        loginPage.EnterLoginEmail("mohamedelghanamst@gmail.com");
        loginPage.EnterPasswordLogin("Mido18121994##");
        loginPage.ClickOnLoginButton();
    }
}
