Feature: Login scenarios

  @regression @logout-test @Logintest @DirectAdmission
  Scenario Outline: Validating the logout functionality
    When I enter username as "<username>"
    And I enter password as "<password>"
    And I login
    Then I am on homepage
   
    Examples: 
      | username | password | 
      | sysadmin | password |
