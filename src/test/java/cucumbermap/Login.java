package cucumbermap;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.SeleniumOperations;

public class Login {
	
	@When ("^user opens \"(.*)\" browser with exe \"(.*)\"$")
	public void bLaunch(String bname, String exe)
	{
		Object[] input=new Object[2];
		input[0]= bname;
		input[1]=exe;
		SeleniumOperations.browserLaunch(input);
	}
	@When("^user enters url as \"([^\"]*)\"$")
	public void openApp(String url)
	{
		Object[] input1= new Object[1];
		input1[0]=url;
		SeleniumOperations.openApplication(input1);
	}
	@When("^user cancels initial login page$")
	public void cancelLoginW() throws InterruptedException
	{
		Object[] input2= new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperations.clickOnElement(input2);
	}
	@When("^user navigate to login button$")
	public void moveToLogin() throws InterruptedException
	{	Thread.sleep(3000);
		Object[] input3= new Object[1];
		input3[0]="//*[@class='_1_3w1N']";
		SeleniumOperations.navigateTo(input3);
	}
	@When ("^user click on My Profile button$")
	public void clickOnLogin()
	{
		Object[] input2= new Object[1];
		input2[0]="(//*[@class='_3vhnxf'])[1]";
		SeleniumOperations.clickOnElement(input2);
	}
	
	@When ("^user enters user name as \"(.*)\"$")
	public void Uname(String uname)
	{
		Object[] input4= new Object[2];
		input4[0]="//*[@class='_2IX_2- VJZDxU']";
		input4[1]=uname;
		SeleniumOperations.sendKeys(input4);
	}
	
	@When ("^user enters invalid user name as \"(.*)\"$")
	public void invalidUname(String uname)
	{
		Object[] input9= new Object[2];
		input9[0]="//*[@class='_2IX_2- VJZDxU']";
		input9[1]=uname;
		SeleniumOperations.sendKeys(input9);
	}
	
	@When ("^user enters password as \"(.*)\"$")
	public void password(String uname)
	{
		Object[] input5= new Object[2];
		input5[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
		input5[1]=uname;
		SeleniumOperations.sendKeys(input5);
	}
	@When("^user enters invalid password as \"([^\"]*)\"$")
	public void invalidPassword(String uname)
	{
		Object[] input10= new Object[2];
		input10[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
		input10[1]=uname;
		SeleniumOperations.sendKeys(input10);
	}
	
	
	
	@When ("^user clicks on Login button$")
	public void login()
	{
		Object[] input6= new Object[1];
		input6[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
		SeleniumOperations.clickOnElement(input6);
	}
	@Then ("^Application shows user his profile$")
	public void validation() throws InterruptedException
	{
		Object[] input7=new Object[2];
		input7[0]="//*[@class='_1mHr1S']";
		input7[1]="Personal Information";
		SeleniumOperations.loginValidation(input7);
		
	}
	@Then("^Application closes$")
	public void appClose() throws InterruptedException
	{
		Thread.sleep(10000);
		SeleniumOperations.bClose();
	}
	@Then("^Application shows appropriate error message$")
	public void errorMsg() throws InterruptedException
	{
		Object[] input8= new Object[2];
		input8[0]="//*[@class='_1_3w1N']";
		input8[1]="Login";
		
		SeleniumOperations.invalidlogin(input8);
	}
	@When ("^user enters invalid user name as (.+)$")
	public void uname(String given)
	{
		Object[] input11= new Object[2];
		input11[0]="//*[@class='_2IX_2- VJZDxU']";
		input11[1]=given;
		SeleniumOperations.sendKeys(input11);	
	}
	
	@When ("^user enter password as (.+)$")
	public void pass(String given)
	{
		Object[] input12= new Object[2];
		input12[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
		input12[1]=given;
		SeleniumOperations.sendKeys(input12);
	}	
}

















