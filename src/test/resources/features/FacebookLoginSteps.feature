Feature: Test Facebook Login Page

  Scenario Outline: Test Facebook Login with valid credentials
   Given launch  a chrome browser with facebook login url "https://www.facebook.com/login.php"
   When user enter a valid username "<username>" and a valid password "<password>"
   Then user should be able to login successfully


   Examples:
   | username | password |
   | username1@facebook.com | Welcome@0001 |
   | username2@facebook.com | Welcome@0002 |
   | username3@facebook.com | Welcome@0003 |
