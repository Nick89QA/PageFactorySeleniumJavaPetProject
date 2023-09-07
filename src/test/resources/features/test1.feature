Feature: Check functionality on the main page

  Scenario: I am located on the main page
    Given User go to the main page and enter Selenium in a search page
    When User go to registration page and enter the data in the registration form
    Then User checks all the pages in drop down menu
