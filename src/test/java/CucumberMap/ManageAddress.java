package CucumberMap;

import java.util.Hashtable;

import Support.SeleniumOperation;
import Utility.HTMLReportGenerator;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ManageAddress 
{
	
	
	@When("^user Click on manage address$")
	public void user_Click_on_manage_address() throws Throwable
	{

		Object[] object1=new Object[1];
		object1[0]="//div[@Class='NS64GK']";
		Hashtable<String,Object> output1=SeleniumOperation.ClickOnElement(object1);
		HTMLReportGenerator.StepDetails(output1.get("STATUS").toString(),"^user Click on manage address$", output1.get("MESSAGE").toString());
		
	}

	@When("^user Click on Add a new address$")
	public void user_Click_on_Add_a_new_address() throws Throwable
	{
		Object[] object2=new Object[1];
		object2[0]="//*[@CLass='_2KpZ6l _3lI646 _3dESVI']";
		Hashtable<String,Object> output2=SeleniumOperation.ClickOnElement(object2);
		HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(),"^user Click on Add a new address$", output2.get("MESSAGE").toString());
		

	}

	@When("^user enter \"([^\"]*)\" as name$")
	public void user_enter_as_name(String arg1) throws Throwable 
	{ 
		Thread.sleep(2000);
		Object[]object3=new Object[2];
		object3[0]="(//*[@Class='_1w3ZZo _2mFmU7'])[1] ";
		object3[1]="Neha Mungi";
		Hashtable<String,Object> output3=SeleniumOperation. EnterIDPass(object3);
		HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"^user enter \"([^\"]*)\" as name$", output3.get("MESSAGE").toString());
		
		 
		
	}

	@When("^user enter \"([^\"]*)\" as mobile noumber$")
	public void user_enter_as_mobile_noumber(String arg1) throws Throwable 
	{
		
		Object[] object4=new Object[2];
	    object4[0]="(//*[@Class='_1w3ZZo _2mFmU7'])[2]";
	    object4[1]="9762921256";
	Hashtable<String,Object> output4=SeleniumOperation.EnterIDPass(object4);
	HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(),"^user enter \"([^\"]*)\" as mobile noumber$", output4.get("MESSAGE").toString());



	}

	@When("^user enter \"([^\"]*)\" as pincode$")
	public void user_enter_as_pincode(String arg1) throws Throwable
	{
		 
		Object[]object5=new Object[2];
		object5[0]="(//*[@Class='_1w3ZZo _2mFmU7'])[3]";
		object5[1]="414002";
		Hashtable<String,Object> output5=SeleniumOperation.EnterIDPass(object5);
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"^user enter \"([^\"]*)\" as pincode$", output5.get("MESSAGE").toString());
	

	}

	@When("^user enter \"([^\"]*)\" as locaity$")
	public void user_enter_as_locaity(String arg1) throws Throwable
	{
		
		Object[]object6=new Object[2];
	object6[0]="(//*[@Class='_1w3ZZo _2mFmU7'])[4]";
	object6[1]="Bhingar";
	Hashtable<String,Object> output6=SeleniumOperation. EnterIDPass(object6);
	HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(),"^user enter \"([^\"]*)\" as locaity$", output6.get("MESSAGE").toString());
	



	}

	@When("^user enter \"([^\"]*)\" as address$")
	public void user_enter_as_address(String arg1) throws Throwable
	{
	
		Object[]object7=new Object[2];
		object7[0]="//*[@Class='_1sQQBU _1w3ZZo _1TO48q']";
		object7[1]="Brahmin Lane";
		Hashtable<String,Object> output7=SeleniumOperation. EnterIDPass(object7);
		HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(),"^user enter \"([^\"]*)\" as address$", output7.get("MESSAGE").toString());
	


	}

	@When("^user select Home as address type$")
	public void user_select_Home_as_address_type() throws Throwable 
	{
		Object[] object8=new Object[1];
		object8[0]="//*[@Class='_1XFPmK']";
		Hashtable<String,Object> output8=SeleniumOperation.ClickOnElement(object8);
		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(),"^user select Home as address type$", output8.get("MESSAGE").toString());
		

	}

	@When("^user Click on save button$")
	public void user_Click_on_save_button() throws Throwable
	{
		Object[] object9=new Object[1];
		object9[0]="//*[@Class='_2KpZ6l _1JDhFS _1o0c4q _3AWRsL']";
		Hashtable<String,Object> output9=SeleniumOperation.ClickOnElement(object9);
		HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(),"^user Click on save button$", output9.get("MESSAGE").toString());
		


	}

	@Then("^application shows new address added successfully$")
	public void application_shows_new_address_added_successfully() throws Throwable
	{
		Object[] object10=new Object[2];
		object10[0]="//*[@Class='_1bYJzd']";
		object10[1]="ADD A NEW ADDRESS";
		Hashtable<String,Object> output10=SeleniumOperation.ValidationLogin(object10);
		HTMLReportGenerator.StepDetails(output10.get("STATUS").toString(),"^application shows new address added successfully$", output10.get("MESSAGE").toString());


	}



}
