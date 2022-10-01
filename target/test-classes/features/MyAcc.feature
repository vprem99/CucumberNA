Feature: Account Page Feature

  Background: 
    Given User is already logged into application
      | username                                  | password    |
      | premchand.vishwakarma@aqmtechnologies.com | Mumbai@7554 |

  Scenario: Account Page title
    Given User is on Accounts page
    When user gets the title of the Page
    And page title should be "My account - My Store"

  Scenario: Accounts section count
    Given User is on Accounts page
    Then user gets accounts section
      | ORDER HISTORY AND DETAILS |
      | MY CREDIT SLIPS           |
      | MY ADDRESSES              |
      | MY PERSONAL INFORMATION   |
      | MY WISHLISTS              |
    And accounts section count should be 5
