@fearue1
Feature: We Need To Fill The Details With and WithOut For Account Creation

  Background: 
    Given Launch The Browser For Account Creation

@smoke
  Scenario: To Fill The Details By Useing Without Header Details
    #Given Launch The Browser For Account Creation
    When Open The FB Url
    And Enter The First Name WithOut Header
      | Sai | Jo | Jyothi | Prasad | Vamsi |
    And Enter The Last Name WithOut Header
      | Sai     | Kumar  | Pranesh |
      | Jevaan  | Ganesh | Raj     |
      | Prakesh | Suresh | Rajesh  |
    Then Close The FaceBook Browser
@sanity
  Scenario: To Fill The Details By Using With Header Details
    #Given Launch The Browser For Account Creation
    When Open The FB Url
    And Enter The First Name With Header
      | header_1 | Jo    |
      | header_2 | Sai   |
      | header_3 | Kumar |
      | header_4 | Raja  |
    And Enter The Last Name With Header
      | header_1 | header_2 | header_3 |
      | Jevaan   | Ganesh   | Raj      |
      | Prakesh  | Suresh   | Rajesh   |
      | Nithen   | Rahul    | Balaji   |
    Then Close The FaceBook Browser
