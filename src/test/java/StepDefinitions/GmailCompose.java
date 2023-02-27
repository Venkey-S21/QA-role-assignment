package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class GmailCompose {

	WebDriver driver;
	LoginPage obj;


	@Given("^Launch the browser$")
	public void launchTheBrowser() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();

	}

	@When("^Navigate to Gmail home page$")
	public void navigateToGmailHomePage() {

		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@And("^Click on Signin button$")
	public void clickOnSigninButton() {
		
		obj = new LoginPage(driver);
		obj.clickSigninBtn();

	}

	@And("^Enter valid (.*) and click on enter$")
	public void enterValidUsernameAndClickOnEnter(String username) {
		
		obj.enterUsernameAndClickEnter(username);

	}

	@And("^Enter valid (.*) and click on submit$")
	public void enterValidPasswordAndClickOnSubmit(String password) {
		
		obj.enterPasswordAndClickSubmit(password);

	}

	@Then("^Click on compose button$")
	public void clickOnComposeButton() {
		
		obj.clickComposeBtn();

	}

	@And("^Enter (.*) and (.*) also (.*)$")
	public void enterToMailAndMaiSubAlsoMailBody(String ToMail, String MailSub, String MailBody) {
		
		obj.enterToMailAndSubtxtAlsoBodytxt(ToMail, MailSub, MailBody);

	}

	@And("^Click on more options and select label as social$")
	public void clickOnMoreOptionsAndSelectLabelAsSocial() {
		
		obj.selectLabelAsSocial();

	}
	
	@And("^Click on send button$")
	public void clickOnSendButton() {
		
		obj.clickSendBtn();


	}

	@Then("^Go to social label and mark email as starred$")
	public void markEmailAsStarred() {
		
		obj.clickOnStarMark();

	}

	@And("^Verify email came under proper Label$")
	public void verifyEmailCameUnderProperLabel() {
		
		obj.verifyEmailWithProperLabel();


	}

	@And("^Verify the subject and body of the received email$")
	public void verifyTheSubjectAndBodyOfTheReceivedEmail() {
		
		obj.verifyMailSubjectAndBodyMsg();


	}

	@Then("^Close the web browser$")
	public void closeTheWebBrowser() {

		driver.close();
	}

}
