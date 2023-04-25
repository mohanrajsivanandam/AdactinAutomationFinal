package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Actions_usage {
//public static WebDriver d;
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91735\\eclipse-workspace\\adactinautomation\\Chromedriver\\chromedriver.exe");
	ChromeOptions c = new ChromeOptions();
	c.addArguments("--remote-allow-origins=*");
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setAcceptInsecureCerts(true);
	c.merge(dc);
	WebDriver d = new ChromeDriver(c);
	d.get("https://demoqa.com/buttons");
	d.manage().window().maximize();
	Actions a = new Actions(d);
	WebElement clickmebutton = d.findElement(By.xpath("//button[normalize-space()='Click Me']"));
	a.click(clickmebutton);
	WebElement doubleclick = d.findElement(By.xpath("//button[normalize-space()='Double Click Me']"));
	a.doubleClick(doubleclick).build().perform();	
	WebElement rightclick = d.findElement(By.xpath("//button[normalize-space()='Right Click Me']"));
	a.contextClick(rightclick).build().perform();
	a.contextClick(clickmebutton).build().perform();	
}
}
