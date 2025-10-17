Feature: 
  We Need To Fill The Details For Account Creation With Header Details

  Scenario: To Fill The Details With Header Details
    Given Launch The Browser For With Header Details
    When Open The Face Book Create Account Url
    And Enter The First Name For Create Account
      | header_1 | Jo    |
      | header_2 | Sai   |
      | header_3 | Kumar |
      | header_4 | Raja  |
    And Enter The Last Name for Create Account
      | header_1 | header_2 | header_3 |
      | Jevaan   | Ganesh   | Raj      |
      | Prakesh  | Suresh   | Rajesh   |
      | Nithen   | Rahul    | Balaji   |
    Then Close The Create Account Browser
