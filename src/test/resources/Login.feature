Feature: Validating login	

Scenario: checking login page of amazon
Given User is in Amazon Login Page
When User enters valid Username and Password
Then User clicks the login button
