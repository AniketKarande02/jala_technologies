package Selenium_Technologies.Jala_technologies;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Employee_create extends Login_page {

	
	@FindBy(xpath = "//*[@id=\"MenusDashboard\"]/li[2]/a")
	private WebElement Employee;
	@FindBy(xpath = "//*[@id=\"MenusDashboard\"]/li[2]/ul/li[1]/a")
	private WebElement Create;
	@FindBy(xpath = "//*[@id=\"FirstName\"]")
	private WebElement First_name;
	@FindBy(xpath = "//*[@id=\"LastName\"]")
	private WebElement Last_name;
	@FindBy(xpath = "//*[@id=\"EmailId\"]")
	private WebElement Email;
	@FindBy(xpath = "//*[@id=\"MobileNo\"]")
	private WebElement MobileNo;
	@FindBy(xpath = "//*[@id=\"DOB\"]")
	private WebElement DateofBirth;
	@FindBy(xpath = "//*[@id=\"rdbMale\"]")
	private WebElement radiobtn;
	@FindBy(xpath = "//*[@id=\"Address\"]")
	private WebElement Adress;
	@FindBy(xpath ="//*[@id=\"CountryId\"]")
	private WebElement Country;
	@FindBy(xpath = "//*[@id=\"CityId\"]")
	private WebElement City;
	@FindBy (xpath = "//*[@id=\"frmEmployee\"]/div[1]/div/div[5]/div[2]/div[5]")
	private WebElement Skill;
	@FindBy(xpath = "//*[@id=\"frmEmployee\"]/div[2]/button")
	private WebElement savebtn;
	
	public void Employeebtn() {
	Employee.click();
	}
	public void Creats() {
		Create.click();
	}
	public void Firstname() {
		First_name.sendKeys("Aniket");
	}
	public void Lastname() {
		Last_name.sendKeys("Karande");
	}
	public void Email_id() {
	Email.sendKeys("aniketkarande02@gmail.com");	
	}
	public void mobilenumber() {
		MobileNo.sendKeys("7666682344");
	}
	public void Date_of_Birth() {
		DateofBirth.sendKeys("02/09/1998");
	}
	public void Radiobtn() {
		radiobtn.click();
	}
	public void Adress() {
		Adress.sendKeys("At/po kathaur bk,Tal-Ambegaon, Dist-Pune");
	}
	public void Country() {
		Country.click();
	}
	public void City() {
		City.click();
	}

	public void Skills() {
		Skill.click();
	}
	public void Save() {
		savebtn.click();
	}
}
