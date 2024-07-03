@Pre-admission 
Feature: Pre-admission scenarios

  @ManageTargetByStaff @AddStaffDetails
  Scenario Outline: Add staff details
    Given I click on "Pre-Admissions"
    And I click on "<Modulename>" Module
    Given I select target by dropdown "<option>"
    And I select intake year
    And I see the "<header name>" targets in header
    And I add staff details "<name>"
    Then I can see the successfull alert

    Examples: 
      | option        | header name  | name | Modulename              |
     # | Presentations | Presentation | alka | Manage Targets by Staff |
      | Presentations | Presentation | 1000 | Manage Targets by Staff |

  @ManageTargetByStaff @DeleteStaffDetails
  Scenario: Delete staff details
    Given I click on staff detail number
    Then I can delete the staff details

  @ManageTargetByStaff @ManageTargetByStaffViaAdmission
  Scenario Outline: Validate the Manage target by staff using admission
    Given I select target by dropdown "<option>"
    And I select intake year
    Then I see the "<header name>" targets in header

    Examples: 
      | Modulename              | option     | year | header name  |
      | Manage Targets by Staff | Admissions | 2023 | Registration |

  @ManageTargetByStaff @ManageTargetByStaffViaAdmissionoffer
  Scenario Outline: Validate the Manage target by staff using admissions offer
    Given I select target by dropdown "<option>"
    And I select intake year
    Then I see the "<header name>" targets in header

    Examples: 
      | option           | year | header name     |
      | Admissions Offer | 2023 | Admission Offer |

  @ManageTargetByStaff @ManageTargetByStaffViaApplication
  Scenario Outline: Validate the Manage target by staff using application
    Given I select target by dropdown "<option>"
    And I select intake year
    Then I see the "<header name>" targets in header

    Examples: 
      | option       | year | header name |
      | Applications | 2023 | Application |

  @ManageTargetByStaff @ManageTargetByStaffViaAppointments
  Scenario Outline: Validate the Manage target by staff using Appointments
    Given I select target by dropdown "<option>"
    And I select intake year
    Then I see the "<header name>" targets in header

    Examples: 
      | option       | year | header name |
      | Appointments | 2023 | Appointment |

  @ManageTargetByStaff @ManageTargetByStaffViaEnquiry
  Scenario Outline: Validate the Manage target by staff using Enquiry
    Given I select target by dropdown "<option>"
    And I select intake year
    Then I see the "<header name>" targets in header

    Examples: 
      | option  | year | header name |
      | Enquiry | 2023 | Enquiry     |

  @ManageTargetByStaff @ManageTargetByStaffViaPresentations
  Scenario Outline: Validate the Manage target by staff using Presentations
    Given I select target by dropdown "<option>"
    And I select intake year
    Then I see the "<header name>" targets in header

    Examples: 
      | option        | year | header name  |
      | Presentations | 2023 | Presentation |

  @ManageTargetByStaff @ManageTargetByStaffViaPrograms
  Scenario Outline: Validate the Manage target by staff using Programs
    Given I select target by dropdown "<option>"
    And I select intake year
    Then I see the "<header name>" targets in header
    And I refresh page

    Examples: 
      | option   | year | header name |
      | Programs | 2023 | Program     |

  @Managecampaign @CreateCampaign
  Scenario Outline: Create Manage campaign
    Given I click on "Pre-Admissions"
    And I click on "<Modulename>" Module
    And I click on "<Action>" button
    And I enter the mandatory fields and submit
    Then campaign is created

    Examples: 
      | Modulename      | Action |
      | Manage Campaign | Add    |

  @Managecampaign @EditCampaign
  Scenario Outline: Edit Manage campaign
    Given I select the "<rownumber>" row of the table
    And I click on "<Action>" button
    And I edited the Campaign
    Then Data should get Edited

    Examples: 
      | Modulename      | Action | rownumber |
      | Manage Campaign | Edit   |         1 |

  @Campaignschoolmaster @createschoolmaster
  Scenario Outline: Create Manage campaign
    Given I click on "Pre-Admissions"
    And I click on "<Modulename>" Module
    And I click on "<Action>" button
    And I fill mandatory fields for school master
    Then campaign is created

    Examples: 
      | Modulename             | Action |
      | Campaign School Master | Add    |

  @Campaignschoolmaster @EditCampaignSchoolMaster
  Scenario Outline: Create Manage campaign
    Given I select created school master
    And I click on "<Action>" button
    And I edited the Campaign school master

    Examples: 
      | Modulename      | Action | rownumber |
      | Manage Campaign | Edit   |         1 |

  @Campaignschoolmaster @SetPriority
  Scenario Outline: Set school priority
    Given I choose map school priority
    And Select "<Campus name>" and "<year>"
    And change school priority
    Then I can see the successfull alert

    Examples: 
      | Campus name | year |
      #| Bedfordview | 2023 |
      |DXTXCXllXgXXXfXNXrsXng-Dehradun|2023|
      
  @Campaignschoolmaster @SetInternationalPriority
  Scenario: Set school international priority
    Given change school priority international
    Then I can see the successfull alert

  #@Campaignschoolmaster @SetSchoolDefualtPriority
  #Scenario Outline: Set school defualt priority
    #Given I choose school to set priority
    #And click on set defualt priority button
    #And i select "<default priority name>"
    #Then I can see the successfull alert and refresh the page
