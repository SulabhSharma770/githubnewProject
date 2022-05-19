Feature: login functionality.

  Scenario: To login to Gmail website
    Given User is on gmail login page
    When User enters valid credentials   
    And User enters valid password
    And User clicks on login button
    Then User should be logged into his Gmail account successfully
