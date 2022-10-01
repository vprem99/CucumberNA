Feature: Login Page Feature

  Scenario: Login Page Title
    Given user is on login Page
    When user gets the title of the Page
    Then page title should be "Login - My Store"

  Scenario: Forget Password link
    Given user is on login Page
    Then Forgot password 	link should be displayed

  Scenario: Login with correct credentials
    Given user is on login Page
    When user enters username "premchand.vishwakarma@aqmtechnologies.com"
    And user enters password "Mumbai@7554"
    And Click on login button
    When user gets the title of the Page
    And page title should be "My account -My Store"
