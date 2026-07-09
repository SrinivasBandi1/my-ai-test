package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * LoginPage — consolidated by TestForge from EXECUTED test runs.
 * Page URL: https://parabank.parasoft.com/parabank/login.htm
 * Every locator below resolved successfully in a real browser execution.
 */
public class LoginPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "p.error")
    private WebElement loginErrorMessageElement;

    @FindBy(css = "input[name=\"username\"]")
    private WebElement usernameInputFieldPostError;

    public boolean isLoginErrorMessageElementVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(loginErrorMessageElement)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getLoginErrorMessageElementText() {
        wait.until(ExpectedConditions.visibilityOf(loginErrorMessageElement));
        return loginErrorMessageElement.getText();
    }

    public boolean isUsernameInputFieldPostErrorVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(usernameInputFieldPostError)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getUsernameInputFieldPostErrorText() {
        wait.until(ExpectedConditions.visibilityOf(usernameInputFieldPostError));
        return usernameInputFieldPostError.getText();
    }

}
