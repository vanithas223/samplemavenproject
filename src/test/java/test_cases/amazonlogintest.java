package test_cases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import dataprovider.data;
import pages.amazonloginpage;

public class amazonlogintest extends testbase
{
@Test
public void login() {
	launchbrowser();
	PageTitle();
	PageUrl();
	amazonloginpage l = PageFactory.initElements(driver, amazonloginpage.class);
	
	WebElement hellosignin = l.getHellosignin();
	hellosignin.click();
	
	WebElement txtemail = l.getTxtemail();
	txtemail.sendKeys("vanithasaravanan223@gmail.com");
	
	WebElement btncontinue = l.getBtncontinue();
	btncontinue.click();
	WebElement txtpassword = l.getTxtpassword();
	txtpassword.sendKeys("Vanitha@12345");
	
	WebElement btnlogin = l.getBtnlogin();
	btnlogin.click();	
	
	
	
}
}
