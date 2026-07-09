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
 * OverviewPage — consolidated by TestForge from EXECUTED test runs.
 * Page URL: https://parabank.parasoft.com/parabank/overview.htm
 * Every locator below resolved successfully in a real browser execution.
 */
public class OverviewPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public OverviewPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[normalize-space()='Accounts Overview']")
    private WebElement accountsOverviewLinkInLeftNav;

    @FindBy(css = "#accountTable")
    private WebElement accountsTableContainer;

    @FindBy(xpath = "//button[normalize-space()='Transfer Funds'] | //a[normalize-space()='Transfer Funds'] | //*[@role='button'][normalize-space()='Transfer Funds']")
    private WebElement transferFundsNavigationLink;

    @FindBy(xpath = "//button[normalize-space()='Bill Pay'] | //a[normalize-space()='Bill Pay'] | //*[@role='button'][normalize-space()='Bill Pay']")
    private WebElement billPayNavigationLink;

    @FindBy(xpath = "//button[normalize-space()='Log Out'] | //a[normalize-space()='Log Out'] | //*[@role='button'][normalize-space()='Log Out']")
    private WebElement logOutLinkInNavigation;

    @FindBy(xpath = "//*[normalize-space()='Open New Account']")
    private WebElement openNewAccountNavLink;

    @FindBy(css = "tfoot")
    private WebElement accountsTableTotalRow;

    public boolean isAccountsOverviewLinkInLeftNavVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(accountsOverviewLinkInLeftNav)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getAccountsOverviewLinkInLeftNavText() {
        wait.until(ExpectedConditions.visibilityOf(accountsOverviewLinkInLeftNav));
        return accountsOverviewLinkInLeftNav.getText();
    }

    public boolean isAccountsTableContainerVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(accountsTableContainer)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getAccountsTableContainerText() {
        wait.until(ExpectedConditions.visibilityOf(accountsTableContainer));
        return accountsTableContainer.getText();
    }

    public void clickTransferFundsNavigationLink() {
        wait.until(ExpectedConditions.elementToBeClickable(transferFundsNavigationLink));
        transferFundsNavigationLink.click();
    }

    public void clickBillPayNavigationLink() {
        wait.until(ExpectedConditions.elementToBeClickable(billPayNavigationLink));
        billPayNavigationLink.click();
    }

    public void clickLogOutLinkInNavigation() {
        wait.until(ExpectedConditions.elementToBeClickable(logOutLinkInNavigation));
        logOutLinkInNavigation.click();
    }

    public boolean isOpenNewAccountNavLinkVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(openNewAccountNavLink)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getOpenNewAccountNavLinkText() {
        wait.until(ExpectedConditions.visibilityOf(openNewAccountNavLink));
        return openNewAccountNavLink.getText();
    }

    public boolean isAccountsTableTotalRowVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(accountsTableTotalRow)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getAccountsTableTotalRowText() {
        wait.until(ExpectedConditions.visibilityOf(accountsTableTotalRow));
        return accountsTableTotalRow.getText();
    }

}
