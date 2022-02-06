package CucumberMap;

import Support.SeleniumOperation;
import Support.SeleniumOperation;

public class Trial
{
	
	
	
	
	public static void main(String[] args) throws Throwable
	{
		Object[] obj=new Object[2];
		obj[0]="Chrome";
		obj[1]="E:\\\\Automation Support\\\\chromedriver.exe";
		SeleniumOperation.LaunchBrowser(obj);
		
		Object[] obj1=new Object[1];
		obj1[0]="https://www.flipkart.com/";
		SeleniumOperation.ApplicationOpen();
		
		Thread.sleep(2000);
		
		 Object[] obj7=new Object[1];
			obj7[0]="//*[@Class='_2KpZ6l _2doB4z']";
			SeleniumOperation.ClickOnElement(obj7);
		
		Object[] obj2=new Object[1];
		obj2[0]="//*[@Class='_1_3w1N']";
		SeleniumOperation.MoveToElement(obj2);
		
		 Object[] obj3=new Object[1];
			obj3[0]="//div[@Class='_3vhnxf']";
			SeleniumOperation.ClickOnElement(obj3);
			
			Thread.sleep(2000);
		
			Object[]obj4=new Object[2];
			obj4[0]="//*[@Class='_2IX_2- VJZDxU']";
			obj4[1]="9762921256";
			SeleniumOperation. EnterIDPass(obj4);
			 Thread.sleep(2000);
			 
			 Object[]obj5=new Object[2];
				obj5[0]="//*[@Class='_2IX_2- _3mctLh VJZDxU']";
				obj5[1]="neha@123";
				SeleniumOperation. EnterIDPass(obj5);
				 Thread.sleep(2000);
			 
				 Object[] obj6=new Object[1];
					obj6[0]="//*[@Class='_2KpZ6l _2HKlqd _3AWRsL']";
					SeleniumOperation.ClickOnElement(obj6);
				
			 
					Thread.sleep(2000);
					Object[] obj8=new Object[2];
					obj8[0]="Neha Mungi";
					obj8[1]="//*[@Class='_1ruvv2']";
					SeleniumOperation.ValidationLogin(obj8);
			 
			 
		
	}




}
