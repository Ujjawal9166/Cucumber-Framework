@Admission 

Feature: Create Admission features

  Scenario Outline: Create New Appliation
    Given I click on "<Module>"
    And I click on "<Modulename>" Module
    And I add new application details "<ApplicantType>" "<Gender>"
    And I select source of entry
      | SourceofEntry |
      | Online      |
      | Telephone     |
    And I add "<StudentName>" "<EmployeeName>" contact and relationship details

    Examples: 
      | Module     | Modulename         | ApplicantType | Gender | StudentName      | EmployeeName |
      | Admissions | Create Application | New Applicant | Male   | Test Student EFT | Employee     |

  Scenario Outline: Add Appliation Program Details
    #Given I click on "<Action>" button
    Given I select academyLocation ProgramGroup and programname
    And I add program
    Then I can see the successfull alert

    Examples: 
      | Action |
      | Add    |

  Scenario: Collect Payment and Assign Application Id and Submit Form
    Given I select new student application
    And I collect payment assign application id and submit the form
    Then I can see the successfull alert
    And I refresh page

  Scenario Outline: Search For New Appliation Id
    Given I click on "<Module>"
    And I click on "<Modulename>" Module
    And I search application id
    And I click "<Buttonname>" button

    Examples: 
      | Module     | Modulename   | Buttonname |
      | Admissions | Applications | Search     |

  Scenario Outline: Approve the application
    Given I select edit the applicant
    And I click on "<Action>" button
    And I add on  "<Country>","<Nationality>","<Disabilites>","<Rule>","<Home Language>" and "<Second language>" application
    And I click on  approve application
    And I add the application program with "<Approval reason>"
    And I can see the successfull alert
    Then I refresh page

    Examples: 
      | Action | Approval reason | Country | Nationality | Disabilites | Rule       | Home Language | Second language |
      | Edit   | Eligible        | India   | Indian      | None        | Outside MP |	English				|	Hindi						|

  Scenario Outline: Accept fee for first stage
    Given I click on "<Module>"
    And I click on "<Modulename>" Module
    And I enter application ID and search the application
    And I select the application
    And I collect the payment for stage

    Examples: 
      | Module     | Modulename |
      | Admissions | Stage Fee  |

  Scenario Outline: Approve and promote applicant from first stage
    Given I click on "<Module>"
    And I click on "<Modulename>" Module
    And I approve the applicant for first stage
    Then I can see the successfull alert
    And I refresh page

    Examples: 
      | Module     | Modulename       |
      | Admissions | Selection Stage |
      #| Admissions | Assessment Stage |

  Scenario Outline: Accept fee for second stage
    Given I click on "<Module>"
    And I click on "<Modulename>" Module
    And I enter application ID and search the application
    And I select the application
    And I collect the payment for stage

    Examples: 
      | Module     | Modulename |
      | Admissions | Stage Fee  |

  Scenario Outline: Approve and promote applicant from second stage
    Given I click on "<Module>"
    And I click on "<Modulename>" Module
    Given I approve the applicant for seconf stage
    Then I can see the successfull alert
    And I refresh page

    Examples: 
      | Module     | Modulename       |
      | Admissions | Selection Stage |
      #| Admissions | Assessment Stage |
      #| Admissions | Assessment Stage |
      
  Scenario Outline: Search For New Appliation Id and approve admission
    Given I click on "<Module>"
    And I click on "<Modulename>" Module
    And I search application id
    And I click "<Buttonname>" button
    And I select the applicant application
    And I click on "<Action>" button
    And I click on "<tab name>" tab
    And I select Admission details tab and click on add program
    And I select the program and period
    And I choose "<Admission type>" and click on add program button
    Then I can see the successfull alert
    And I select the program and approve the admission
    And I select the program to be approve
    And I can see the successfull alert

    Examples: 
      | Module     | Modulename   | Buttonname | Action | Admission type | tab name          |
      | Admissions | Applications | Search     | Edit   | Confirmed      | Admission Details |

  Scenario Outline: Search For Student Appliation Id
    Given I click on "<Module>"
    And I click on "<Modulename>" Module
    And I search student application id
    And I click "<Buttonname>" button
    And I validate the student in studentlist
    Then I refresh page

    Examples: 
      | Module   | Modulename    | Buttonname   |
      | Students | Students List | SearchNested |

  #This scenarios only use For Manage Recipts For Student -----------------------------------
  
   #Scenario Outline: Manage Recipts For Student
    #Given I click on "<Module>"
    #And I click on "<Modulename>" Module
    #And I select recipts for "<Recipt Type>","<Recipt For>" and "<Currency>"
    #And I can see the successfull alert
    #Then I refresh page
#
    #Examples: 
      #| Module          | Modulename     | button | Recipt Type | Recipt For | Currency    |
      #| Fees & Payments | Manage Receipt | Add    | P&C Fee     | Student    | INR |
      #
   #Scenario Outline: Varify Recipts List For Student
    #Given I click on "<Module>"
    #And I click on "<Modulename>" Module
    #And I select recipts list for "<Recipt For>"
    #Then I refresh page
#
    #Examples: 
      #| Module          | Modulename     |  Recipt For | 
      #| Fees & Payments | Manage Receipt |  Student    |      
#
  #Scenario Outline: Validate Bills For Student
    #Given I click on "<Module>"
    #And I click on "<Modulename>" Module
    #And I select bills for "<Type>"
    #And I click "<Buttonname>" button
    #Then I wait for results
#
    #Examples: 
#
      #| Module          |					 Modulename           | Buttonname | Type    |
      #| Fees & Payments | 					Manage Bills     		| Search  	 |Student	 |
      #| Fees & Payments | Manage Invoices / Credit Note | Search     | Student |
      #
   #Scenario Outline: Manage Payments For Student
    #Given I click on "<Module>"
    #And I click on "<Modulename>" Module
    #And I select payment for "<Payment Type>","<Payment For>","<Amount>" and "<Currency>"
    #And I can see the successfull alert
    #Then I refresh page
#
    #Examples: 
      #| Module          | Modulename      | button | Payment Type | Payment For | Currency    |Amount|
      #| Fees & Payments | Manage Payments | Add    | P&C Fee     | Student    | INR |10000|
      #
    #Scenario Outline: Manage Voucher For Student
    #Given I click on "<Module>"
    #And I click on "<Modulename>" Module
    #And I select Voucher for "<Voucher Type>","<Voucher Link Type>"
    #And I can see the successfull alert
    #Then I refresh page
#
    #Examples: 
      #| Module          | Modulename      | Voucher Type | Voucher Link Type |
      #| Fees & Payments | Manage Voucher  | Individual   | Receipt   				 |
      #
    #Scenario Outline: Validate Refund Module
    #Given I click on "<Module>"
    #And I click on "<Modulename>" Module
    #Then I validate the list of applicants and fee head refunds
    #Then I refresh page
    #
     #Examples: 
      #| Module     | Modulename  | 
      #| Admissions |  Refund 		 | 
           #
    #Scenario Outline: Validate Refund Module
    #Given I click on "<Module>"
    #And I click on "<Modulename>" Module
    #Then I validate the final admissions list in refunds
    #Then I refresh page
    #
     #Examples: 
      #| Module     | Modulename  | 
      #| Admissions |  Final Admission List 		 | 
      #
    