package com.pom;

import org.openqa.selenium.WebDriver;

import com.pojoimplementation.Login;
import com.pojoimplementation.Logout;
import com.pojoimplementation.Main_Page;

public class Pom {
	public WebDriver d2;
	private Login lp;
	private Main_Page mp;
	private Logout lo;
	public Pom(WebDriver d) {
		this.d2 = d;
	}
	public Login getLp() {
		lp=new Login(d2);
		return lp;
	}
	public Main_Page getMp() {
		mp = new Main_Page(d2);
		return mp;
	}
	public Logout getLo() {
		lo = new Logout(d2);
		return lo;
	}	
}
