package com.runnerclassadactin;

import org.openqa.selenium.WebDriver;
import com.adactinautomation.Base_Class_adactin;
import com.pom.Pom;

public class Runner_Class_adactin extends Base_Class_adactin {
	public static WebDriver d;
	
	public static void main(String[] args) {
		d=initialize();
		Pom pom = new Pom(d);
		impwait(10);
		pltimeout(100);
		//Openurl
		openurl("https://adactinhotelapp.com/index.php");
		maxz();
		//Login
		
		sk(pom.getLp().getUs(), "markmohan");
		sk(pom.getLp().getPs(), "markmohan@123");
		clk(pom.getLp().getLoginbutton());		
//		d.findElement(By.id("username")).sendKeys("markmohan");
//		d.findElement(By.id("password")).sendKeys("markmohan@123");
//		d.findElement(By.id("login")).click();
		//Main page
		
		dd(pom.getMp().getLocation(), "v", "Melbourne");
		dd(pom.getMp().getHotels(), "v", "Hotel Sunshine");
		dd(pom.getMp().getRoom_type(), "v", "Super Deluxe");
		dd(pom.getMp().getRoom_nos(), "v", "9");
		sk(pom.getMp().getDate1(), "10/01/1987");
		sk(pom.getMp().getDate2(), "11/01/1987");
		dd(pom.getMp().getAdult_room(), "v", "1");
		dd(pom.getMp().getChild_room(), "v", "1");
		clk(pom.getMp().getSubmit());
		//Logout
		clk(pom.getLo().getLogoutbutton());
		cls();
		System.out.println("Ran Successfully");
	}
}