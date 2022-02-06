package Support;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import CucumberMap.ConfigReader;

public class SeleniumOperation
{
   public static ConfigReader config;
	
	public static  WebDriver driver=null;
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	
 
	
	//Browser Launch
	public static Hashtable<String,Object> LaunchBrowser(Object[]input)
	{
		try {
		String S="Chrome";
		String S1="Firefox";
		String DriverName="webdriver.chrome.driver";
		String DriverName1="webdriver.gecko.driver";
		String BrowserName=(String) input[0];
		//String ExePath=(String) input[1];
		
		config=new ConfigReader();
		
		//Browser Launch method
		if(BrowserName.equals(S))
				{
		
			          System.setProperty(DriverName, config.getDriverPathChrome());
			          driver=new ChromeDriver();
			          driver.manage().window().maximize();
			          driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
			
				}
		else if(BrowserName.equals(S1))
		{
			System.setProperty(DriverName1, config.getDriverPathFF());
			driver=new FirefoxDriver();
			   driver.manage().window().maximize();
			   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
			
			
		}
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Action: Browser Launch, Input Given: " +input[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Action: Browser Launch, Input Given: " +input[0].toString());
			
		}
		return outputParameters;
	
	}
	//Open Application
		public static Hashtable<String,Object> ApplicationOpen()
		{ 
			try {
			//String Url=(String) input[0];
			driver.get(config.getApplicationUrl());
			 driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
			
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "Action: AppicationOpen, Input Given: " +config.getApplicationUrl().toString());
			
			}
			catch(Exception e)
			{
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "Action: AppicationOpen, Input Given: " +config.getApplicationUrl().toString());
			
			}
			return outputParameters;
			
		}
		
		//Click on Element
		public static Hashtable<String,Object> ClickOnElement(Object[] input)
		{
			try {
			String Xpath=(String)input[0];
		   driver.findElement(By.xpath(Xpath)).click();
		   
		    outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "Action: ClickOnElement, Input Given: " +input[0].toString());
			
			}
			catch(Exception e) 
			{
				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "Action: ClickOnElement, Input Given: " +input[0].toString());
				
				
			}
		return outputParameters;
			
		}
		
		//Enter Username and Password
		public static Hashtable<String,Object> EnterIDPass(Object[] input)
		{
			try {
			String Xpath=(String) input[0];
			String Sendkey=(String) input[1];
			WebElement path=driver.findElement(By.xpath(Xpath));
			path.sendKeys(Sendkey);
			
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "Action: EnterIDPass, Input Given: " +input[0].toString());
			}
			catch(Exception e)
			{
				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "Action: EnterIDPass, Input Given: " +input[0].toString());
			}
			return outputParameters;
		}
		
		//move to element
		public static  Hashtable<String,Object>MoveToElement(Object[] input)
		{
			try {
			Actions act=new Actions(driver);
			String Move=(String) input[0];
			WebElement path=driver.findElement(By.xpath(Move));
			act.moveToElement(path).build().perform();
			
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "Action: MoveToElement, Input Given: " +input[0].toString());
			}
			catch(Exception e)
			{
				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "Action: MoveToElement, Input Given: " +input[0].toString());
			}
			
			return outputParameters;
			
		}
		
		public static Hashtable<String,Object> ValidationLogin(Object[] input)
		{
			try {
			String Name=(String)input[0];
			String Name1=(String)input[1];
		
			WebElement Xpath=driver.findElement(By.xpath(Name));
			if(Xpath.getText().contains(Name1))
			{
				System.out.println("Test Case Successfully launched");
			}
			else {
				System.out.println("Test Case failed");
			}
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "Action: ValidationLogin, Input Given: " +input[0].toString());
			}
			catch(Exception e)
			{
				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "Action:ValidationLogin, Input Given: " +input[0].toString());
				
			}
			return outputParameters;
			
		}
		
		public static void main(String[] args) throws Throwable
		{
			Object[] obj=new Object[2];
			obj[0]="Chrome";
			obj[1]="E:\\Automation Support\\chromedriver.exe";
			LaunchBrowser(obj);
			
		//	Object[] obj1=new Object[1];
			//obj1[0]="https://www.flipkart.com/";
			ApplicationOpen();
			
			Thread.sleep(2000);
			
			 Object[] obj7=new Object[1];
				obj7[0]="//*[@Class='_2KpZ6l _2doB4z']";
				ClickOnElement(obj7);
			
			Object[] obj2=new Object[1];
			obj2[0]="//*[@Class='_1_3w1N']";
			MoveToElement(obj2);
			
			 Object[] obj3=new Object[1];
				obj3[0]="//div[@Class='_3vhnxf']";
				ClickOnElement(obj3);
				
				Thread.sleep(2000);
			
				Object[]obj4=new Object[2];
				obj4[0]="//*[@Class='_2IX_2- VJZDxU']";
				obj4[1]="9762921256";
				 EnterIDPass(obj4);
				 Thread.sleep(2000);
				 
				 Object[]obj5=new Object[2];
					obj5[0]="//*[@Class='_2IX_2- _3mctLh VJZDxU']";
					obj5[1]="neha@123";
					 EnterIDPass(obj5);
					 Thread.sleep(2000);
					 
					 
				 
					 Object[] obj6=new Object[1];
						obj6[0]="//*[@Class='_2KpZ6l _2HKlqd _3AWRsL']";
						ClickOnElement(obj6);
						Thread.sleep(2000);
						
						Object[] obj10=new Object[2];
						obj10[0]="//div[@Class='_1ruvv2']";
						obj10[1]="Neha Mungi";
						ValidationLogin(obj10);
				 
				 
				 
			
		}

	
	

	}
