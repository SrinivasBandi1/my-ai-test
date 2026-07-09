import { Page, expect } from '@playwright/test';

/**
 * BillpayPage — consolidated by TestForge from executed runs.
 * Page URL: https://parabank.parasoft.com/parabank/billpay.htm
 */
export class BillpayPage {
  constructor(private page: Page) {}

  async expectPayeeNameInputFieldVisible() {
    await expect(this.page.locator('input[name="payee.name"]').first()).toBeVisible();
  }

  async expectPayeeAddressInputFieldVisible() {
    await expect(this.page.locator('input[name="payee.address.street"]').first()).toBeVisible();
  }

  async expectBillPaymentAmountInputFieldVisible() {
    await expect(this.page.locator('input[name="amount"]').first()).toBeVisible();
  }

}
