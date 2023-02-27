package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {
	
	WebDriver driver;
	Actions action;
	
	By signin_btn = By.xpath("//a[text()='Sign in']");
	By username_txt = By.name("identifier");
	By password_txt = By.name("password");
	By compose_btn = By.xpath("//div[text()='Compose']");
	By tomail_txt = By.id(":u5");
	By subject_txt = By.name("subjectbox");
	By message_txt = By.id(":rf");
	By options_btn = By.xpath("//div[@id=':si']/div[2]");
	By label_opt = By.xpath("//div[text()='Label']");
	By social_opt = By.xpath("//div[@title='Social']");
	By apply_opt = By.xpath("//div[text()='Apply']");
	By send_btn = By.xpath("//div[text()='Send']");
	By social_tab = By.xpath("//div[text()='Social']");
	By star_mark = By.xpath("//span[@aria-label='Not starred']");
	By select_mail = By.xpath("(//span[text()='me'])[2]");
	By label_inmail = By.xpath("//div[@aria-label='Labels']");
	By social_tick = By.xpath("//div[@aria-checked='true' and @title='Social']");
	By subjecttxt_verify = By.xpath("//h2[text()='Test Mail']");
	By messagetxt_verify = By.xpath("//div[text()='Test Email Body']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickSigninBtn() {
		
		WebElement signinbtn = driver.findElement(signin_btn);
		signinbtn.click();

	}
	
	public void enterUsernameAndClickEnter(String username) {
		
		WebElement usernametxt = driver.findElement(username_txt);
		usernametxt.sendKeys(username, Keys.ENTER);

	}
	
	public void enterPasswordAndClickSubmit(String password) {
		
		WebElement passwordtxt = driver.findElement(password_txt);
		passwordtxt.sendKeys(password, Keys.ENTER);

	}
	
	public void clickComposeBtn() {
		
		WebElement composebtn = driver.findElement(compose_btn);
		composebtn.click();

	}
	
	public void enterToMailAndSubtxtAlsoBodytxt(String ToMail, String MailSub, String MailBody) {
		
		WebElement toMailtxt = driver.findElement(tomail_txt);
		toMailtxt.sendKeys(ToMail);
		
		WebElement subtxt = driver.findElement(subject_txt);
		subtxt.sendKeys(MailSub);
		
		WebElement msgBodttxt = driver.findElement(message_txt);
		msgBodttxt.sendKeys(MailBody);

	}
	
	public void selectLabelAsSocial() {
		
		action = new Actions(driver);
		WebElement moreOptionsbtn = driver.findElement(options_btn);
		moreOptionsbtn.click();
		WebElement labelOptions = driver.findElement(label_opt);
		action.moveToElement(labelOptions).build().perform();
		WebElement selectSocialOpt = driver.findElement(social_opt);
		selectSocialOpt.click();
		WebElement clickApplyOpt = driver.findElement(apply_opt);
		clickApplyOpt.click();
	}
	
	public void clickSendBtn() {
		
		WebElement clickSendbtn = driver.findElement(send_btn);
		clickSendbtn.click();

	}
	
	public void clickOnStarMark() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement clickSocialTab = driver.findElement(social_tab);
		clickSocialTab.click();
		WebElement clickStarmark = driver.findElement(star_mark);
		clickStarmark.click();

	}
	
	public void verifyEmailWithProperLabel() {
		
		WebElement clickMail = driver.findElement(select_mail);
		clickMail.click();
		WebElement clickLabelsOpt = driver.findElement(label_inmail);
		clickLabelsOpt.click();
		WebElement socialTick = driver.findElement(social_tick);
		socialTick.isEnabled();

	}
	
	public void verifyMailSubjectAndBodyMsg() {
		
		WebElement subTxt = driver.findElement(subjecttxt_verify);
		subTxt.isEnabled();
		WebElement msgTxt = driver.findElement(messagetxt_verify);
		msgTxt.isEnabled();

	}

}