#
    #Examples: 
      #| default priority name |rownumber|
      #| P1                    |2        |

  @Managelead @VerifySearch
  Scenario Outline: Validate the lead search
    Given I click on "Pre-Admissions"
    And I click on "<Modulename>" Module
    And I click "<Buttonname>" button
    And I can see total records
    Then I refresh page

    Examples: 
      | Modulename       | Buttonname |
     # | Manage Leads     | Search     |
      | Manage Enquiries | Search     |

  @Managelead @AddLead
  Scenario Outline: Add the lead
    Given I click on "Pre-Admissions"
    And I click on "<Modulename>" Module
    And I click on "<Action>" button
    And I fill the lead details
    And I add student details
    Then lead is created successfully

    Examples: 
      | Modulename       | Action |
      #| Manage Leads     | Add    |
      | Manage Enquiries | Add    |

  @Managelead @Editlead
  Scenario Outline: Edit the lead  
    And I search enquiry
    And I click "<Buttonname>" button  
    And I select the "<rownumber>" row of the table
    And I click on "<Action>" button
    And I edited the lead details
    Then lead is successfully edited

    Examples: 
      | Modulename       | Action | rownumber | Buttonname |   username | password | 
     # | Manage Leads     | Edit   |         1 | Search     |   sysadmin | password |
      | Manage Enquiries | Edit   |         1 | Search     |   sysadmin | password |

  @Managelead @EditStudentDetails
  Scenario Outline: Edit student details
    Given I click on "<LeadTabName>" tab
    And I edit the student details
    Then I can see the successfull alert

    Examples: 
      | LeadTabName     |
      | Student Details |

  @Managelead @AddAdmissiondetails
  Scenario Outline: Add admission details
    Given I click on "<LeadTabName>" tab
    Then I Add the Admission details

    Examples: 
      | LeadTabName                   |
      | Admission Requirement Details |

  @Managelead @EditAdmissiondetails
  Scenario Outline: Edit admission details
    Given I click on "<LeadTabName>" tab
    Then I edit the Admission details

    Examples: 
      | LeadTabName                   |
      | Admission Requirement Details |

  @Managelead @AddFollowup
  Scenario Outline: Add Follow up details
    Given I click on "<LeadTabName>" tab
    And I add the followup details
    Then I can see the successfull alert

    Examples: 
      | LeadTabName       |
      | Follow-up Details |

  @Managelead @CloseFOllowup
  Scenario Outline: Close the followup details
    Given I click on "<LeadTabName>" tab
    And I close the followup details
    Then I can see the successfull alert

    Examples: 
      | LeadTabName       |
      | Follow-up Details |

  @Managelead @FollowupDate
  Scenario Outline: Add followup date
    Given I click on "<LeadTabName>" tab
    And I add followup date
    Then I can see the successfull alert

    Examples: 
      | LeadTabName       |
      | Follow-up Details |

  @Managelead @AddAppointment
  Scenario Outline: Add the appointment
    Given I click on "<LeadTabName>" tab
    And I Book Appointment
    Then I can see the successfull alert

    Examples: 
      | LeadTabName |
      | Appointment |

  @Managelead @EditAppointment
  Scenario: Edit the appointment
    Given I Edit Appointment
    Then I can see the successfull alert

  @Managelead @DeleteAppointment
  Scenario: Delete the appointment
    Given I Delete Appointment
    Then I can see the successfull alert

  @Managelead @CommunicationHistoryEmail
  Scenario Outline: Communication history by Email
    Given I click on "<LeadTabName>" tab
    Then I verify communication history by "<name>"

    Examples: 
      | LeadTabName           | name  |
      | Communication History | email |

  @Managelead @CommunicationHistorySMS
  Scenario Outline: Communication history by SMS
    Given I click on "<LeadTabName>" tab
    Then I verify communication history by "<name>"

    Examples: 
      | LeadTabName           | name |
      | Communication History | sms  |

  @Managelead @ClosureDetailsCloseAdmission
  Scenario Outline: Close the admission
    Given I click on "<LeadTabName>" tab
    And I close the admission "<reason option>"
    Then I can see the successfull alert

    Examples: 
      | LeadTabName     | reason option  |
      | Closure Details | Not Interested |

  @Managelead @ClosureDetailsOpenAdmission
  Scenario Outline: Open the admission
    Given I click on "<LeadTabName>" tab
    And I open the admission "<reason option>"
    Then I can see the successfull alert and refresh the page

    Examples: 
      | LeadTabName     | reason option           |
      | Closure Details | Interested in Admission |   
      
  @ManageLead @SendSMSToMyself
  Scenario Outline: Validate the Appointment dashboard and send sms to myself
    Given I click on "Pre-Admissions"
    And I click on "<Modulename>" Module
    And I search enquiry
    And I click "<Buttonname>" button  
    And I select the lead and send the SMS to "<To>"
    Then I can see the successfull alert

    Examples: 
      | Modulename       | Buttonname | To     |
     # | Manage Leads     | Search     | Myself |
      | Manage Enquiries | Search     | Myself |

  @ManageLead @sendSmsToParent
  Scenario Outline: Validate the Appointment dashboard and send sms to Parent
    Given I select the lead and send the SMS to "<To>"
    Then I can see the successfull alert

    Examples: 
      | Modulename       | Buttonname | To     |
     # | Manage Leads     | Search     | Parent |
      | Manage Enquiries | Search     | Parent |

  @ManageLead @SendSMSToPArentAndMyself
  Scenario Outline: Validate the Appointment dashboard and send sms to myself and parent
    Given I select the lead and send the SMS to "<To>"
    Then I can see the successfull alert

    Examples: 
      | Modulename       | Buttonname | To   |
    #  | Manage Leads     | Search     | Both |
      | Manage Enquiries | Search     | Both |

  @ManageLead @DuplicateName
  Scenario Outline: Verify the duplicate names of leads
    Given I select the lead data
    And I click on more actions
    And I select the "<option>" actions
    Then I can see "<option>" in header page

    Examples: 
      | option               |
      | Check Duplicate Name |

  @ManageLead @DuplicateEmail
  Scenario Outline: Verify the duplicate Email of leads
    Given I click on more actions
    And I select the "<option>" actions
    Then I can see "<option>" in header page

    Examples: 
      | option                |
      | Check Duplicate Email |

  @ManageLead @DuplicateMobile
  Scenario Outline: Verify the duplicate Mobile of leads
    Given I click on more actions
    And I select the "<option>" actions
    Then I can see "<option>" in header page

    Examples: 
      | option                 |
      | Check Duplicate Mobile |

  @ManageLead @DuplicatePhone
  Scenario Outline: Verify the duplicate Phone of leas
    Given I click on more actions
    And I select the "<option>" actions
    Then I can see "<option>" in header page

    Examples: 
      | option                |
      | Check Duplicate Phone |

  @ManageLead @FollowupDetails
  Scenario: Verify the followup details lead
    Given I click on followup details
    Then I can see followup lead details

  @ManageLead @Sendreminder
  Scenario: Verify the send reminder to lead
    Given I click on Send reminder
    Then I can see the successfull alert

  #@ManageLead @ViewLeadDeatils
  #Scenario Outline: View Lead details
    #Given I select the lead data
    #And I click on "<Action>" button
    #Then I can see View lead details header
