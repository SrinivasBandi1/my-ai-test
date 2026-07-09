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
 * BillpayPage — consolidated by TestForge from EXECUTED test runs.
 * Page URL: https://parabank.parasoft.com/parabank/billpay.htm
 * Every locator below resolved successfully in a real browser execution.
 */
public class BillpayPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public BillpayPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[name=\"payee.name\"]")
    private WebElement payeeNameInputField;

    @FindBy(css = "input[name=\"payee.address.street\"]")
    private WebElement payeeAddressInputField;

    @FindBy(css = "input[name=\"amount\"]")
    private WebElement billPaymentAmountInputField;

    public boolean isPayeeNameInputFieldVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(payeeNameInputField)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getPayeeNameInputFieldText() {
        wait.until(ExpectedConditions.visibilityOf(payeeNameInputField));
        return payeeNameInputField.getText();
    }

    public boolean isPayeeAddressInputFieldVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(payeeAddressInputField)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getPayeeAddressInputFieldText() {
        wait.until(ExpectedConditions.visibilityOf(payeeAddressInputField));
        return payeeAddressInputField.getText();
    }

    public boolean isBillPaymentAmountInputFieldVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(billPaymentAmountInputField)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getBillPaymentAmountInputFieldText() {
        wait.until(ExpectedConditions.visibilityOf(billPaymentAmountInputField));
        return billPaymentAmountInputField.getText();
    }

}
