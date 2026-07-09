import { Page, expect } from '@playwright/test';

/**
 * OverviewPage — consolidated by TestForge from executed runs.
 * Page URL: https://parabank.parasoft.com/parabank/overview.htm
 */
export class OverviewPage {
  constructor(private page: Page) {}

  async expectAccountsOverviewLinkInLeftNavVisible() {
    await expect(this.page.locator('text="Accounts Overview"').first()).toBeVisible();
  }

  async expectAccountsTableContainerVisible() {
    await expect(this.page.locator('#accountTable').first()).toBeVisible();
  }

  async clickTransferFundsNavigationLink() {
    await this.page.locator('button:has-text("Transfer Funds"), a:has-text("Transfer Funds"), [role=button]:has-text("Transfer Funds")').first().click();
  }

  async clickBillPayNavigationLink() {
    await this.page.locator('button:has-text("Bill Pay"), a:has-text("Bill Pay"), [role=button]:has-text("Bill Pay")').first().click();
  }

  async clickLogOutLinkInNavigation() {
    await this.page.locator('button:has-text("Log Out"), a:has-text("Log Out"), [role=button]:has-text("Log Out")').first().click();
  }

  async expectOpenNewAccountNavLinkVisible() {
    await expect(this.page.locator('text="Open New Account"').first()).toBeVisible();
  }

  async expectAccountsTableTotalRowVisible() {
    await expect(this.page.locator('tfoot').first()).toBeVisible();
  }

}
