
  Feature: Employees Module


    @one
    Scenario: User should be able to go to explore Employee module

      Given User should be able to click on the Employee module
      Then User should see the list of Employee
      And User should be able to click on any employee profile and see all the info
