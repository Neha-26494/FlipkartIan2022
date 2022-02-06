Feature: Login Functionality

Background: user successfully logged in

Given user open "Chrome" browser with exe 
Given user enter url as 

@SmokeTest
Scenario: Login Functionality with valid credentials
When user Click on cance button
When user move to Login DropDown
When user Cick on My Profile
When  user enter "9762921256" as username
When  user enter "neha@123" as password
When user click on Login button
Then Application shows user profile to user
