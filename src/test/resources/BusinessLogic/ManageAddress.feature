Feature: Manage Address Functionality

Background: user successfully logged in
Given user open "Chrome" browser with exe 
Given user enter url as 
Given user Click on cance button
Given  user move to Login DropDown
Given  user Cick on My Profile
Given  user enter "9762921256" as username
Given   user enter "neha@123" as password
Given  user click on Login button



@SmokeTest
Scenario: Manage Address Functionality with vaid data
When user Click on manage address
When user Click on Add a new address 
When user enter "Neha Mungi" as name
When user enter "9762921256" as mobile noumber
When user enter "414002" as pincode
When user enter "Bhingar" as locaity
When user enter "Brahmin Lane" as address
When user select Home as address type
When user Click on save button
Then application shows new address added successfully