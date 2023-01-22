package DemoSauce.Pages;

import DemoSauce.Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {

    public LoginPage(){
        PageFactory.initElements(driver, this);}

    public @FindBy(id = "user-name")
    WebElement Username;

    public @FindBy(id = "password")
    WebElement Password;

    public @FindBy(id = "login-button")
    WebElement LoginButton;

    public void insertUsername(String username){
        Username.clear();
        Username.sendKeys(username);
    }
    public void insertPassword(String password){
        Password.clear();
        Password.sendKeys(password);
    }
    public void clickOnLoginButton(){
        LoginButton.click();
    }
}
