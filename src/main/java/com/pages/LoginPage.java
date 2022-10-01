package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;

public class LoginPage {
	private WebDriver driver;
	// By Locators

	private By emailId = By.id("email");
	private By pass = By.id("passwd");
	private By signIn = By.id("SubmitLogin");
	private By forgot = By.linkText("Forgot your password?");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean isForgotPwdExist() {
		return driver.findElement(forgot).isDisplayed();
	}

	public void enterUserName(String un) {
		driver.findElement(emailId).sendKeys(un);
	}

	public void enterPassword(String pwd) {
		driver.findElement(pass).sendKeys(pwd);
	}

	public void clickOnLogin() {
		driver.findElement(signIn).click();
	}

	public AccountsPage doLogin(String un, String pwd) {
		enterUserName(un);
		enterPassword(pwd);
		clickOnLogin();
		return new AccountsPage(driver);
	}
}
