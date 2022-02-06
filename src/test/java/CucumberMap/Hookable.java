package CucumberMap;

import Utility.HTMLReportGenerator;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hookable 
{
	@Before
	public  void beforeMethod(Scenario scenario) throws Throwable
	{
		HTMLReportGenerator.TestSuiteStart("E:\\Automation Support\\FinalProject2022\\Flipkart\\target\\Report\\extentreports\\Flipkart.html", "FlipkartProject");
		HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus());
		System.out.println("------------Scenario Start------------");
	}	
   
	@After
	public void afterMethod(Scenario scenario)
	{
		
		System.out.println("------------Scenario End------------");
		HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd();
	}
		
	

}
