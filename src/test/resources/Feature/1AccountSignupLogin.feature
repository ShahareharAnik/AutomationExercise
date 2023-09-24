Feature: Online Shopping Initializations sign up and login
  Scenario: Home Page
    Given visit the Website
    Then  The home page is visible successfully
#
#  Scenario Outline: Sign Up
#    Given SignUp page entry
#    When New User SignUp by '<Name>' and '<email>'
#    And Set Title , '<Password>' and Date of birth
#    And Address Information By '<FirstName>' , '<LastName>' , '<Company>' , '<Address>' And '<Address 2>'
#    And  Set Country '<State>' , '<City>', '<ZipCode>' and '<MobileNumber>'
#    Then Create Account
#    And logout
#    Examples:
#      |Name|email    |Password|FirstName|LastName|Company|Address|Address 2|State|City|ZipCode|MobileNumber|
#      |Anik|888k@g.com|123456  |SAnik    |Rahman  |XYZ    |Mirpur |Home no 2 |DOSH|Dhaka|1206  |017111111111|
#
#  Scenario Outline: Incorrect log in Check
#    Given Showing the login Page
#    When Input Incorrect mail: '<Email>'
#    And Input Incorrect pass: '<password>'
#    Then check the error massage
#    Examples:
#    |Email|password|
#    |mist@k.com|987654|
#
#    Scenario Outline: Correctly login
#      Given Showing the login Page with incorrect values
#      When Input correct mail: '<Email>'
#      And Input correct pass: '<password>'
#      Then Log in
#      Examples:
#        |Email      |password|
#        |888k@g.com |123456|