Feature: Calculator

  Scenario: add two numbers
    Given Two input values, 1 and 2
    When I add the two values
    Then I expect the result 3

  Scenario: multiply two numbers
    Given Two input values, 6 and 2
    When I multiply the two values
    Then I expect the result 12

  Scenario: divide two numbers
    Given Two input values, 6 and 2
    When I divide the two values
    Then I expect the result 3

  Scenario: raise a number to a power
    Given Two input values, 6 and 2
    When I raise the first value to the second value
    Then I expect the result 36

  Scenario Outline: calculate supported positive-value operations
    Given Two input values, <first> and <second>
    When I perform the <operation> operation
    Then I expect the result <result>

    Examples:
      | first | second | operation | result |
      | 3     | 4      | multiply  | 12     |
      | 8     | 2      | divide    | 4      |
      | 3     | 3      | power     | 27     |
