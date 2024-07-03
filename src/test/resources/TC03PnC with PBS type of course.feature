@PnC 
Feature: PnC Scenarios

  @CreateSubject
  Scenario Outline: Create Subject/course
    Given I click on "<Module>"
    And I click on "<Modulename>" Module
    And I click on "<Action>" button
    And I fill the mandatory details for course or subject of "<type>","<Department>","<Min Marks>","<Max Marks>","<course type>"
    Then I can see the successfull alert

    Examples: 
      | Modulename | Module             | Action | type  | Department | Min Marks | Max Marks | course type    |
   #   | Subjects   | Grades & Subjects  | Add    | Marks | Academic Adv Grp |        35 |       100 |                     |
      | Courses    | Programs & Courses | Add    | Marks | Academic   |        35 |       100 | Program-Batch-Section |

  @AddGrade @AddProgram
  Scenario Outline: Add Grade/Program details
    Given I click on "<Module>"
    And I click on "<Modulename>" Module
    And I click on "<Action>" button
    And I click "<Buttonname>" button
    And I fill the basic details for creating the grade or program using "<phaseGrp>","<Category>","<Evalution>","<Department>","<location>","<coordinator>"
    Then I can see the successfull alert
    And I logged out

    Examples: 
      | Modulename | Module             | Action | Buttonname | phaseGrp       | Category | Evalution | Department       | location                | coordinator                 |
      #| Grades     | Grades & Subjects  | Add    | Manually   | Middle School | A Level  | Marks     | head of department |Serosoft-Lonehill | System      |
      | Programs   | Programs & Courses | Add    | Manually   | Under Graduate | BTech    | Marks     | Academic Affairs | DXTXXnXvXrsXty-Dehradun | 10001111 |

  @SearchGrade
  Scenario Outline: Search created grade
    Given I enter username as "<username>"
    And I enter password as "<password>"
    And I login
    # Then I am on homepage
    And I click on "<Module>"
    And I click on "<Modulename>" Module
    And I entered the created grade or program name
    And I click "<Buttonname>" button
    Then I can see the Grade or program in search results

    Examples: 
      | Buttonname | username | password | Modulename | Module             |
      | Search     | sysadmin | password | Programs   | Programs & Courses |
  #| Search     | sysadmin | password | Grades     | Grades & Subjects  |
  
  @GradeIntakeOrPrgDeatils
  Scenario Outline: Create Prg or Grade intake details
    Given I click on grade or program intake details
    And I click on grade or program intake button
    And I click on "<button>" option
    And I add program or grade details with "<GradePeriodType>","<IntakeYear>","<AssignCalender>","<CalculationRule>"
    Then I can see the successfull alert

    Examples: 
      | GradePeriodType | IntakeYear | AssignCalender                | CalculationRule              | button |
      | Yearly          |       2023 | Org Calendar                  | Current Period CGPA and SGPA | Add    |

  @IntakeDetails
  Scenario Outline: GradeIntake or Program Batch Details
    Given I click on grade or program intake details tab
    And I click on "<BatchDetails>" in grade intake details
    Then I create seats for grade or program
      | seattype      | capacity |
      | General seat  |      100 |
      | Reserved Seat |      100 |

    Examples: 
      | BatchDetails |
      | Seat Types   |

  @period
  Scenario Outline: Grade or Program periods creation
    Given I click on grade or program periods more details
    And I click on "<BatchDetails>" in grade intake details
    And I Fill the periods details "<rankbasis>","<year>"
    Then I can see the successfull alert

    Examples: 
      | BatchDetails | rankbasis  | year |
      | Periods      | Mark Based | 2023 |

  @subjects
  Scenario Outline: Grade or Program subjects creation
    Given I click on grade or program periods more details
    And I click on "<BatchDetails>" in grade intake details
    And I Fill the subjects details with "<name>"
    Then I can see the successfull alert

    Examples: 
      | BatchDetails | name     |
     #  | Subjects     | MATH1001 |
      | Courses      | MATH1001 |

  @MapPeriod
  Scenario: Map period for the subject
    Given I select the subject
    And I map the subject with period
    Then I can see the successfull alert
  
  @mangesection
  Scenario Outline: Manage subjects class creation
    Given I click on "<Module>"
    And I click on "<Modulename>" Module
    And I add pbs and "<Home Room>","<Teacher Name>" fill the details
    And I can see the successfull alert
    Then I refresh page

    Examples: 
      | Modulename      | Module             | Home Room              | Teacher Name |
      | Manage Section  | Programs & Courses | Automation Class A		  | Pallavi      |

   @addsubjectparameter
  Scenario Outline: Manage subjects class creation
    Given I click on "<Module>"
    And I click on "<Modulename>" Module
    And I entered the created grade or program name
    And I click "<Buttonname>" button
    And I can see the Grade or program in search results
    And I click on grade or program intake details
    And I click on grade or program intake button
    And I click on grade or program intake details tab
    And I click on "<BatchDetails>" in grade intake details
    And I click on add and select subject
    Then I can see the successfull alert

    Examples: 
      | Modulename | Module             | Buttonname | BatchDetails      |
       # | Grades     | Grades & Subjects  | Search     | Subject Parameters |
      | Programs   | Programs & Courses | Search     | Course Parameters |
      
	  # PBS type of course parametrization come here
	  
  @addclassteacher
  Scenario Outline: Add Class teacher
  	Given I Click on add Section button
  	And I can see the successfull alert
    And I Click on add class teacher button
    And I select "<TeacherName>" name
    And I can see the successfull alert
    Then I refresh page

    Examples: 
      | TeacherName |
      | Pallavi     |

  #@PnCDashboard
  #Scenario Outline: Validate PnC dashboard
    #Given I click on "<Module>"
    #And I click on "<Modulename>" Module
    #And I select "<section>" from dashboard section
    #Then I validate the program is appearing in search result.
