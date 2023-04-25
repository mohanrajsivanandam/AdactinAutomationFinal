package com.adactinautomation;

import java.io.File;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class Base_Class_adactin {
public static WebDriver d;
	public static WebDriver initialize() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91735\\eclipse-workspace\\adactinautomation\\Chromedriver\\chromedriver.exe");
		ChromeOptions c = new ChromeOptions();
		c.addArguments("--remote-allow-origins=*");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setAcceptInsecureCerts(true);
		c.merge(dc);
		d = new ChromeDriver(c);
		return d;
	}
	public static void openurl(String link) {
		d.get(link);
	}
	public static void dd(WebElement element, String type, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("v")) {
			s.selectByValue(value);
		}else if (type.equalsIgnoreCase("i")) {
			int parseInt = Integer.parseInt(value);
			s.selectByIndex(parseInt);
		}else if (type.equalsIgnoreCase("txt")) {
			s.selectByVisibleText(null);			
		}
	}
	public static void clk(WebElement element) {
		element.click();
	}
	public static void sk(WebElement element, String value) {
		element.sendKeys(value);
	}
	public static void impwait(int value) {
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(value));
	}
	public static void pltimeout(int value) {
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(value));
	}
	public static void maxz() {
		d.manage().window().maximize();
	}
	public static void scr() throws Throwable {
		TakesScreenshot ts = (TakesScreenshot)d;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\91735\\eclipse-workspace\\adactinautomation\\Screenshots\\Test1.png");
		FileUtils.copyFile(source, destination);
	}
	public static void cls() {
		d.close();
	}
}
