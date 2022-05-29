package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Login {
	
	@When ("^user opens \"(.*)\" browser with exe \"(.*)\"$")
	public void bLaunch(String bname, String exe)
	{
		Object[] input=new Object[2];
		input[0]= bname;
		input[1]=exe;
		Hashtable<String,Object>output=SeleniumOperations.browserLaunch(input);
		HTMLReportGenerator.StepDetails("STATUS", "^user opens \"(.*)\" browser with exe \"(.*)\"$", output.get("MESSAGE").toString());
	}
	@When("^user enters url as \"([^\"]*)\"$")
	public void openApp(String url)
	{
		Object[] input1= new Object[1];
		input1[0]=url;
		Hashtable<String,Object>output1=SeleniumOperations.openApplication(input1);
		HTMLReportGenerator.StepDetails("STATUS".toString(), "^user enters url as \"([^\"]*)\"$", output1.get("MESSAGE").toString());
	}
	@When("^user cancels initial login page$")
	public void cancelLoginW() throws InterruptedException
	{
		Object[] input2= new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		Hashtable<String,Object>output2=SeleniumOperations.clickOnElement(input2);
		HTMLReportGenerator.StepDetails("STATUS".toString(), "^user cancels initial login page$", output2.get("MESSAGE").toString());
	}
	@When("^user navigate to login button$")
	public void moveToLogin() throws InterruptedException
	{	Thread.sleep(3000);
		Object[] input3= new Object[1];
		input3[0]="//*[@class='_1_3w1N']";
		Hashtable<String,Object>output3=SeleniumOperations.navigateTo(input3);
		HTMLReportGenerator.StepDetails("STATUS".toString(), "^user navigate to login button$", output3.get("MESSAGE").toString());
	}
	@When ("^user click on My Profile button$")
	public void clickOnLogin()
	{
		Object[] input13= new Object[1];
		input13[0]="(//*[@class='_3vhnxf'])[1]";
		Hashtable<String,Object>output13=SeleniumOperations.clickOnElement(input13);
		HTMLReportGenerator.StepDetails("STATUS".toString(), "^user click on My Profile button$", output13.get("MESSAGE").toString());
	}
	
	@When ("^user enters user name as \"(.*)\"$")
	public void Uname(String uname)
	{
		Object[] input4= new Object[2];
		input4[0]="//*[@class='_2IX_2- VJZDxU']";
		input4[1]=uname;
		Hashtable<String,Object>output4=SeleniumOperations.sendKeys(input4);
		HTMLReportGenerator.StepDetails("STATUS".toString(), "^user enters user name as \"(.*)\"$", output4.get("MESSAGE").toString());
	}
	
	
	@When ("^user enters invalid user name as \"(.*)\"$")
	public void invalidUname(String uname)
	{
		Object[] input9= new Object[2];
		input9[0]="//*[@class='_2IX_2- VJZDxU']";
		input9[1]=uname;
		Hashtable<String,Object>output9=SeleniumOperations.sendKeys(input9);
		HTMLReportGenerator.StepDetails("STATUS".toString(), "^user enters invalid user name as \"(.*)\"$", output9.get("MESSAGE").toString());
	}

	
	@When ("^user enters password as \"(.*)\"$")
	public void password(String uname)
	{
		Object[] input5= new Object[2];
		input5[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
		input5[1]=uname;
		Hashtable<String,Object>output5=SeleniumOperations.sendKeys(input5);
		HTMLReportGenerator.StepDetails("STATUS".toString(), "^user enters password as \"(.*)\"$", output5.get("MESSAGE").toString());
	}
	
	@When("^user enters invalid password as \"([^\"]*)\"$")
	public void invalidPassword(String uname)
	{
		Object[] input10= new Object[2];
		input10[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
		input10[1]=uname;
		Hashtable<String,Object>output10=SeleniumOperations.sendKeys(input10);
		HTMLReportGenerator.StepDetails("STATUS".toString(), "^user enters invalid password as \"([^\"]*)\"$", output10.get("MESSAGE").toString());
	}
	
	
	
	
	@When ("^user clicks on Login button$")
	public void login()
	{
		Object[] input6= new Object[1];
		input6[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
		Hashtable<String,Object>output6=SeleniumOperations.clickOnElement(input6);
		HTMLReportGenerator.StepDetails("STATUS".toString(), "^user clicks on Login button$", output6.get("MESSAGE").toString());
	}
	@Then ("^Application shows user his profile$")
	public void validation() throws InterruptedException
	{
		Object[] input7=new Object[2];
		input7[0]="//*[@class='_1mHr1S']";
		input7[1]="Personal Information";
		Hashtable<String,Object>output7=SeleniumOperations.loginValidation(input7);
		HTMLReportGenerator.StepDetails("STATUS".toString(), "^Application shows user his profile$", output7.get("MESSAGE").toString());
		
	}
	@Then("^Application closes$")
	public void appClose() throws InterruptedException
	{
		Thread.sleep(10000);
		Hashtable<String,Object>output14=SeleniumOperations.bClose();
		HTMLReportGenerator.StepDetails("STATUS".toString(), "^Application closes$", output14.get("MESSAGE").toString());
	}
	
	@Then("^Application shows appropriate error message$")
	public void errorMsg() throws InterruptedException
	{
		Object[] input8= new Object[2];
		input8[0]="//*[@class='_1_3w1N']";
		input8[1]="Login";
		
		Hashtable<String,Object>output8=SeleniumOperations.invalidlogin(input8);
		HTMLReportGenerator.StepDetails("STATUS".toString(), "^Application shows appropriate error message$", output8.get("MESSAGE").toString());
	}

	@When ("^user enters invalid user name as (.+)$")
	public void uname(String given)
	{
		Object[] input11= new Object[2];
		input11[0]="//*[@class='_2IX_2- VJZDxU']";
		input11[1]=given;
		Hashtable<String,Object>output11=SeleniumOperations.sendKeys(input11);	
		HTMLReportGenerator.StepDetails("STATUS".toString(), "^user enters invalid user name as (.+)$", output11.get("MESSAGE").toString());
	}
	
	
	@When ("^user enter password as (.+)$")
	public void pass(String given)
	{
		Object[] input12= new Object[2];
		input12[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
		input12[1]=given;
		Hashtable<String,Object>output12=SeleniumOperations.sendKeys(input12);
		HTMLReportGenerator.StepDetails("STATUS".toString(),"^user enter password as (.+)$", output12.get("MESSAGE").toString());
	}	
}

















