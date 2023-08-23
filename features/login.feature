@regressionTest
Feature: Validating login functionality across W3Schools

#Background tag can be used to have some steps across all the testcases in this feature file
Background: Navigate to w3schools
Given Navigate to W3Schools website 


Scenario: Login with correct username and password

When I enter the username
And I enter my password
And Click on login
Then Login should be successful

@smokeTest
Scenario Outline: Login with different sets of username and password

When I enter my "<username>" and my "<password>"
And Click on login
Then Login should be successful

Examples:
|username									|password|
|bv.nirmal@gmail.com			|Testing@123|
|suganeshvaratharajan@gmail.com|KDsuganesh@16|

