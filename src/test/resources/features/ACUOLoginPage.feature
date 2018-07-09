Feature: Test ACUO Login Page

  Scenario: Test Login to ACUO with valid credentials
   Given launch Firefox with application
   When user enter valid username and valid password
   Then user should be able to login successfully