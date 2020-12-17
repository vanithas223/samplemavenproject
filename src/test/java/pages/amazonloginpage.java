package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class amazonloginpage {
	WebDriver driver;

	public amazonloginpage(WebDriver driver) {
		this.driver = driver;

	}
	@FindBy(id="nav-link-accountList")
	private WebElement hellosignin;

	@FindBy(id = "ap_email")
	private WebElement txtemail;
	
	@FindBy(id = "continue")
	private WebElement btncontinue;

	@FindBy(id = "ap_password")
	private WebElement txtpassword;

	@FindBy(id = "signInSubmit")
	private WebElement btnlogin;
	
	
	
	public WebElement getHellosignin() {
		return hellosignin;
	}
	public WebElement getTxtemail() {
		return txtemail;
	}
	
	public WebElement getBtncontinue() {
		return btncontinue;
	}
	public WebElement getTxtpassword() {
		return txtpassword;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}


}
