package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {
	private WebDriver driver;
	// By Locators

	private By subMenu = By.xpath("//ul[@class='myaccount-link-list']/li/a");

	public AccountsPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getAccountsPageTitle() {
		return driver.getTitle();
	}

	public int getCountOfSubmenu() {
		return driver.findElements(subMenu).size();
	}

	public List<String> getSubMenuAcc() {
		List<String> links = new ArrayList<String>();
		List<WebElement> ls = driver.findElements(subMenu);

		for (WebElement E : ls) {
			links.add(E.getText());
			//System.out.println(E.getText());
		}
		return links;
	}
}
