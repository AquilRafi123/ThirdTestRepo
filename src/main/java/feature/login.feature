Feature: Application Login 

Background:
Given User is on landing page

@Aquil
Scenario: User should be able to login with valid credentials
Given User enter valid user name "standard_user"
And User enters valid Password "secret_sauce"
And user clicks on login button
Then validate user logged in successfully


