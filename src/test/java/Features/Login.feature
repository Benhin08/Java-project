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
@tag1
Feature: Login Functionality
  As a user, I want to log in to the application using valid credentials so that I can access the dashboard.

  @tag2
  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters username "practice" and password "SuperSecretPassword!"
    And clicks the login button
    Then the user should be redirected to the dashboard page

  @tag3
  Scenario: Unsuccessful login with invalid credentials
    Given the user is on the login page
    When the user enters username "wrongUser" and password "wrongPass123"
    And clicks the login button
    Then an error message "Your username or password is incorrect" should be displayed

  @tag4
  Scenario: Unsuccessful login with blank fields
    Given the user is on the login page
    When the user leaves the username and password fields blank
    And clicks the login button
    Then an error message "Please fill out this field" should be displayed
