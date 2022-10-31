package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement userName;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(name="login")
	WebElement btn;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String strUserName) {
		userName.sendKeys(strUserName);
	}
	public void setPassword(String strPassword) {
		password.sendKeys(strPassword);
	}
	public void clickBtn() {
		btn.click();
	}
	
//	public void Login(String strUserName, String strPassword) {
//		this.setUserName(strUserName);
//		this.setPassword(strPassword);
//		this.clickBtn();
//		
//	}
	

}
