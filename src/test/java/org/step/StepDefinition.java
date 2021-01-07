package org.step;

import org.base.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends LibGlobal {
	
	@Given("User navigates to amazon website")
	public void user_navigates_to_amazon_website() {
		
	
	}

	@When("User clicks login button")
	public void user_clicks_login_button() {
		
		WebElement moveEle = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		movetoElement(moveEle);
		long thread = Thread.currentThread().getId();
		System.out.println(thread);
		WebElement clkSignIn = driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
		clkSignIn.click();
	}

	@Then("login page opens")
	public void login_page_opens() {
	
	}

	@Given("User is in Amazon Login Page")
	public void user_is_in_Amazon_Login_Page() {
		
	
	}

	@When("User enters valid Username and Password")
	public void user_enters_valid_Username_and_Password() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)");
		WebElement acc = driver.findElement(By.xpath("(//*[@class='nav_a'])[17]"));
		click(acc);	
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement btnSignin = driver.findElement(By.xpath("(//span[text()='Sign in'])[2]"));
		click(btnSignin);
		long thread = Thread.currentThread().getId();
		System.out.println(thread);
		WebElement txtEmail = driver.findElement(By.id("ap_email"));
		txtEmail.sendKeys("lionking@ymail.com");
	}

	@Then("User clicks the login button")
	public void user_clicks_the_login_button() {
		WebElement btnContin = driver.findElement(By.id("continue"));
		click(btnContin);
		long thread = Thread.currentThread().getId();
		System.out.println(thread);
	}

}
