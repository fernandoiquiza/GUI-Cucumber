Feature: Sign-In to Pivotal Tracker

  Scenario: Sign-in to Pivotal Tracker with valid username and password.
    Given I navigate to Pivotal Tracker Website
    When I set a valid username/email as fernando.iquiza@fundacion-jala.org
    And I press NEXT button a new password field should appear
    And I set a valid password as MTat676435019
    And I press the SIGN IN button
    Then I should be redirected to the Pivotal Dashboard and see the url as https://www.pivotaltracker.com/dashboard