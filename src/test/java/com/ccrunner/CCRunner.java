package com.ccrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.adactinautomation.Base_Class_adactin;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src\\test\\java\\ffile.feature",
	glue = "com.stepdefinition",
	plugin = "html:Cucumber/HtmlReport.html"
)
public class CCRunner {
	public static WebDriver d;
	@BeforeClass
	public static void startsession() {
		d=Base_Class_adactin.initialize();
	}
	@AfterClass
	public static void endsession() {
		d.close();
	}
}
