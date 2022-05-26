Feature: Login Functionality

Background: User successfully clicked on initial login window
When user opens "chrome" browser with exe "D:\\IT\\Automation support\\chromedriver.exe"
When user enters url as "https://www.flipkart.com/"
When user cancels initial login page

@SmokeTest
Scenario: Login functionality with valid credentials
When user navigate to login button
When user click on My Profile button
When user enters user name as "9403770301"
When user enters password as "chatrapati"
When user clicks on Login button
Then Application shows user his profile
Then Application closes

@RegressionTest
Scenario Outline: Login functionality with invalid username and valid password
When user navigate to login button
When user click on My Profile button
When user enters invalid user name as <username>
When user enter password as <password>
When user clicks on Login button
Then Application shows appropriate error message
Then Application closes

Examples:
				|username|password|
				|8888650295|chatrapati|
				|9403770301|ShivajiMaharaj|

