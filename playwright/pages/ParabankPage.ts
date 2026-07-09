import { Page, expect } from '@playwright/test';

/**
 * ParabankPage — consolidated by TestForge from executed runs.
 * Page URL: https://parabank.parasoft.com/parabank/index.htm
 */
export class ParabankPage {
  constructor(private page: Page) {}

  async enterUsernameInputField(value: string) {
    await this.page.locator('input[name="username"]').first().fill(value);
  }

  async expectUsernameInputFieldVisible() {
    await expect(this.page.locator('input[name="username"]').first()).toBeVisible();
  }

  async enterPasswordInputField(value: string) {
    await this.page.locator('input[name="password"]').first().fill(value);
  }

  async clickLoginFormSubmitButton() {
    await this.page.locator('input.button').first().click();
  }

  async expectLoginFormElementVisible() {
    await expect(this.page.locator('form[name="login"]').first()).toBeVisible();
  }

  async expectAboutUsNavigationLinkVisible() {
    await expect(this.page.locator('ul.leftmenu:nth-of-type(1) > li:nth-of-type(2) > a').first()).toBeVisible();
  }

  async expectRegisterNavigationLinkVisible() {
    await expect(this.page.locator('text="Register"').first()).toBeVisible();
  }

  async expectForgotLoginInfoLinkVisible() {
    await expect(this.page.locator('text="Forgot login info?"').first()).toBeVisible();
  }

  async expectContactUsFooterLinkVisible() {
    await expect(this.page.locator('text="Contact Us"').first()).toBeVisible();
  }

}
