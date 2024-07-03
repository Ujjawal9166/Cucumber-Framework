@Examination @regression
Feature: PnC Scenarios

 #@CreateSubject
  #Scenario Outline: Create Subject/course
    #Given I click on "<Module>"
    #And I click on "<Modulename>" Module
    #And I click on "<Action>" button
    #And I fill the mandatory details for course or subject of "<type>","<Department>","<Min Marks>","<Max Marks>","<course type>"
    #And I can see the successfull alert
    #Then I refresh page
#
    #Examples: 
      #| Modulename | Module             | Action | type  | Department | Min Marks | Max Marks | course type    |
   #   | Subjects   | Grades & Subjects  | Add    | Marks | Academic Adv Grp |        35 |       100 |                     |
      #| Courses    | Programs & Courses | Add    | Marks | Academic   |        35 |       100 | Course Section |

  @Createassessmentmethod
  Scenario Outline: Add Assessment Method
    Given I click on "<Module>"
    And I click on "<Modulename>" Module
    And I click on "<Action>" button
    And I add assessment method
    Then I can see the successfull alert

    Examples: 
      | Modulename         | Module       | Action |
      | Assessment Methods | Examinations | Add    |

  Scenario Outline: Add Assign Assessment Method
    Given I click on "<Tab name>" tab
    And I fill the mandatory details for assign assessment method "<Type>"
    Then I can see the successfull alert
    Then I Verify the created assessment method "<Type>"
    And I refresh page

    Examples: 
      | Tab name                 | Type      | Action |
      | Assign Assessment Method | Academics | Add    |

  
  Scenario Outline: Add Assessment Scheme
    Given I click on "<Module>"
    And I click on "<Modulename>" Module
    And I click on "<Action>" button
    And I fill assessment scheme "<Type>" and "<Rounding Mode>" and "<Academic Term>" details
    Then I can see the successfull alert

    Examples: 
      | Modulename        | Module       | Action | Type      | Rounding Mode | Academic Term |
      | Assessment Scheme | Examinations | Add    | Academics | Round Half Up |          2023 |

  Scenario Outline: Search Assessment Scheme name
    Given I searching assessment scheme "<Type>" and "<Academic Term>" name
    And I click "<Buttonname>" button
    And I validate the assessment scheme

    Examples: 
      | Buttonname | Type      | Academic Term |
      | Search     | Academics |          2023 |

  Scenario Outline: Edit Assessment scheme and Linking Academy location
    Given I click on "<Action>" button
    And I click on "<Tab name>" tab
    And I link academy location

    Examples: 
      | Action | Tab name               |
      | Edit   | Link Academy Locations |

  Scenario Outline: Mapping Course in Assessment scheme
    Given I click on "<Tab name>" tab
    And I mapping course

    Examples: 
      | Tab name       |
      | Course Mapping |

  Scenario Outline: Mapping Variant in Assessment scheme
    Given I click on "<Tab name>" tab
    And I mapping elegible course variants
    Then I can see the successfull alert

    Examples: 
      | Tab name        |
      | Variant Mapping |

  Scenario Outline: Mapping Assessment Scheme Hierarchy
    Given I click on "<Tab name>" tab
    And I add the assessment scheme hierarchy
    Then I can see the successfull alert

    Examples: 
      | Tab name        						|
      | Assessment Scheme Hierarchy |
