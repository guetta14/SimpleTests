#Auto generated Octane revision tag
@TID194067REV0.2.0
//@TestToRun
Feature: Add manual tests in context

  Background:
    When there is a backlog with features and user stories
    And there is an application module tree
    And in the backlog there is a feature f1
    And f1 is linked to application module am1
    And f1 has child user stories

  Scenario: Add an acceptance test for a user story

    When the user navigates to the backlog module
    And the user selects the feature f1
    And he looks at the user stories
    And he selects a user story
    And he goes to the tests tab
    And he adds a new Gherkin test
    Then the test is linked to the user story
    And the test is linked to the application module am1 by default
    And the default type of the test is "Acceptance"


  Scenario: Add an acceptance test for a feature

    When the user navigates to the backlog module
    And the user selects the feature f1
    And goes to the tests tab
    And he adds a new manual test
    Then the manual test is linked to the feature
    And the manual test is linked to the application module am1 by default
    And the default test type is "Acceptance"


#Scenario: Add an E2E test for an application module
#
#When the user navigates to the quality module
#And he selects am1
#And he navigates to the tests tab
#And adds a new manual test
#Then the test is linked to the application module by default
#And the default type of the test should be "End to End"
