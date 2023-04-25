package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactinautomation.Base_Class_adactin;
import com.ccrunner.CCRunner;
import com.pom.Pom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Base_Class_adactin{
	public static WebDriver d2 = CCRunner.d;
	public static Pom pom = new Pom(d2);
	@Given("user Launch The Application")
	public void user_launch_the_application() {
	openurl("https://adactinhotelapp.com/index.php");
	}
	@When("user Enters the UN in UN Field")
	public void user_enters_the_un_in_un_field() {
		sk(pom.getLp().getUs(), "markmohan");
	}
	@When("user Enters the Pwd in Pwd Field")
	public void user_enters_the_pwd_in_pwd_field() {
		sk(pom.getLp().getPs(), "markmohan@123");
	}
	@Then("user Clicks Login And Navigates To The Main Page")
	public void user_clicks_login_and_navigates_to_the_main_page() {
		clk(pom.getLp().getLoginbutton());	
	}
	@When("user selects the location")
	public void user_selects_the_location() {
		dd(pom.getMp().getLocation(), "v", "Melbourne");
	}
	@When("user selects the hotel")
	public void user_selects_the_hotel() {
		dd(pom.getMp().getHotels(), "v", "Hotel Sunshine");
	}
	@When("user selects the room type")
	public void user_selects_the_room_type() {
		dd(pom.getMp().getRoom_type(), "v", "Super Deluxe");
	}
	@When("user selects the room numbers")
	public void user_selects_the_room_numbers() {
		dd(pom.getMp().getRoom_nos(), "v", "9");
	}
	@When("user enters the from date")
	public void user_enters_the_from_date() {
		sk(pom.getMp().getDate1(), "10/01/1987");
	}
	@When("user enters the to date")
	public void user_enters_the_to_date() {
		sk(pom.getMp().getDate2(), "11/01/1987");
	}
	@When("user selects adult room")
	public void user_selects_adult_room() {
		dd(pom.getMp().getAdult_room(), "v", "1");
	}
	@When("user selects child room")
	public void user_selects_child_room() {
		dd(pom.getMp().getChild_room(), "v", "1");
	}
	@Then("user clicks on the submit button")
	public void user_clicks_on_the_submit_button() {
		clk(pom.getMp().getSubmit());
	}
	@When("user clicks on the logout button as quick as possible")
	public void user_clicks_on_the_logout_button_as_quick_as_possible() {
		clk(pom.getLo().getLogoutbutton());
	}
}