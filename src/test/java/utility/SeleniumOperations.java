package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations {
	
	public static WebDriver driver=null;// parent for chrome and other browsers
	
	//reusable methods
	
	//1. To open Browser
	public static void browserLaunch(Object[]InputParameters)
	{	
		String bname= (String) InputParameters[0];
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
	}
	public static void openApplication(Object[]InputParameters)
	{
		String url=(String)InputParameters[0];
		driver.get(url);
	}

	public static void clickOnElement(Object[]InputParameters)
	{driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String Xpath=(String)InputParameters[0];
		driver.findElement(By.xpath(Xpath)).click();
	}
	public static void sendKeys(Object[]InputParameters)
	{driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String xpath= (String)InputParameters[0];
		String uname=(String)InputParameters[1];
		driver.findElement(By.xpath(xpath)).sendKeys(uname);
	}
	public static void navigateTo(Object[]InputParameters)
	{driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String xpath=(String) InputParameters[0];
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(xpath))).build().perform();
	}
	public static void loginValidation(Object[]InputParameters) throws InterruptedException
	{	Thread.sleep(3000);
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
		}
		
		public static void invalidlogin(Object[]InputParameters) throws InterruptedException
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
		
	}
	public static void bClose()
	{
	driver.close();
	}
	
}







