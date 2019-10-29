#Author: your.email@your.domain.com

  @ReserveTrivago
  Feature: Reserve in a hotel in trivago
  As user
  I want to reserve a hotel and know your score
  to make the cheaper reserve

  @Scenario1
  Scenario Outline: The user a hotel reserve with their respective data
    Given The user searches for a hotel  on page Trivago and selects the one of their choice
    When The user selects city destination "<city destination>" with arrival date "<arrival date>" and departure date "<departure date> and check accommodation type and some services hotel
    Then The user must see reserve and state of the hotel
    Examples:
      | city destination | arrival date | departure date |
      |     Medellin     |   24-12-2019  |   31-12-2019  |