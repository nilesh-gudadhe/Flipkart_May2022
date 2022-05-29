package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations {
	
	public static WebDriver driver=null;// parent for chrome and other browsers
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	
	
	//reusable methods
	
	//1. To open Browser
	public static Hashtable<String,Object> browserLaunch(Object[]InputParameters)
	{	
		try
		{String bname= (String) InputParameters[0];
		String exe= (String)InputParameters[1];
			
		if(bname.equalsIgnoreCase("chrome"))
				{
			System.setProperty("webdriver.chrome.driver",exe);
				
			driver=new ChromeDriver();
			driver.manage().window().maximize();
				}
		else if (bname.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", exe);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "method used: browserLaunch,Input Given:"+InputParameters[0].toString());
		}
		catch (Exception e)
		
		{
			outputParameters.put("STATUS","FAIL");
			outputParameters.put("MESSAGE", "method used: browserLaunch,Input Given:"+InputParameters[0].toString());
		}
		
		return outputParameters;
	}
	public static Hashtable<String,Object> openApplication(Object[]InputParameters)
	{
		try
		{
		String url=(String)InputParameters[0];
		driver.get(url);
		
		outputParameters.put("STATUS","PASS");
		outputParameters.put("MESSAGE", "method used:openApplication,Input Given:"+InputParameters[0].toString());
		}
		catch (Exception e)
		{
		outputParameters.put("STATUS","FAIL");
		outputParameters.put("MESSAGE", "method used: openApplication,Input Given:"+InputParameters[0].toString());
		}
	return outputParameters;
	}

	public static Hashtable<String,Object> clickOnElement(Object[]InputParameters)
	{	try
		{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String Xpath=(String)InputParameters[0];
		driver.findElement(By.xpath(Xpath)).click();
		
		outputParameters.put("STATUS","PASS");
		outputParameters.put("MESSAGE", "method used:clickOnElement,Input Given:"+InputParameters[0].toString());
		}
	catch (Exception e)
	{
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "method used:clickOnElement,Input Given:"+InputParameters[0].toString());
		
	}
	return outputParameters;
	
	}
	public static Hashtable<String,Object> sendKeys(Object[]InputParameters)
	{try
	{
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String xpath= (String)InputParameters[0];
		String uname=(String)InputParameters[1];
		driver.findElement(By.xpath(xpath)).sendKeys(uname);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "method used:sendKeys,Input Given:"+InputParameters[1].toString());
	}
	catch (Exception e)
	{
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "method used:sendKeys,Input Given:"+InputParameters[1].toString());
	}
	return outputParameters;
	}
	
	public static Hashtable<String,Object> navigateTo(Object[]InputParameters)
	{	try
		{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String xpath=(String) InputParameters[0];
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(xpath))).build().perform();
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "method used:navigateTo,Input Given:"+InputParameters[0].toString());
		}
	  catch (Exception e)
		{
		  outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "method used:navigateTo,Input Given:"+InputParameters[0].toString());
		}
	return outputParameters;
	}
	public static Hashtable<String,Object> loginValidation(Object[]InputParameters) throws InterruptedException
	{	try
	{
		Thread.sleep(3000);
		String xpath= (String)InputParameters[0];
		String text=(String)InputParameters[1];
		
		String actualText=driver.findElement(By.xpath(xpath)).getText();
		System.out.println(actualText);
		if (actualText.equalsIgnoreCase(text))
		{
			
			System.out.println("Test case is Passed");
		}
		else
		{
			System.out.println("Test case is Failed");
		}
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "method used:loginValidation,Input Given:"+InputParameters[0].toString());	
	}
	catch (Exception e)
	{
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "method used:loginValidation,Input Given:"+InputParameters[0].toString());
	}
	return outputParameters;
		}
		
		public static Hashtable<String,Object> invalidlogin(Object[]InputParameters) throws InterruptedException
		{	try
		{
			Thread.sleep(3000);
			String xpath= (String)InputParameters[0];
			String text=(String)InputParameters[1];
			
			String actualText=driver.findElement(By.xpath(xpath)).getText();
			System.out.println(actualText);
			if (actualText.equalsIgnoreCase(text))
			{
				
				System.out.println("Test case is Passed");
			}
			else
			{
				System.out.println("Test case is failed");
			}
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "method used:invalidLogin,Input Given:"+InputParameters[0].toString());	
		}
		catch (Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "method used:invalidLogin,Input Given:"+InputParameters[0].toString());	
		}
		return outputParameters;
		
	}
	public static Hashtable<String,Object> bClose()
	{
		try
		{
	driver.close();
	outputParameters.put("STATUS", "PASS");
	outputParameters.put("MESSAGE", "method used:bClose,Input Given:null");
	}
	catch (Exception e)
	{
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "method used:bClose,Input Given:null");
	}
		return outputParameters;
	}
}







