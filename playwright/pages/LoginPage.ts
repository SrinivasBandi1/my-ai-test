import { Page, expect } from '@playwright/test';

/**
 * LoginPage — consolidated by TestForge from executed runs.
 * Page URL: https://parabank.parasoft.com/parabank/login.htm
 */
export class LoginPage {
  constructor(private page: Page) {}

  async expectLoginErrorMessageElementVisible() {
    await expect(this.page.locator('p.error').first()).toBeVisible();
  }

  async expectUsernameInputFieldPostErrorVisible() {
    await expect(this.page.locator('input[name="username"]').first()).toBeVisible();
  }

}
