package Selenium_Technologies.Jala_technologies;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page extends Baselayer {


	

	@FindBy(xpath = "//*[@id=\"UserName\"]")
	private WebElement Email_id;
	@FindBy(xpath = "//*[@id=\"Password\"]")
	private WebElement Password;
	@FindBy(xpath = "//*[@id=\"frmLogin\"]/div[4]/div[1]/label")
	private WebElement Checkbox;
	@FindBy(xpath = "//*[@id=\"btnLogin\"]")
	private WebElement Loginbtn;
	
	public Login_page() {
		PageFactory.initElements(driver , this);
	}
	
	public void enterusername() {
		Email_id.sendKeys("training@jalaacademy.com");
	}
	public void enterpassword() {
		Password.sendKeys("jobprogram");
		
	}
	public void clickChekbox() {
		Checkbox.click();
	}
	public void ButnLogin() {
		Loginbtn.click();
		
	}
}
