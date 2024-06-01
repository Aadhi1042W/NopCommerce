Feature: Customers Adding On The NopCommerce Application

  Background: User Login The Nop Commerce Application
    Given User Should Land On The You Store Login Page
    When User Click The Email Box And Enter The User Email
    And User Click The Password Box And Enter The Password
    Then User Click The Login Button And Navigate To The Home Page
    And User Handle The Alert Popped In The Home page
    And User Click The Customer In The Dashboard And Click The Customer In The Given List

@Smoke
  Scenario: Login Nop Commerce Application Using Username and Password And Adding New Customer
    When User Click The Add New Button To Add New Customer And User Can See The Customer Info Page
    And User Fills The Customer Details In The Customer Info Page
    Then User Click The Save Button And User Can See The Confirmation message Shown In The Home Page
    And User Click The Logout Button
@Regression
  Scenario: User Login The Nop  Commerce And Update The User Details
    When User Scroll Down To Customer Lists And Select One Email And Click The Edit Button Then Land On The Edit Customer Details Page
    And User Changes The Customer Infos And Enter Save Button
    Then User See The Update Confirmation Message Shown In The Home Page
    And User Click The Logout Button
@Sanity
  Scenario: User Login Nop Commerce And Check The Newly Added Customer Is Present or Not
    When User Click The Email Box And Enter The Newly Added User Email And Click The Search Button And Validates The Email Is Present Or Not
    And User CLick The Logout Button
@Smoke
  Scenario: User Login Nop Commerce And Delete The Customer Added In The Customer List
    When User Select One Customer In The Customer List And Click The Edit Button
    And User Click The Delete Button And Handle The Alert Popped In The Current Page
    Then User Confirms The Confirmation Message Shown In The Home Page
    And User Click The LogOut Button
