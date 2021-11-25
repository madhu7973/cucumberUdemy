Feature: Application Login 

#@tag1
#Scenario: HomePage
# Given User on signin landing page
#When User login with username "un1" and password "pwd1"
#Then Home page is displayed
#And Cards are displayed "true"

#Scenario: HomePage
#Given User on signin landing page
#When User login with username "un2" and password "pwd2"
#Then Home page is displayed
#And Cards are displayed "false"

#Background:
#Given open the browser
#Then delete all the cookies
#And load the app

#Scenario: Hooks
#Given open the browser
#Then delete all the cookies
#And load the app

Scenario: Multiple data 
	Given user on signup page 
	When user logs in with below data 
		| madhu | sudan | test@test33.com | Password123! |
	And clicks on signup button 
	Then user navigated to account page 
	
Scenario: user add a product to bag 
	Given user is in PDP page 
	When user clicks on add to bag button 
	Then product is added to bag 
	
	
	
	
