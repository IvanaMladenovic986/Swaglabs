package DemoSauce.Test;

import DemoSauce.Base.BaseTest;
import DemoSauce.Pages.LoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class LoginTests extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.get(loginURL);
        loginPage = new LoginPage();
    }
    @Test
    public void userCanLogin() {
            String validUsername = excelReader.getStringData("Login", 1, 0);
            String validPassword = excelReader.getStringData("Login", 1, 1);
            loginPage.insertUsername(validUsername);
            loginPage.insertPassword(validPassword);
            loginPage.clickOnLoginButton();
        }
    @Test
    public void userCantLoginWithInvalidPassword(){
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String invalidPassword = excelReader.getStringData("Login", 1,3);
        loginPage.insertUsername(validUsername);
        loginPage.insertPassword(invalidPassword);
        loginPage.clickOnLoginButton();

    }
    @Test
    public void userCantLoginWithInvalidUsername(){
        String invalidUsername = excelReader.getStringData("Login", 1, 1);
        String validPassword = excelReader.getStringData("Login", 1,1);
        loginPage.insertUsername(invalidUsername);
        loginPage.insertPassword(validPassword);
        loginPage.clickOnLoginButton();
    }
    @Test
    public void userCantLoginwithInvalidUsernameAndPassword(){
        String invalidUsername = excelReader.getStringData("Login", 2,2);
        String invalidPassword = excelReader.getStringData("Login", 2,3);
        loginPage.insertUsername(invalidUsername);
        loginPage.insertPassword(invalidPassword);
        loginPage.clickOnLoginButton();
    }

}
