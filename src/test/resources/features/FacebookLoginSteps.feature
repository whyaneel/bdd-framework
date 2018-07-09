Feature: Test Facebook Login Page

  Scenario: Test Facebook Login with valid credentials
   Given launch  a chrome browser with facebook login url
   When user enter a valid username
   And a valid password
   Then user should be able to login successfully