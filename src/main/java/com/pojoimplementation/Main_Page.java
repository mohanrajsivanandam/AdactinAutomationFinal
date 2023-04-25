package com.pojoimplementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Main_Page {
	public WebDriver d2;
@FindBy(id="location")
private WebElement location;
@FindBy(id="hotels")
private WebElement hotels;
@FindBy(id="room_type")
private WebElement room_type;
@FindBy(id="room_nos")
private WebElement room_nos;
@FindBy(xpath="(//input[@class='date_pick'])[1]")
private WebElement date1;
@FindBy(xpath="(//input[@class='date_pick'])[2]")
private WebElement date2;
@FindBy(id="adult_room")
private WebElement adult_room;
@FindBy(id="child_room")
private WebElement child_room;
@FindBy(name="Submit")
private WebElement Submit;
public Main_Page(WebDriver d) {
	this.d2 = d;
	PageFactory.initElements(d2, this);
}
public WebElement getLocation() {
	return location;
}
public WebElement getHotels() {
	return hotels;
}
public WebElement getRoom_type() {
	return room_type;
}
public WebElement getRoom_nos() {
	return room_nos;
}
public WebElement getDate1() {
	return date1;
}
public WebElement getDate2() {
	return date2;
}
public WebElement getAdult_room() {
	return adult_room;
}
public WebElement getChild_room() {
	return child_room;
}
public WebElement getSubmit() {
	return Submit;
}
}

