package Support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Temp
{
	
	public static void main(String[]args) throws Throwable
	{
		//Browser Launch
    System.setProperty("webdriver.chrome.driver", "E:\\Automation Support\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Open Application
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@Class='_2KpZ6l _2doB4z']")).click();  //Click on cancel
		
		Actions act=new Actions(driver);
		WebElement MoveOnLogin=driver.findElement(By.xpath("//a[@Class='_1_3w1N']"));
		act.moveToElement(MoveOnLogin).build().perform();
		
	    driver.findElement(By.xpath("//ul[@Class='pO9syL _1s9xSv']//a[@Class='_2kxeIr _1pY_1Z']")).click();       
		
		//Enter UserName
		driver.findElementByXPath("//input[@Class='_2IX_2- VJZDxU']").sendKeys("9762921256");
		
		//Enter Password
		driver.findElementByXPath("//input[@Class='_2IX_2- _3mctLh VJZDxU']").sendKeys("neha@123");
		
		//Click Login
		driver.findElementByXPath("//button[@Class='_2KpZ6l _2HKlqd _3AWRsL']").click();
		
		Thread.sleep(3000);
		
		//Move to MyProfile
		
	    WebElement MyProfile=driver.findElement(By.xpath("//div[@Class='exehdJ' and text()='Neha']"));
	    act.moveToElement(MyProfile).build().perform();    
	    
	    //Click on MyProfile
	  WebElement  move= driver.findElement(By.xpath("//a[@Class='_2kxeIr']//div[@Class='_3vhnxf' and text()='My Profile']"));
	    act.doubleClick(move).build().perform();
	    act.clickAndHold(move);
	   
	    WebElement Move=driver.findElement(By.xpath("//button[@Class='L0Z3Pu']"));
	   Move.click();
	   
	   Thread.sleep(2000);
	
	    driver.findElementByXPath("//div[@Class='NS64GK _1MZ7_i']").click();
	    Thread.sleep(2000);
	    
	    driver.findElementByXPath("//div[@Class='_1cyhik']//span[text()='Edit']").click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@Class='_1Jqgld']//input[@Class='_1w3ZZo _2mFmU7']")).sendKeys("");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@Class='_1Jqgld']//input[@name='lastName']")).sendKeys("");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//label[@for='Female']")).click();
	    Thread.sleep(2000);
         driver.findElement(By.xpath("//button[@Class='_2KpZ6l _3eVCfA']")).click();

	 
         
	}
	
	
	
	
	

}
