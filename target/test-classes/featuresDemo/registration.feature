Feature: Registration

Scenario: Checking with valid details

Given user is no login page 
When User enters following details
|prem| sharma|mpremchand99@gmail.com|mumbai|
Then user should be logged in


Given user is no login page 
When User enters following details as Map
|name| sname|email|city|
|Prem| Sharma|mpremchand99@gmail.com|mumbai|
|Jyoti| Sharma|mpremchand99@gmail.com|mumbai|
|Kajal| Yadav|mpremchand99@gmail.com|mumbai|

Then user should be logged in