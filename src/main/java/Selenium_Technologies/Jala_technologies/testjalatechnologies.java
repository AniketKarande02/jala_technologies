package Selenium_Technologies.Jala_technologies;

import org.testng.annotations.Test;



public class testjalatechnologies extends Search{
	
	@Test
	public void testRun() {
		
		Login_page l=new Login_page();
		waiting();
		l.enterusername();
		waiting();
		l.enterpassword();
		waiting();
		l.clickChekbox();
		waiting();
		l.ButnLogin();
		
		Employee_create ec=new Employee_create();
		ec.Employeebtn();
		waiting();
		ec.Creats();
		waiting();
		ec.Firstname();
		waiting();
		ec.Lastname();
		ec.Email_id();
		waiting();
		ec.mobilenumber();
		waiting();
		ec.Date_of_Birth();
		waiting();
		ec.Radiobtn();
		waiting();
		ec.Adress();
		waiting();
		ec.Country();
		waiting();
		ec.City();
		waiting();
		ec.Skills();
		waiting();
		ec.Save();
		waiting();
		
		Search s=new Search();
		s.entername();
		waiting();
		s.entermobile();
		waiting();
		s.Search();

}
	static final int TIME_OF_WAITING= 1000*2;
	public void waiting() {
		try {
			Thread.sleep(TIME_OF_WAITING);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
}
