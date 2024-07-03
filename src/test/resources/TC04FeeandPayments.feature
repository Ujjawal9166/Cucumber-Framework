@FeeandPayment 

Feature: Fee and Payment Scenarios

  @AddApplicationfeeplan
  Scenario Outline: Add Application Feeplan  details
    And I refresh page
    Given I click on "<Module>"
    And I click on "<Modulename>" Module
    And I click on "<Action>" button
    And I select "<FeeplanType>" and "<currency>" in fee plan
    Then I can see the successfull alert

    Examples: 
      | Module          | Modulename      | Action | FeeplanType | currency    |
      | Fees & Payments | Manage Fee Plan | Add    | Application | INR |

  @editfeeplan
  Scenario Outline: Editing Feeplan rule
    Given I select the created fee plan
    Then I click on "<Action>" button

    Examples: 
      | Action |
      | Edit   |

  @Addfeeplanrule
  Scenario Outline: Adding New Feeplan rule for Sale
    Given I click on "<Action>" button
    And I add new fee plan rule manually
    And I choose fee "<Rule Applicable>" radio btn
    And I select fee plan rule "<Status>" and "<Stage>" and "<Due Days>" and "<Description>"
    Then I can see the successfull alert

    Examples: 
      | Action | Rule Applicable | Status | Stage                  | Due Days | Description         |
      | Add    | Normal Rule     | Active | Application form sale  |       10 | Form sale fee       |
      | Add    | Normal Rule     | Active | Application submission |       10 | Form submission fee |

  @configurefeeheads
  Scenario Outline: Configure Fee Heads for Feeplan rule
    Given I select the created feeplan rule "<stage>"
    And I configure fee heads feeplan rule
    And I click on "<Action>" button inside nested tabs
    And I add "<Fee Heads>" "<Amount or Percentage>" "<Fee Amount>" and "<Fee Periodicity>"
    And I can see the successfull alert
    Then I close the fee head and cofigure fee heads tabs

    Examples: 
      | Action | Fee Heads       | Amount or Percentage | Fee Periodicity | Fee Amount | stage                  |
      | Add    | Form Sale       | Fixed Amount         | One Time        |       1000 | Application form sale  |
      | Add    | Form Submission | Fixed Amount         | One Time        |       2000 | Application submission |

  @approvefeeplan
  Scenario: Approve Feeplan
    Given I choose manage feeplan tab
    And I select the created fee plan for approve
    And I click approve the fee plan
    Then I can see the successfull alert

  @applytofeeplan
  Scenario Outline: Apply to Feeplan
    #Given I refrsh the data
    Given I select the created fee plan for apply
    And I click apply to the fee plan
    And I click on "<Action>" button inside nested tabs
    And I add "<AcademyLocation>", Program, Program Batch, and, "<Seat Type>"
    And I can see the successfull alert
    And I choose manage feeplan tab
    Then I refresh page

    Examples: 
      | Action | AcademyLocation                 | Seat Type    |
      | Add    | DXTXXnXvXrsXty-Dehradun | General Seat |

  #This scenarios only use if stage selection fees is required/Program Fee plan.
  
  
  @AddProgramFeeplanAdmission
  Scenario Outline: Add Program Feeplan  details
    Given I click on "<Module>"
    And I click on "<Modulename>" Module
    And I click on "<Action>" button
    And I select "<FeeplanType>" and "<currency>" in program fee plan
    Then I can see the successfull alert

    Examples: 
      | Module          | Modulename      | Action | FeeplanType | currency    |
      | Fees & Payments | Manage Fee Plan | Add    | Program     | INR |

  @editProgramfeeplan
  Scenario Outline: Editing program Feeplan rule
    Given I select the created program fee plan
    Then I click on "<Action>" button

    Examples: 
      | Action |
      | Edit   |

  @AddProgramfeeplanrule
  Scenario Outline: Adding New program Feeplan rule for Selection process
    Given I click on "<Action>" button
    And I add new fee plan rule manually
    And I choose fee "<Rule Applicable>" radio btn
    And I select program fee plan rule "<Status>" and "<Stage>" and "<Due Days>" and "<Description>"
    Then I can see the successfull alert

    Examples: 
      | Action | Rule Applicable | Status | Stage             | Due Days | Description   |
      | Add    | Normal Rule     | Active | Selection process |       10 | Written Fee   |
      | Add    | Normal Rule     | Active | Selection process |       10 | Interview Fee |
      
  @AddProgramfeeplanruledomicileornondomicile
  Scenario Outline: Adding New program Feeplan rule for Selection process
    Given I click on "<Action>" button
    And I add new fee plan rule manually
    And I choose fee "<Rule Applicable>" radio btn
    And I select "<Rule>"
    And I select program fee plan rule domicile "<Status>" and "<Stage>" and "<Due Days>" and "<Description>"
    Then I can see the successfull alert

    Examples: 
      | Action | Rule Applicable | Status | Stage     | Due Days | Description            | Rule                   |
      | Add    | Addtional Rule  | Active | Admission |       10 | Domicile Outside State | Domicile Outside State |
      | Add    | Addtional Rule  | Active | Admission |       10 | Domicile State         | Domicile State         |
      

  @configurefeeheads
  Scenario Outline: Configure Fee Heads for program Feeplan rule
    Given I select the created feeplan rule "<Description>"
    And I configure fee heads feeplan rule
    And I click on "<Action>" button inside nested tabs
    And I add "<Fee Heads>" "<Amount or Percentage>" "<Fee Amount>" and "<Fee Periodicity>"
    And I can see the successfull alert
    Then I close the fee head and cofigure fee heads tabs

    Examples: 
      | Action | Fee Heads            | Amount or Percentage | Fee Periodicity | Fee Amount | Description   |
      | Add    | Automation written   | Fixed Amount         | One Time        |       2000 | Written Fee   |
      | Add    | Automation interview | Fixed Amount         | One Time        |       1000 | Interview Fee |
      | Add    | Admission Commitment Fee | Fixed Amount     | One Time        |      15000 | Domicile Outside State |
      | Add    | Admission Commitment Fee | Fixed Amount     | One Time        |      10000 | Domicile State         |

  @approvefeeplan
  Scenario: Approve program Feeplan
    Given I choose manage feeplan tab
    And I select the created program fee plan for approve
    And I click approve the fee plan
    Then I can see the successfull alert

  @applytofeeplan
  Scenario Outline: Apply ProgramFeePlan
    #Given I refrsh the data
    Given I select the created program fee plan for approve
    And I click apply to the fee plan
    And I click on "<Action>" button inside nested tabs
    And I add "<AcademyLocation>", Program, Program Batch, and, "<Seat Type>"
    And I can see the successfull alert
    And I choose manage feeplan tab
    Then I refresh page

    Examples: 
      | Action | AcademyLocation         | Seat Type    |
      | Add    | DXTXXnXvXrsXty-Dehradun | General Seat |
