package CucumberMap;

import java.util.Hashtable;

import Support.SeleniumOperation;
import Utility.HTMLReportGenerator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Login
{
	
	@Given("^user open \"(.+)\" browser with exe$")
	public void user_open_browser_with_exe(String arg1) throws Throwable 
	{
		Object[] obj=new Object[1];
		obj[0]=arg1;
		
		SeleniumOperation.LaunchBrowser(obj);
		

	}

	@Given("^user enter url as$")
	public void user_enter_url_as() throws Throwable
	{
		//Object[] obj1=new Object[1];
	//obj1[0]="https://www.flipkart.com/";
	SeleniumOperation.ApplicationOpen();
	


	}

	@When("^user Click on cance button$")
	public void user_Click_on_cance_button() throws Throwable 
	{
		Thread.sleep(2000);
		
		 Object[] obj7=new Object[1];
			obj7[0]="//*[@Class='_2KpZ6l _2doB4z']";
			Hashtable<String,Object> output7=SeleniumOperation.ClickOnElement(obj7);
			HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^user Click on cance button$", output7.get("MESSAGE").toString());
			
	}

	@When("^user move to Login DropDown$")
	public void user_move_to_Login_DropDown() throws Throwable 
	{
		Object[] obj2=new Object[1];
		obj2[0]="//*[@Class='_1_3w1N']";
		Hashtable<String,Object> output2=SeleniumOperation.MoveToElement(obj2);
		HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(), "^user move to Login DropDown$", output2.get("MESSAGE").toString());
		

	}

	@When("^user Cick on My Profile$")
	public void user_Cick_on_My_Profile() throws Throwable
	{
		 Object[] obj3=new Object[1];
			obj3[0]="//div[@Class='_3vhnxf']";
			Hashtable<String,Object> output3=SeleniumOperation.ClickOnElement(obj3);
			HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"^user Cick on My Profile$", output3.get("MESSAGE").toString());
			

	}

	@When("^user enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable 
	{
		Thread.sleep(2000);
		
		Object[]obj4=new Object[2];
		obj4[0]="//*[@Class='_2IX_2- VJZDxU']";
		obj4[1]="9762921256";
		Hashtable<String,Object> output4=SeleniumOperation. EnterIDPass(obj4);
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(),"^user enter \"([^\"]*)\" as username$", output4.get("MESSAGE").toString());
		 Thread.sleep(2000);
		 

	}

	@When("^user enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg1) throws Throwable 
	{
		 Object[]obj5=new Object[2];
			obj5[0]="//*[@Class='_2IX_2- _3mctLh VJZDxU']";
			obj5[1]="neha@123";
			Hashtable<String,Object> output5=SeleniumOperation. EnterIDPass(obj5);
			HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"^user enter \"([^\"]*)\" as password$", output5.get("MESSAGE").toString());
			 Thread.sleep(2000);
		 

	}

	@When("^user click on Login button$")
	public void user_click_on_Login_button() throws Throwable
	{
		 Object[] obj6=new Object[1];
			obj6[0]="//*[@Class='_2KpZ6l _2HKlqd _3AWRsL']";
			Hashtable<String,Object> output6=SeleniumOperation.ClickOnElement(obj6);
			HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(),"^user click on Login button$", output6.get("MESSAGE").toString());
			Thread.sleep(2000);

	}

	@Then("^Application shows user profile to user$")
	public void application_shows_user_profile_to_user() throws Throwable 
	{

		Object[] obj10=new Object[2];
		obj10[0]="//*[@Class='_1ruvv2']";
		obj10[1]="Neha Mungi";
		Hashtable<String,Object> output10=SeleniumOperation.ValidationLogin(obj10);
		HTMLReportGenerator.StepDetails(output10.get("STATUS").toString(),"^Application shows user profile to user$", output10.get("MESSAGE").toString());

	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}