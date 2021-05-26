Feature: Expedia various types of Booking

  Scenario: As a user i want to search Hotels in Expedia
    Given I am navigated to Expedia
    When I choose Hotel Booking Tab
    And I provide Hotel Booking Information
    Then I should be able to view list of Hotel Search result