Feature: Login page of a salesforce
  @sc01
    #before
  Scenario: Error message validation with Invalid credentials
    #beforestep
#  Given user navigates to salesforce application
    #afterstep
    #beforestep
    When user enters the user name "learnmore" and password "123"
    #afterstep
    #beforestep
    And user selects the login button
    #beforestep
    Then user validates the error message
    #after

  @multiple
  Scenario Outline: multiple test
# Given user navigates to salesforce application
    When user enters the user name "<user name>" and password "<password>"
    And user selects the login button
    Then verify whether user navigates to the homepage
    Examples:
      | user name | password |
      | aravinth  | 123      |
      |hello      | abc      |
      |sam        |345       |
