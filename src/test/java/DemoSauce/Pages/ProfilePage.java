package DemoSauce.Pages;

import DemoSauce.Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProfilePage extends BaseTest {
    public ProfilePage () {
        PageFactory.initElements(driver, this);}


    public @FindBy(id = "react-burger-menu-btn")
    WebElement homeButton;

    public @FindBy(id = "shopping_cart_container")
    WebElement cart;

    public @FindBy(className = "product_sort_container")
    WebElement dropbox;

    @FindBy(css = "option[selected = 'selected']")
    public List<WebElement> sort;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    public WebElement addToCart;


    //------------------------------------

    public void clickOnHomebutton(){homeButton.click();}

    public void clickOnCart(){cart.click();}

    public void clickOnAddToCart(){addToCart.click();}


}

