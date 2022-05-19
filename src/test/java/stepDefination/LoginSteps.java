package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	WebDriver d;

	@Given("^User is on gmail login page$")
	public void user_is_on_gmail_login_page() throws Throwable {
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.get("https://www.deltadental.com/");

		System.out.println("User is on the gmail page now");

	}

	@When("^User enters valid credentials$")
	public void user_enters_valid_credentials() throws Throwable {
		d.getTitle();
		System.out.println(d.getTitle());
		System.out.println("User enters a valid user name in the username field");

	}

	@And("^User enters valid password$")
	public void user_enters_valid_password() throws Throwable {
		d.findElement(By.linkText("Member tools")).click();
		System.out.println("User enters a valid password in the password field");

	}

	@And("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable
	{
		d.findElement(By.linkText("For dentists")).click();
		System.out.println("User is now clicking on the login button");
		
	}
	@Then("^User should be logged into his Gmail account successfully$")
	public void user_should_be_logged_into_his_Gmail_account_successfully() throws Throwable {
		d.findElement(By.linkText("For dentists")).click();
		System.out.println("This is gmail home page");

	}

}