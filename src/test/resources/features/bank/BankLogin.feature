Feature: Bank login

  @Bank
  Scenario: Customer login successfully
    Given I am a valid customer
    And I go to bank login page
    And I enter gopi6oct as username
    And I enter Naga18554 as password
    When I press login button
    Then I am on home page
    And I click menu button