package com.pojoimplementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public  WebDriver d2;
@FindBy(id="username")
private WebElement us;
@FindBy(id="password")
private WebElement ps;
@FindBy(id="login")
private WebElement loginbutton;
public Login(WebDriver d) {
	this.d2 = d;
	PageFactory.initElements(d2, this);
}
public WebElement getUs() {
	return us;
}
public WebElement getPs() {
	return ps;
}
public WebElement getLoginbutton() {
	return loginbutton;
}
}