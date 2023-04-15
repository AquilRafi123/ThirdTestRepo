Feature: Application login try

@Nahid
Scenario: User should be able to login with correct credentials
Given user enters correct user name 
And user enters correct password
Then User click on login button 
Then USer is navigated to next page 