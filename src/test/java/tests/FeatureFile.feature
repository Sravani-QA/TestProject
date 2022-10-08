Feature Jupiter application LOGIN process

Background
 Given I initiate chrome driver
 Given I'll navigate to the Jupiter application

 @invalidlogin
Scenario: Login Process for Unsucessful login attempt
 Given I'm on jupiter application Homepage
 When I click on login page
 And I entered below "Test" and "Test@123" login details
 And I click on Submit button
 Then I validate error message

 @validlogin
 Scenario: Login Process for sucessful login attempt
  Given I'm on jupiter application Homepage
  When I click on login page
  And I entered below login details
   |Username  |   Password|
   |Sravani    | Pass123   |
  And I click on Submit button
  Then I validate success message

 @invalidlogin
 Scenario Outline: Login Process for Unsucessful login attempt
  Given I'm on jupiter application Homepage
  When I click on login page
  And I entered below "<name>" and "<pwd>" login details
  And I click on Submit button
  Then I validate error message
  Examples:
   |name    |pwd         |
   | Test   |  Test@123  |
   | Test1   |  Test@134  |
   | Test2   |  Test@534  |

