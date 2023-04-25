package com.pojoimplementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	public WebDriver d2;
	@FindBy(xpath="//a[normalize-space()='Logout']")
	private WebElement logoutbutton;
	public Logout(WebDriver d) {
		this.d2 = d;
		PageFactory.initElements(d2, this);
	}
	public WebElement getLogoutbutton() {
		return logoutbutton;
	}
}
