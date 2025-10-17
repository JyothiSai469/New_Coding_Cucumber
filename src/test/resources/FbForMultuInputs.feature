Feature: FB Login Page For Multi Inputs

  Scenario Outline: Both Posive And Negitive Ids Validation
    Given Open The Chrom Browser
    And Get The Url
    And Send The Multi "<MailId>" Inputs For MainID
    And Send The Multi "<Password>" Inputs For Password
    And Click The Login The btn
    When Close The Tab

    Examples: 
      | MailId  | Password   |
      | Sai     | Sai123     |
      | Jyothi  | Sai123     |
      | Smart   | Sakills123 |
      | Chennai | SKHT123    |
