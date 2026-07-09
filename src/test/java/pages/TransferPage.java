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
 * TransferPage — consolidated by TestForge from EXECUTED test runs.
 * Page URL: https://parabank.parasoft.com/parabank/transfer.htm
 * Every locator below resolved successfully in a real browser execution.
 */
public class TransferPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public TransferPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#amount")
    private WebElement transferAmountInputField;

    @FindBy(css = "#fromAccountId")
    private WebElement fromAccountDropdown;

    @FindBy(css = "#toAccountId")
    private WebElement toAccountDropdown;

    @FindBy(css = "input.button")
    private WebElement transferSubmitButton;

    @FindBy(css = "div:nth-of-type(2) > h1.title")
    private WebElement transferCompleteHeading;

    public void enterTransferAmountInputField(String value) {
        wait.until(ExpectedConditions.visibilityOf(transferAmountInputField));
        transferAmountInputField.clear();
        transferAmountInputField.sendKeys(value);
    }

    public boolean isTransferAmountInputFieldVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(transferAmountInputField)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getTransferAmountInputFieldText() {
        wait.until(ExpectedConditions.visibilityOf(transferAmountInputField));
        return transferAmountInputField.getText();
    }

    public boolean isFromAccountDropdownVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(fromAccountDropdown)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getFromAccountDropdownText() {
        wait.until(ExpectedConditions.visibilityOf(fromAccountDropdown));
        return fromAccountDropdown.getText();
    }

    public boolean isToAccountDropdownVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(toAccountDropdown)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getToAccountDropdownText() {
        wait.until(ExpectedConditions.visibilityOf(toAccountDropdown));
        return toAccountDropdown.getText();
    }

    public void clickTransferSubmitButton() {
        wait.until(ExpectedConditions.elementToBeClickable(transferSubmitButton));
        transferSubmitButton.click();
    }

    public boolean isTransferCompleteHeadingVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(transferCompleteHeading)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getTransferCompleteHeadingText() {
        wait.until(ExpectedConditions.visibilityOf(transferCompleteHeading));
        return transferCompleteHeading.getText();
    }

}