#
    #Examples: 
      #| Modulename      | Module             | section               |
      #| P & C Dashboard | Programs & Courses | Program Intake Report |
  #		| P & C Dashboard | Programs & Courses |  Program Batch Report|
  #		
  #@PnCDashboard
  #Scenario Outline: Validate PnC dashboard
    #Given I select arrow from course report dashboard section
    #And I select "<section>" from dashboard section from menu
    #Then I validate the "<report type>" is appearing in the search result.
#
    #Examples: 
      #| section                         | report type                     |
      #| Faculty Workload Report         | Faculty Workload Report         |
      #| Section Roster Report           | Section Roster Report             |
      #| Student Course Enrollment Report | Student Course Enrollment Report |
      #| Course Section Report           | List of Course Sections          |
#
  #@ProgramReport @batchescreated
  #Scenario Outline: Validate Program Report
    #Given I refresh page
    #And I click on "<Module>"
    #And I click on "<Modulename>" Module
    #And I academy location and program for program report
    #And I select "<section>" from dashboard section
    #Then I validate the batches appear
#
    #Examples: 
      #| Modulename     | Module             | section                |
     #| Program Report | Programs & Courses | No. of Intakes Created |
      #| Program Report | Programs & Courses | No. of Batches Created |
     #
#
  #@ProgramReport @Periodscreated
  #Scenario Outline: Validate periods Report
    #Given I select "<section>" from dashboard section from the menu
    #Then I validate the periods appear
#
    #Examples: 
      #| Modulename     | Module             | section            |
      #| Program Report | Programs & Courses | Periods Associated |
#
  #@ProgramReport @secAssosiated
  #Scenario Outline: 
    #Given I select "<section>" from dashboard section from the menu
    #Then I validate the section appear
#
    #Examples: 
      #| Modulename     | Module             | section            |
      #| Program Report | Programs & Courses | Sections Associated |
      #| Program Report | Programs & Courses | Classes Associated |
#
  #@CourseReport
  #Scenario Outline: Validate Course Report
    #Given I click on "<Module>"
    #And I click on "<Modulename>" Module
    #And I academy location and coursename for Course report
    #And I select "<section>" from dashboard section
    #Then I Validate the "<Course Section>" from course report
#
    #Examples: 
      #| Modulename    | Module             | section                 | Course Section           |
      #| Course Report | Programs & Courses | Course Group Associated | Course Groups Associated |
#
  #@CourseReport @Coursecomponentassociated
  #Scenario Outline: Validate Course Component Sections Course Report
    #Given I select arrow from course report dashboard section
    #And I select "<section>" from dashboard section
    #Then I Validate the "<Course Section>" from course component report
#
    #Examples: 
      #| section                     | course Section              |
      #| Course Component Associated | Course Component Associated |
      #| Reading Material Associated | Reading Material Associated |
      #| Course Variants Associated  | Course Variants Associated  |
      #| Topics Created              | Topics Created              |
      #| Course Assessment           | Course Assessment           |
