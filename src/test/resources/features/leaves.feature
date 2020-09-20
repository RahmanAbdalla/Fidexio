

  Feature: Leave Module

    Background: login
      Given user logs in with correct credentials

    @Smoke
      Scenario: pos Manager
        Given pos Manager click on leave module
        Then pos Manager clicks on a calender day
        And pos Manager fill in the leave request