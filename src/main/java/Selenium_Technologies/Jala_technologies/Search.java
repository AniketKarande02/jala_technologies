package Selenium_Technologies.Jala_technologies;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search extends Employee_create{

	@FindBy(xpath = "//*[@id=\"Name\"]")
	private WebElement entername;
	@FindBy(xpath = "//*[@id=\"MobileNo\"]")
	private WebElement entermobileno;
	@FindBy(xpath = "//*[@id=\"btnSearch\"]")
	private WebElement Searchbtn;
	
	public void entername() {
		entername.sendKeys("Aniket");
	}
	public void entermobile() {
		entermobileno.sendKeys("7666682344");
	}
	public void Search() {
		Searchbtn.click();
	}
	
}
