Feature: US031 As an administrator, I want an admin panel to be available to perform administrative tasks and to be able to log in to the admin panel with registered email and password.

  Scenario: TC01 Logo Redirect to Homepage
Given As the user opens the browsers and enters the URL
When As the user click on the AGILESWIFT CARGO logo


  Scenario: TC02 Email, Password Input and Sign In Button Visibility
    Given As the user opens the browsers and enters the URL
    When As the user clicks Login
    Then As the user checks whether the Enter Email or Mobile
    Then As the user enter valid password and email adddress and clicks Sign in.


  Scenario: TC03 Facebook Button Redirect
    Given As the user opens the browsers and enters the URL
    When As the user finds and clicks the Facebook button on the login page
    Then As the user sees facebook page when click the Facebook button.

  Scenario: TC04 Google Button Redirect
    Given As the user opens the browsers and enters the URL
    When As the user finds and clicks the Google button on the login page
    Then As the user sees google page when click the google button.


  Scenario: TC05  Sign Up Here Functionality

Given As the user opens the browsers and enters the URL
When As the user clicks Login and 'Sign Up Here'
Then As the user checks that the 'Bussiness Name' ,'Full Name', 'Select Hub', 'Mobile', 'Password', 'Address', 'Register My Account'

  Scenario: TC06  Forgot Password Functionality
    Given As the user opens the browsers and enters the URL
    When As the user clicks Login and <Forgot Password>
    Then As the user checks that the 'Email Address' text box and the 'Send Password Reset Link' button are visible.

  Scenario: TC07  Password Reset Email Sending
    Given As the user opens the browsers and enters the URL
    When As the user clicks Login and <Forgot Password>
    Then As the user enters the valid email and clicks Send Password Reset Link' button.

  Scenario: TC08 Successful Login
    Given As the user opens the browsers and enters the URL
    When As the user clicks Login and enters the valid mail and password
    Then As the user access admin panel