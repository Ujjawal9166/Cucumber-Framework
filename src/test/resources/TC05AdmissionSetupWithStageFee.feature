@Admission 

Feature: Admission Setup features

  Scenario Outline: Add the selection process for the admission
    Given I click on "<Module>"
    And I click on "<Modulename>" Module
    And I click on "<Action>" button inside nested tabs
    And I add the selection process of "<type>"
    Then I can see the successfull alert

    Examples: 
      | Module     | Modulename        | Action | type      |
      | Admissions | Selection Process | Add    | Admission |
     # | Admissions | Assessment Process | Add    | Admission |

  Scenario Outline: Add the selection process stages
    Given I click on the created selection process
    And I click on "<Action>" button inside nested tabs
    And I add selection stages
      | Stages               | Days |
      | Automation Written   |    5 |
      | Automation Interview |    5 |
    Then I add the evaluation parameters
      | stage name           | EPName        | Weightage | MaxMarks |
      | Automation Written   | Handwriting   |       100 |      100 |
      | Automation Interview | Communication |       100 |      100 |

    Examples: 
      | Action | Buttonname  |
      | Edit   | More Action |

  Scenario Outline: Admission setup
    Given I click on "<Module>"
    And I click on "<Modulename>" Module
    And I select Academylocation and ProgramGroup which is not configured
    And I select the program which need to be configured
    And I select the selection process for "<Type>"

    Examples: 
      | Module     | Modulename      | Type                 | 
      | Admissions | Admission Setup | Individual Selection | 

  Scenario Outline: Stage setting
    Given I click on "<tab name>" tab
    And I select the selection process with fee
      | Stages               | MinSeats | MaxSeats | FeeplanStage      |
      | Automation Written   |        1 |       10 |Selection process  |
      | Automation Interview |        1 |       10 |Selection process  |

    Examples: 
      | tab name       |
      | Stage Settings |

  Scenario Outline: Application setting
    Given I click on "<tab name>" tab
    And I select the application settings process
    Then I can see the successfull alert

    Examples: 
      | tab name             |
      | Application Settings |

  Scenario Outline: Admission setting
    Given I click on "<tab name>" tab
    And I select the admission settings process "<Type>"
    Then I can see the successfull alert
    And I refresh page

    Examples: 
      | tab name           | Type   |
      | Admission Settings | Manual |
      
    Scenario Outline: Run the Job for Start Admission
    Given I click on "<Module>"
    And I click on "<Modulename>" Module
    Then I select "<JobName>" and "<JobState>"
    And I click "<JobName>" and "<JobState History>"
    Then I refresh page

    Examples: 
      | Module | Modulename  | JobName                 | JobState |JobState History|
      | Setup  | Job History | Start Admission Process | Waiting  |History|
      

  Scenario Outline: Admission setup Configure combinations Checking
    Given I click on "<Module>"
    And I click on "<Modulename>" Module
    And I select academy and ProgramGroup which is configured

    Examples: 
      | Module     | Modulename      |
      | Admissions | Admission Setup |
      
      
      
      

  #Scenario Outline: Admission setup Configure combinations Checking
    #Given I click on "<Module>"
    #And I click on "<Modulename>" Module
    #And I select academyloc and ProgramGroup which is configured
#
    #Examples: 
      #| Module     | Modulename      |
      #| Admissions | Admission Setup |
#
  #Scenario Outline: Stage setting for Written
    #Given I click on "<tab name>" tab again
    #And I select the "<SelProcessStage>" and "<FeeplanStage>" selection process feeplan applicable
#
    #Examples: 
      #| tab name       | SelProcessStage    | FeeplanStage      |
      #| Stage Settings | Automation Written | Selection process |
#
  #Scenario Outline: Stage setting for Interview
    #Given I click on "<tab name>" tab again
    #And I select the "<SelProcessStage>" and "<FeeplanStage>" selectionprocess feeplan applicable
#
    #Examples: 
      #| tab name       | SelProcessStage      | FeeplanStage      |
      #| Stage Settings | Automation Interview | Selection process |

 