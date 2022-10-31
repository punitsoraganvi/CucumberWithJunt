
@FB
Feature: login
 
  @Facebook
  Scenario: login with valid credentials 
    Given open the browser and enter the valid url
    When user enters the valid username
    And user enters the valid password 
    And click on login button
    Then user should be homepage of the application
   

 
