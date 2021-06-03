@tag
Feature: Login 
  I want to use this template for my feature file

  @tag1
  Scenario: Successfully login with valid credentials
    Given Launch Google Chrome Browser
    When User opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
  	And User clicks on Login 
  	Then Page title should display "Dashboard / nopCommerce administration"
  	When User clicks on Logout link
  	Then Page title should diaplsy "Your store, Login"
  	And Close Google Chrome Browser

	Scenario Outline: Login Data Driven 
 		Given Launch Google Chrome Browser
    When User opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User enters Email as "<email>" and Password as "<password>"
  	And User clicks on Login 
  	Then Page title should display "Dashboard / nopCommerce admin"
  	When User clicks on Logout link
  	Then Page title should diaplsy "Your store, Login"
  	And Close Google Chrome Browser
  	
  	Examples: 
  	| email | password | 
  	| admin@yourstore.com | admin | 
  	| adming1@yourstore.com | admin |
 
