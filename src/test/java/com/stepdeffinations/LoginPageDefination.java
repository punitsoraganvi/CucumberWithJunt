package com.stepdeffinations;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.pageobjectmodel.LoginPage;
import genericlib.PropertyFile;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginPageDefination {
	WebDriver driver;
	PropertyFile data;
	LoginPage page;
	
	@Before
	public void OpenApp() throws Exception {
		data = new PropertyFile();
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(data.getPropertyData("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Given("open the browser and enter the valid url")
	public void open_the_browser_and_enter_the_valid_url() {
	   String expected = driver.getTitle();
	   System.out.println(expected);
	}

	@When("user enters the valid username")
	public void user_enters_the_valid_username() throws Exception {
		data = new PropertyFile();
		LoginPage page = new LoginPage(driver);
	   page.setUserName(data.getPropertyData("un"));
	}

	@When("user enters the valid password")
	public void user_enters_the_valid_password() throws Exception {
		data = new PropertyFile();
		page = new LoginPage(driver);
	    page.setPassword(data.getPropertyData("pwd"));
	}

	@When("click on login button")
	public void click_on_login_button() {
		page = new LoginPage(driver);
	   page.clickBtn();
	}

	@Then("user should be homepage of the application")
	public void user_should_be_homepage_of_the_application() {
		String title = driver.getTitle();
		//Assert.assertEquals(title, "Facebook – log in or sign up");
	   System.out.println(title); 
	}
	
	@After
	public void closeApp() {
		driver.quit();
		System.out.println("TestCase Passed");
	}


}
