@Team
Feature: TypeChat
  Background: User Already on Group Chat Menu

  @PositiveCase
  Scenario: Chat is appear scenerio
    Given User Click Group Chat
    When  Type Chat
    Then  Click Send & Chat is appear

  @PostiveCase1
  Scenario: Clear chat before submit scenario
    Given User Click Group Chat
    When  Type Chat
    Then  Clear chat before submit


  @PostiveCase2
  Scenario: Delete chat after submit scenario
    Given User Click Group Chat
    When  Click Delete Chat Option
    Then  Click Delete chat After submit

#  @PostiveCase3
#  Scenario: Move Card
#    Given User Click Board
#    When  Click Card & Move Card
#    Then  Assertion

  @PostiveCase6
  Scenario: Create Board
    Given User Click Board
    When  User Click Add List & Input List Name
    Then  Click Create List

  @PostiveCase7
  Scenario: Add Card
    Given User Click Board
    When  User Click Add Card
    And   Input Card Name
    Then  Click Add Card

