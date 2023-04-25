package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DragandDrop_Usage {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91735\\eclipse-workspace\\adactinautomation\\Chromedriver\\chromedriver.exe");
	ChromeOptions c = new ChromeOptions();
	c.addArguments("--remote-allow-origins=*");
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setAcceptInsecureCerts(true);
	c.merge(dc);
	WebDriver d = new ChromeDriver(c);
	d.get("https://jqueryui.com/draggable/");
	Actions a = new Actions(d);
	d.switchTo().frame(0);
	
//	WebElement destination = d.findElement(By.id("droppable"));
//	a.dragAndDrop(source, destination).build().perform();
//	d.switchTo().frame(d.findElement(By.xpath("//iframe[@class='demo-frame']")));
//	WebElement source = d.findElement(By.id("draggable"));
//	a.dragAndDropBy(source, 300, 150).perform();
//	a.clickAndHold(destination)
	a.moveByOffset(500, 250).contextClick().build().perform();
	
	a.moveByOffset(500, 250).doubleClick().clickAndHold().moveByOffset(300, 250).release();
	}
}
