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
 * ParabankPage — consolidated by TestForge from EXECUTED test runs.
 * Page URL: https://parabank.parasoft.com/parabank/index.htm
 * Every locator below resolved successfully in a real browser execution.
 */
public class ParabankPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public ParabankPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[name=\"username\"]")
    private WebElement usernameInputField;

    @FindBy(css = "input[name=\"password\"]")
    private WebElement passwordInputField;

    @FindBy(css = "input.button")
    private WebElement loginFormSubmitButton;

    @FindBy(css = "form[name=\"login\"]")
    private WebElement loginFormElement;

    @FindBy(css = "ul.leftmenu:nth-of-type(1) > li:nth-of-type(2) > a")
    private WebElement aboutUsNavigationLink;

    @FindBy(xpath = "//*[normalize-space()='Register']")
    private WebElement registerNavigationLink;

    @FindBy(xpath = "//*[normalize-space()='Forgot login info?']")
    private WebElement forgotLoginInfoLink;

    @FindBy(xpath = "//*[normalize-space()='Contact Us']")
    private WebElement contactUsFooterLink;

    public void enterUsernameInputField(String value) {
        wait.until(ExpectedConditions.visibilityOf(usernameInputField));
        usernameInputField.clear();
        usernameInputField.sendKeys(value);
    }

    public boolean isUsernameInputFieldVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(usernameInputField)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getUsernameInputFieldText() {
        wait.until(ExpectedConditions.visibilityOf(usernameInputField));
        return usernameInputField.getText();
    }

    public void enterPasswordInputField(String value) {
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.clear();
        passwordInputField.sendKeys(value);
    }

    public void clickLoginFormSubmitButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginFormSubmitButton));
        loginFormSubmitButton.click();
    }

    public boolean isLoginFormElementVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(loginFormElement)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getLoginFormElementText() {
        wait.until(ExpectedConditions.visibilityOf(loginFormElement));
        return loginFormElement.getText();
    }

    public boolean isAboutUsNavigationLinkVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(aboutUsNavigationLink)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getAboutUsNavigationLinkText() {
        wait.until(ExpectedConditions.visibilityOf(aboutUsNavigationLink));
        return aboutUsNavigationLink.getText();
    }

    public boolean isRegisterNavigationLinkVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(registerNavigationLink)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getRegisterNavigationLinkText() {
        wait.until(ExpectedConditions.visibilityOf(registerNavigationLink));
        return registerNavigationLink.getText();
    }

    public boolean isForgotLoginInfoLinkVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(forgotLoginInfoLink)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getForgotLoginInfoLinkText() {
        wait.until(ExpectedConditions.visibilityOf(forgotLoginInfoLink));
        return forgotLoginInfoLink.getText();
    }

    public boolean isContactUsFooterLinkVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(contactUsFooterLink)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getContactUsFooterLinkText() {
        wait.until(ExpectedConditions.visibilityOf(contactUsFooterLink));
        return contactUsFooterLink.getText();
    }

}
