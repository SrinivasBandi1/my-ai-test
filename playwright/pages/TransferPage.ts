import { Page, expect } from '@playwright/test';

/**
 * TransferPage — consolidated by TestForge from executed runs.
 * Page URL: https://parabank.parasoft.com/parabank/transfer.htm
 */
export class TransferPage {
  constructor(private page: Page) {}

  async enterTransferAmountInputField(value: string) {
    await this.page.locator('#amount').first().fill(value);
  }

  async expectTransferAmountInputFieldVisible() {
    await expect(this.page.locator('#amount').first()).toBeVisible();
  }

  async expectFromAccountDropdownVisible() {
    await expect(this.page.locator('#fromAccountId').first()).toBeVisible();
  }

  async expectToAccountDropdownVisible() {
    await expect(this.page.locator('#toAccountId').first()).toBeVisible();
  }

  async clickTransferSubmitButton() {
    await this.page.locator('input.button').first().click();
  }

  async expectTransferCompleteHeadingVisible() {
    await expect(this.page.locator('div:nth-of-type(2) > h1.title').first()).toBeVisible();
  }

}
