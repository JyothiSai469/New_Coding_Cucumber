Feature: 
  We Need To Fill The Details For Account Creation

  Scenario: To Fill The Details
    Given Launch The Browser
    When Open The FackBook Url
    And Enter The First Name
      | Sai | Jo | Jyothi | Prasad | Vamsi |
    And Enter The Last Name
      | Sai     | Kumar  | Pranesh |
      | Jevaan  | Ganesh | Raj     |
      | Prakesh | Suresh | Rajesh  |
    Then Close The Browser
