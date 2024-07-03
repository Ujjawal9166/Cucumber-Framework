Feature: Common feature
  I want to use this common feature steps across entire project without re-writing the locator

  Scenario Outline: Common steps
    And I click on "<button>" option
    Then I click on "Examinations"
    And I click on "<Modulename>" Module
    And I click on "<Action>" button
    And I click on "<Action>" button inside nested tabs
    And I click on Save button of "<type>"
    And I click "<Buttonname>" button
    And I select the "<rownumber>" row of the table
    And I can see the successfull alert
    And I logged out

    Examples: 
      | button                    | Modulename      | Action                  | type                     | Buttonname          | rownumber | name            |
      | Delete , Add, View , Edit | Manage Campaign | Add, Delete, View, Edit | normal , nested , window | Today , More Action |     1,2,3 | any header name |