#
    #Examples: 
      #| Action |
      #| View   |

  @ManageLead @ColumnDetailsAdmissionScreen
  Scenario Outline: Validate column details admission screen
    Given I click on "Pre-Admissions"
    And I click on "<Modulename>" Module
    And I search enquiry
    And I click "<Buttonname>" button  
    And I click on column button and select status from "<Screen>"
    Then status got updated

    Examples: 
      | Screen      | Modulename       | Buttonname |
      #| Admission   | Manage Leads     | Search     |
      #| Followup    | Manage Leads     | Search     |
      #| Appointment | Manage Leads     | Search     |
      | Admission   | Manage Enquiries | Search     |
      | Followup    | Manage Enquiries | Search     |
      | Appointment | Manage Enquiries | Search     |

  @ManageLead @FollowupDetailsReset
  Scenario Outline: Validate reset options for leads
    Given I click on "Pre-Admissions"
    And I click on "<Modulename>" Module
    And I search enquiry
    And I click "<Buttonname>" button
    And I click on column button and select status from the "<Screen>"
    And click on reset button
    Then status got updated for reset

    Examples: 
      | Screen   | Modulename   | Buttonname |
     # | Followup | Manage Leads | Search     |
      | Followup | Manage Enquiries | Search     |

  @ManageLead @DeleteLead
  Scenario Outline: View Lead details
    Given I click on "<Action>" button
    Then lead is deleted
    And I refresh page

    Examples: 
      | Action |
      | Delete |

  @ManageTarget @ValidateByGrade
  Scenario Outline: Validate the Manage target search via grade 
    Given I click on "Pre-Admissions"
    And I click on "<Modulename>" Module
    And I choose "<View by>" option option for search manage target
    Then I can see the "<View by>" list

    Examples: 
      | Modulename                  | Buttonname | View by    |
     # | Manage Targets | Search     | Grade   |
      | Manage Targets Consolidated | Search     | Grade Wise |

  @ManageTarget @ValidateByBrand
  Scenario Outline: Validate the Manage target search via brand
    Given I choose "<View by>" option option for search manage target
    Then I can see the "<View by>" list

    Examples: 
      | Modulename                  | Buttonname | View by      |
     #| Manage Targets | Search     | Brand   |
      | Manage Targets Consolidated | Search     | Academy Wise |

  @ManageTarget @ValidateByCampus
  Scenario Outline: Validate the Manage target search via campus
    Given I choose "<View by>" option option for search manage target
    Then I can see the "<View by>" list

    Examples: 
      | Modulename                  | Buttonname | View by               |
    #  | Manage Targets | Search     | Campus  |
      | Manage Targets Consolidated | Search     | Academy Location Wise |

  @ManageTarget @ValidateBySchool
  Scenario Outline: Validate the Manage target search via school
    Given I choose "<View by>" option option for search manage target
    Then I can see the "<View by>" list
    And I refresh page

    Examples: 
      | Modulename                  | Buttonname | View by            |
     # | Manage Targets              | Search     | School             |
      | Manage Targets Consolidated | Search     | Program Group Wise |

  @ManageTarget @ValidateByGrade @EnterLeadTarget
  Scenario Outline: Validate the Manage target search via grade and enter lead target
    Given I click on "Pre-Admissions"
    And I click on "<Modulename>" Module
    And I choose "<View by>" option option for search manage target
    And I can see the "<View by>" list
    Then I can enter the "<value>" in "<Option name>"

    Examples: 
      | Modulename                  | Buttonname | View by    | Option name    | value |
     #  | Manage Targets | Search     | Grade   | Lead Target |   100 |
      | Manage Targets Consolidated | Search     | Grade Wise | Enquiry Target |   100 |

  @ManageTarget @ValidateByGrade @EnterApplicationTarget
  Scenario Outline: Validate the Manage target search via grade and enter application target
    Given I can see the total records in the list   
    Then I can enter the "<value>" in "<Option name>"

    Examples: 
      | Modulename                  | View by    | Option name        | value |
     #  | Manage Targets | Grade   | Application Target |  1000 |
      | Manage Targets Consolidated | Grade Wise | Application Target |  1000 |

  @ManageTarget @ValidateByGrade @EnterPreviousYearEntrollment
  Scenario Outline: Validate the Manage target search via grade and enter enrollment year
    Given I can see the total records in the list
    Then I can enter the "<value>" in "<Option name>"

    Examples: Revised Budget
      | Modulename                  | View by    | Option name     | value |
      #  | Manage Targets | Grade   | Enrollment Year |  2022 |
      | Manage Targets Consolidated | Grade Wise | Enrollment Year |  2022 |

  @ManageTarget @ValidateByGrade @EnterBudget
  Scenario Outline: Validate the Manage target search via grade and enter Budget
    Given I can see the total records in the list
    Then I can enter the "<value>" in "<Option name>"

    Examples: 
      | Modulename                  | View by    | Option name | value |
     # | Manage Targets | Grade   | Budget      |  1500 |
      | Manage Targets Consolidated | Grade Wise | Budget      |  1500 |

  @ManageTarget @ValidateByGrade @EnterRevisedBudget
  Scenario Outline: Validate the Manage target search via grade and enter Revised budget
    Given I can see the total records in the list
    Then I can enter the "<value>" in "<Option name>"

    Examples: 
      | Modulename                  | View by    | Option name    | value |
      #| Manage Targets | Grade   | Revised Budget |  1800 |
      | Manage Targets Consolidated | Grade Wise | Revised Budget |  1800 |

  @ManageTarget @ValidateByGrade @EnterEnrollmentTarget
  Scenario Outline: Validate the Manage target search via grade and enter Enrollment target
    Given I can see the total records in the list    
    Then I can enter the "<value>" in "<Option name>"

    Examples: 
      | Modulename                  | View by    | Option name       | value |
      # | Manage Targets | Grade   | Enrollment Target |  1000 |
      | Manage Targets Consolidated | Grade Wise | Enrollment Target |  1000 |

  @ManageTarget @ValidateByGrade @EnterBuildingCapacity
  Scenario Outline: Validate the Manage target search via grade and enter Building Capacity
    Given I can see the total records in the list   
    Then I can enter the "<value>" in "<Option name>"

    Examples: 
      | Modulename                  | View by    | Option name     | value |
     # | Manage Targets | Grade   | BuidingCapacity |   100 |
      | Manage Targets Consolidated | Grade Wise | BuidingCapacity |   100 |

  @ManageTarget @ValidateByGrade @EnterBuildingCapacitySpecialist
  Scenario Outline: Validate the Manage target search via grade and enter Building Capacity Specialist
    Given I can see the total records in the list  
    Then I can enter the "<value>" in "<Option name>"

    Examples: 
      | Modulename                  | View by    | Option name                  | value |
     #  | Manage Targets | Grade   | Building Capacity Specialist |  1000 |
      | Manage Targets Consolidated | Grade Wise | Building Capacity Specialist |  1000 |

  
  @CampaignDashboard
  Scenario Outline: Validate the past campaign dashboard
    Given I click on "Pre-Admissions"
    And I click on "<Modulename>" Module
    And I click on past campaign
    And I select intake year for pastcampaign
    And I click "<Buttonname>" button
    Then I validate past campaign header

    Examples: 
      | Modulename          | Buttonname |
      | Campaigns Dashboard | Search     |

  @CampaignDashboard @ValidateCampaignDashboardDetailsPage
  Scenario: Validate the past campaign dashboard
    Given I click on campaign code
    Then I can view "Campaigns Details" page

  @CampaignDashboard @Validatetotalenquirypage
  Scenario Outline: Validate the past campaign dashboard total enquiry
    Given I click on "Total Enquiry" in campaign dashboard page
    Then I can validate header "<name>" past campaign

    Examples: 
      | name          |
      | Total Enquiry |

  @CampaignDashboard @Validategeneratedapplication
  Scenario Outline: Validate the past campaign dashboard genereated applications  Past Campaigns - Student Enroled
    Given I click on "Generated Applications" in campaign dashboard page
    Then I can validate header "<name>" past campaign

    Examples: 
      | name                   |
      | Generated Applications |

  @CampaignDashboard @ValidateStudentEnrolled
  Scenario Outline: Validate the past campaign dashboard Student Enroled
    Given I click on "Student Enroled" in campaign dashboard page

    Examples: 
      | name            |
      | Student Enroled |

  @CampaignDashboard @Validategradescovered
  Scenario Outline: Validate the past campaign dashboard Past Campaigns - Grades Covered
    Given I click on "Grades Covered" in campaign dashboard page
    Then I can validate header "<name>" past campaign

    Examples: 
      | name           |
     # | Grades Covered |
      | Programs Covered|

  @CampaignDashboard @Validatebrandcovered
  Scenario Outline: Validate the past campaign dashboard Past Campaigns - Brands Covered
    Given I click on "Brands Covered" in campaign dashboard page
    Then I can validate header "<name>" past campaign

    Examples: 
      | name           |
     # | Brands Covered |
      | Academies Covered|

  @CampaignDashboard @Validatecampuscovered
  Scenario Outline: Validate the past campaign dashboard Past Campaigns - Campuses Covered
    Given I click on "Campuses Covered" in campaign dashboard page
    Then I can validate header "<name>" past campaign
    And I refresh page

    Examples: 
      | name             |
      #| Campuses Covered |
      |Locations Covered |

  @LeadDashboard @follopreportadmissiontype
  Scenario Outline: Validate the Lead dashboard followup schdeule report Admission
    Given I click on "Pre-Admissions"
    And I click on "<Modulename>" Module
    And I click on "<Report type>" in lead dashboardpage
    Then I validate followup report
      | typename    |
      | Admission   |
      | Corporate   |
      | Counselling |

    Examples: 
      | Modulename          | Report type         |
      #| Leads Dashboard     | Follow-up Scheduled |
      | Enquiries Dashboard | Follow-up Scheduled |

  @LeadDashboard @PendingLeads
  Scenario Outline: Validate the Lead dashboard followup schdeule report Admission  Pending Leads
    Given I click on "<Report type>" in lead dashboardpage
    And I click on total number of pending leads
    Then I validate the pending leads page header

    Examples: 
      | Report type       |
     # | Pending Leads     |
      | Pending Enquiries |

  @LeadDashboard @CountofLeads
  Scenario Outline: Validate the Lead dashboard followup schdeule report Count of Leads
    Given I click on "<Report type>" in lead dashboardpage
    Then I validate count of leads header

    Examples: 
      | Report type        |
    #  | Count of Leads     |
      | Count of Enquiries |

  @LeadDashboard @LeadClosureRate
  Scenario Outline: Validate the Lead dashboard followup schdeule report Count of Leads
    Given I click on "<Report type>" in lead dashboardpage
    Then I validate count of closure rate header

    Examples: 
      | Report type          |
     # | Lead Closure Rate    |
      | Enquiry Closure Rate |

  @LeadDashboard @LeadSummary
  Scenario Outline: Validate the Lead dashboard followup schdeule report Count of Leads Lead Summary
    Given I click on "<Report type>" in lead dashboardpage
    Then I validate count of Lead summary header

    Examples: 
      | Report type     |
    #  | Lead Summary    |
      | Enquiry Summary |

  @FollowupDashboard
  Scenario Outline: Validate the followup dashboard
    Given I click on "Pre-Admissions"
    And I click on "<Modulename>" Module
    And I select from and to dates
    Then I validate the followup dahsboard header

    Examples: 
      | Modulename          |
      | Follow-up Dashboard |

  @AppointmentDashbaord
  Scenario Outline: Validate the Appointment dashboard
    Given I click on "Pre-Admissions"
    And I click on "<Modulename>" Module
    And I select from and to dates
    Then I validate the Appointment dahsboard header

    Examples: 
      | Modulename            |
      | Appointment Dashboard |


