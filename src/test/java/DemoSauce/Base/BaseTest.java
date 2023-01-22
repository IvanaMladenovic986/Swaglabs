package DemoSauce.Base;

import DemoSauce.Pages.LoginPage;
import DemoSauce.Pages.ProfilePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;
    public WebDriverWait wdwait;
    public ExcelReader excelReader;
    public String loginURL;
    public LoginPage loginPage;
    public String profileURL;
    public ProfilePage profilePage;

    //DDT - Data Driven Test
    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        excelReader = new ExcelReader("src/test/java/DemoSauce/SauceDemo (1).xlsx");
        loginURL = excelReader.getStringData("URL", 0, 0);
        //profileURL = excelReader.getStringData("URL", 1, 0);
    }

    public boolean isDisplayed(WebElement element) {
        boolean webelement = false;
        try {
            webelement = element.isDisplayed();
        } catch (Exception e) {

        }
        return webelement;
    }
    public void waitForVisibility(WebElement element) {
        wdwait.until(ExpectedConditions.visibilityOfAllElements(element));
    }
    public void waitForClickability(WebElement element) {
        wdwait.until(ExpectedConditions.elementToBeClickable(element));
    }

    @AfterClass
    public void tearDown() {

    }
}

