#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Massmutual test feature file
  This is a feature file for Massmutual Test

  @Scenario
  Scenario Outline: Validate the below test requirements
    Given Go to "<URL>"
    When Need to verify the right count of values appear on the screen
    And Need to verify the values on the screen are greater than "<value1>"
    And Need to verify the total balance is correct based on the values listed on the screen
    And Need to verify the values are formatted as currencies
    And Need to verify the total balance matches the sum of the values
    Then Close the browser

    Examples: 
      | URL                              | value1 |
      | https://www.exercise1.com/values |      0 |
