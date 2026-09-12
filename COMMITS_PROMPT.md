# Engineering Commits & Gemini 3.8 Flash Interactions

This document records the engineering, coding, testing, architecture, and technical documentation commits of the BDD & Cucumber Software Engineering Workshop project. Routine manual actions (such as initial repository boilerplate or GitHub PR merge commits) are excluded, focusing strictly on commits with technical implementation and engineering contributions.

---

## 1. Commit `cb78460` — Configure Maven BDD Project

- **Commit Hash**: `cb784603fdf651d75051072894c37323c0d410da`
- **Author**: `arshiaizd <izdyaria@gmail.com>`
- **Branch**: `feature/calculator-core`
- **Affected Files**: [`pom.xml`](file:///Users/amin/Desktop/Software_Workshop_4/pom.xml), [`.gitignore`](file:///Users/amin/Desktop/Software_Workshop_4/.gitignore)

### Prompt to Gemini 3.8 Flash
> I need to set up a new Maven project for our Software Engineering BDD lab assignment (groupId: `ir.ac.sharif.selab`, artifactId: `bdd-calculator`).
> 
> Requirements:
> 1. Use Java 8 compiler source and target (`1.8`).
> 2. Add dependencies for Behavior-Driven Development using Cucumber with JUnit 4: `cucumber-java` and `cucumber-junit` (version `1.2.5`), and `junit:junit:4.12` in test scope.
> 3. Provide a standard `.gitignore` file for IntelliJ IDEA and Maven build artifacts.
> 
> Please generate the initial `pom.xml` and `.gitignore`.

### LLM Result Summary
* **Generated Configuration**:
  - Provided `pom.xml` with coordinates `ir.ac.sharif.selab:bdd-calculator:1.0-SNAPSHOT`.
  - Added properties for `<maven.compiler.source>1.8</maven.compiler.source>`, `<maven.compiler.target>1.8</maven.compiler.target>`, and `project.build.sourceEncoding` as UTF-8.
  - Configured dependencies:
    ```xml
    <dependency>
        <groupId>info.cukes</groupId>
        <artifactId>cucumber-junit</artifactId>
        <version>1.2.5</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.12</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>info.cukes</groupId>
        <artifactId>cucumber-java</artifactId>
        <version>1.2.5</version>
        <scope>test</scope>
    </dependency>
    ```
  - Created `.gitignore` ignoring `.idea/`, `*.iml`, and `target/`.

---

## 2. Commit `6e87eb1` — Add Calculator Core Skeleton

- **Commit Hash**: `6e87eb1ab7a3ffbb53c5c34e3441cce02405d240`
- **Author**: `arshiaizd <izdyaria@gmail.com>`
- **Branch**: `feature/calculator-core`
- **Affected Files**: [`src/main/java/calculator/Calculator.java`](file:///Users/amin/Desktop/Software_Workshop_4/src/main/java/calculator/Calculator.java)

### Prompt to Gemini 3.8 Flash
> Create the core `Calculator` class skeleton in Java under package `calculator`. It should be located at `src/main/java/calculator/Calculator.java` so we can incrementally implement arithmetic operations in upcoming commits.

### LLM Result Summary
* **Generated Class**:
  ```java
  package calculator;

  public class Calculator {
  }
  ```
* Set up proper directory tree under Maven's standard `src/main/java`.

---

## 3. Commit `d18073b` — Add Multiplication Operation

- **Commit Hash**: `d18073b176b6cd8a6f4ced01003a92669a3f5b88`
- **Author**: `arshiaizd <izdyaria@gmail.com>`
- **Branch**: `feature/calculator-core`
- **Affected Files**: [`src/main/java/calculator/Calculator.java`](file:///Users/amin/Desktop/Software_Workshop_4/src/main/java/calculator/Calculator.java)

### Prompt to Gemini 3.8 Flash
> In `src/main/java/calculator/Calculator.java`, implement an integer multiplication method `multiply(int first, int second)` that returns the product of two integers.

### LLM Result Summary
* **Code Implemented**:
  ```java
  public int multiply(int first, int second) {
      return first * second;
  }
  ```
* Directly returns the product, supporting positive, zero, and negative integer arguments.

---

## 4. Commit `02fb176` — Add Division Operation

- **Commit Hash**: `02fb176f514e8dbab026b047ff15f7bd4cf83e6c`
- **Author**: `arshiaizd <izdyaria@gmail.com>`
- **Branch**: `feature/calculator-core`
- **Affected Files**: [`src/main/java/calculator/Calculator.java`](file:///Users/amin/Desktop/Software_Workshop_4/src/main/java/calculator/Calculator.java)

### Prompt to Gemini 3.8 Flash
> Add an integer division method `divide(int first, int second)` to `Calculator.java`. It should perform integer truncation division and retain Java's default behavior of throwing `ArithmeticException` when dividing by zero.

### LLM Result Summary
* **Code Implemented**:
  ```java
  public int divide(int first, int second) {
      return first / second;
  }
  ```
* Standard integer division without suppressing runtime exceptions, ensuring zero-divisor errors are propagated cleanly.

---

## 5. Commit `7b1970d` — Add Repeated Multiplication Power Operation

- **Commit Hash**: `7b1970d02670b3e14231d50c621deccd32613482`
- **Author**: `arshiaizd <izdyaria@gmail.com>`
- **Branch**: `feature/calculator-core`
- **Affected Files**: [`src/main/java/calculator/Calculator.java`](file:///Users/amin/Desktop/Software_Workshop_4/src/main/java/calculator/Calculator.java)

### Prompt to Gemini 3.8 Flash
> Implement a `power(int base, int exponent)` method in `Calculator.java`.
> 
> Lab Constraint: Do NOT use `Math.pow()`. Implement exponentiation strictly using an iterative repeated multiplication loop starting from `1`, assuming non-negative integer exponents.

### LLM Result Summary
* **Code Implemented**:
  ```java
  public int power(int base, int exponent) {
      int result = 1;
      for (int i = 0; i < exponent; i++) {
          result *= base;
      }
      return result;
  }
  ```
* Meets the iterative multiplication requirement; correctly handles exponent `0` (returns `1`), exponent `1` (returns `base`), and higher powers without floating-point conversion issues.

---

## 6. Commit `db8a474` — Add Cucumber JUnit Runner

- **Commit Hash**: `db8a474780f0131f544766444cec503c4b6ee07a`
- **Author**: `Mohammad Amin Koohi <MohammadAminKoohi>`
- **Branch**: `feature/bdd-scenarios`
- **Affected Files**: [`src/test/java/RunnerTest.java`](file:///Users/amin/Desktop/Software_Workshop_4/src/test/java/RunnerTest.java), `src/test/resources/features/.gitkeep`

### Prompt to Gemini 3.8 Flash
> I need to create the Cucumber test runner for our JUnit 4 test suite.
> 
> 1. Where should the runner class be placed?
> 2. What annotations are required to link JUnit with Cucumber 1.2.5?
> 3. How do we configure it to pick up all `.feature` files located under `src/test/resources/features`?
> 
> Please write the `RunnerTest.java` class.

### LLM Result Summary
* **Code Implemented**:
  ```java
  import cucumber.api.CucumberOptions;
  import cucumber.api.junit.Cucumber;
  import org.junit.runner.RunWith;

  @RunWith(Cucumber.class)
  @CucumberOptions(features = "src/test/resources/features")
  public class RunnerTest {
  }
  ```
* Used `@RunWith(Cucumber.class)` to delegate execution to the Cucumber runner engine.
* Configured `@CucumberOptions` targeting the feature file path. Created `.gitkeep` to preserve the feature directory structure in Git.

---

## 7. Commit `22a559e` — Add Reference Addition BDD Scenario

- **Commit Hash**: `22a559ef7e86163849dc051c7864baae52e5069d`
- **Author**: `Mohammad Amin Koohi <MohammadAminKoohi>`
- **Branch**: `feature/bdd-scenarios`
- **Affected Files**: [`src/test/resources/features/calculator.feature`](file:///Users/amin/Desktop/Software_Workshop_4/src/test/resources/features/calculator.feature), [`src/test/java/calculator/CalculatorStepDefinitions.java`](file:///Users/amin/Desktop/Software_Workshop_4/src/test/java/calculator/CalculatorStepDefinitions.java)

### Prompt to Gemini 3.8 Flash
> Let's create our first BDD scenario in Gherkin and the corresponding Step Definitions:
> 1. Create `calculator.feature` with a feature title `Calculator` and the reference addition scenario from the lab sheet:
>    - Given Two input values, 1 and 2
>    - When I add the two values
>    - Then I expect the result 3
> 2. Create `CalculatorStepDefinitions.java` in package `calculator` with the `@Given` step matching the two integer inputs using regex capture groups.

### LLM Result Summary
* **Feature File (`calculator.feature`)**:
  ```gherkin
  Feature: Calculator

    Scenario: add two numbers
      Given Two input values, 1 and 2
      When I add the two values
      Then I expect the result 3
  ```
* **Step Definitions (`CalculatorStepDefinitions.java`)**:
  ```java
  package calculator;

  import cucumber.api.java.en.Given;

  public class CalculatorStepDefinitions {
      private int firstInput;
      private int secondInput;

      @Given("^Two input values, (\\d+) and (\\d+)$")
      public void twoInputValues(int firstInput, int secondInput) {
          this.firstInput = firstInput;
          this.secondInput = secondInput;
      }
  }
  ```

---

## 8. Commit `709f7cf` — Add Multiplication and Division BDD Steps

- **Commit Hash**: `709f7cf8cd42ecec6b69d24cada4f56377518b53`
- **Author**: `Mohammad Amin Koohi <MohammadAminKoohi>`
- **Branch**: `feature/bdd-scenarios`
- **Affected Files**: [`src/test/resources/features/calculator.feature`](file:///Users/amin/Desktop/Software_Workshop_4/src/test/resources/features/calculator.feature), [`src/test/java/calculator/CalculatorStepDefinitions.java`](file:///Users/amin/Desktop/Software_Workshop_4/src/test/java/calculator/CalculatorStepDefinitions.java)

### Prompt to Gemini 3.8 Flash
> Add the required multiplication and division BDD scenarios to `calculator.feature` and their step implementations in `CalculatorStepDefinitions.java`:
> - Multiplication scenario: Inputs 6 and 2, when multiplied, result is 12.
> - Division scenario: Inputs 6 and 2, when divided, result is 3.
> 
> The `@When` steps should call `Calculator.multiply` and `Calculator.divide` and store the integer outcome in a `result` field.

### LLM Result Summary
* **Feature Additions**:
  ```gherkin
    Scenario: multiply two numbers
      Given Two input values, 6 and 2
      When I multiply the two values
      Then I expect the result 12

    Scenario: divide two numbers
      Given Two input values, 6 and 2
      When I divide the two values
      Then I expect the result 3
  ```
* **Step Definition Additions**:
  ```java
  @When("^I multiply the two values$")
  public void multiplyTheTwoValues() {
      result = new Calculator().multiply(firstInput, secondInput);
  }

  @When("^I divide the two values$")
  public void divideTheTwoValues() {
      result = new Calculator().divide(firstInput, secondInput);
  }
  ```

---

## 9. Commit `217a69e` — Add Exponentiation BDD Scenario and Assertions

- **Commit Hash**: `217a69ede7aac897d836b0a682c57443983bdace`
- **Author**: `Mohammad Amin Koohi <MohammadAminKoohi>`
- **Branch**: `feature/bdd-scenarios`
- **Affected Files**: [`src/test/resources/features/calculator.feature`](file:///Users/amin/Desktop/Software_Workshop_4/src/test/resources/features/calculator.feature), [`src/test/java/calculator/CalculatorStepDefinitions.java`](file:///Users/amin/Desktop/Software_Workshop_4/src/test/java/calculator/CalculatorStepDefinitions.java)

### Prompt to Gemini 3.8 Flash
> We need to complete the scenario suite:
> 1. Add the exponentiation scenario to `calculator.feature`: Inputs 6 and 2, raise first to second, expecting result 36.
> 2. In `CalculatorStepDefinitions.java`, add `@When("^I raise the first value to the second value$")` invoking `calculator.power`.
> 3. Implement `@When("^I add the two values$")`.
> 4. Implement the `@Then("^I expect the result (\\d+)$")` assertion step using JUnit `assertEquals(expectedResult, result)`.

### LLM Result Summary
* **Gherkin Power Scenario**:
  ```gherkin
    Scenario: raise a number to a power
      Given Two input values, 6 and 2
      When I raise the first value to the second value
      Then I expect the result 36
  ```
* **Binding Methods Added**:
  ```java
  @When("^I add the two values$")
  public void addTheTwoValues() {
      result = firstInput + secondInput;
  }

  @When("^I raise the first value to the second value$")
  public void raiseTheFirstValueToTheSecondValue() {
      result = new Calculator().power(firstInput, secondInput);
  }

  @Then("^I expect the result (\\d+)$")
  public void expectTheResult(int expectedResult) {
      assertEquals(expectedResult, result);
  }
  ```

---

## 10. Commit `8fe3318` — Add Calculator Scenario Outline Coverage

- **Commit Hash**: `8fe33188d1bcc9b561b3a80d63452c035adb7fd4`
- **Author**: `Mohammad Amin Koohi <MohammadAminKoohi>`
- **Branch**: `feature/bdd-scenarios`
- **Affected Files**: [`src/test/resources/features/calculator.feature`](file:///Users/amin/Desktop/Software_Workshop_4/src/test/resources/features/calculator.feature), [`src/test/java/calculator/CalculatorStepDefinitions.java`](file:///Users/amin/Desktop/Software_Workshop_4/src/test/java/calculator/CalculatorStepDefinitions.java)

### Prompt to Gemini 3.8 Flash
> I want to demonstrate Cucumber's `Scenario Outline` with parameterized operations in `calculator.feature`.
> 
> Can you write a Scenario Outline named `calculate supported positive-value operations` that takes `<first>`, `<second>`, `<operation>`, and `<result>`, with examples for `multiply` (3 * 4 = 12), `divide` (8 / 2 = 4), and `power` (3 ^ 3 = 27)?
> Also provide a dynamic `@When` step definition using regex alternation `(multiply|divide|power)` that routes to the appropriate calculator method based on the captured operation string.

### LLM Result Summary
* **Gherkin Scenario Outline**:
  ```gherkin
    Scenario Outline: calculate supported positive-value operations
      Given Two input values, <first> and <second>
      When I perform the <operation> operation
      Then I expect the result <result>

      Examples:
        | first | second | operation | result |
        | 3     | 4      | multiply  | 12     |
        | 8     | 2      | divide    | 4      |
        | 3     | 3      | power     | 27     |
  ```
* **Step Definition with Regex Group**:
  ```java
  @When("^I perform the (multiply|divide|power) operation$")
  public void calculateUsingTheRequestedOperation(String operation) {
      Calculator calculator = new Calculator();
      if ("multiply".equals(operation)) {
          result = calculator.multiply(firstInput, secondInput);
      } else if ("divide".equals(operation)) {
          result = calculator.divide(firstInput, secondInput);
      } else {
          result = calculator.power(firstInput, secondInput);
      }
  }
  ```

---

## 11. Commit `a0c1298` — Route Addition BDD Step Through Calculator

- **Commit Hash**: `a0c1298686f0667297beadace01ca4f37fc49a5d`
- **Author**: `Mohammad Amin Koohi <MohammadAminKoohi>`
- **Branch**: `feature/bdd-scenarios`
- **Affected Files**: [`src/main/java/calculator/Calculator.java`](file:///Users/amin/Desktop/Software_Workshop_4/src/main/java/calculator/Calculator.java), [`src/test/java/calculator/CalculatorStepDefinitions.java`](file:///Users/amin/Desktop/Software_Workshop_4/src/test/java/calculator/CalculatorStepDefinitions.java)

### Prompt to Gemini 3.8 Flash
> In PR #8 review, we noticed that `CalculatorStepDefinitions.addTheTwoValues` computes addition directly as `result = firstInput + secondInput;` instead of delegating to the `Calculator` model. Also, `Calculator.java` is missing an `add()` method.
> 
> Please:
> 1. Add `public int add(int first, int second)` to `Calculator.java`.
> 2. Update `addTheTwoValues()` in `CalculatorStepDefinitions.java` to call `new Calculator().add(firstInput, secondInput)`.

### LLM Result Summary
* **Added to `Calculator.java`**:
  ```java
  public int add(int first, int second) {
      return first + second;
  }
  ```
* **Updated `CalculatorStepDefinitions.java`**:
  ```java
  @When("^I add the two values$")
  public void addTheTwoValues() {
      result = new Calculator().add(firstInput, secondInput);
  }
  ```
* Ensures architectural consistency: business computations live in the domain model rather than in the test step glue code.

---

## 12. Commit `ac4f961` — Add Multiplication Calculator Verification

- **Commit Hash**: `ac4f961317250cf97a953f71f115b5328d5c607c`
- **Author**: `Arshia Izdyari <izdyaria@gmail.com>`
- **Branch**: `feature/calculator-edge-verification`
- **Affected Files**: [`src/test/java/calculator/CalculatorTest.java`](file:///Users/amin/Desktop/Software_Workshop_4/src/test/java/calculator/CalculatorTest.java)

### Prompt to Gemini 3.8 Flash
> We need standalone JUnit 4 unit tests in `src/test/java/calculator/CalculatorTest.java` to test `Calculator.multiply` independently from Cucumber.
> 
> Cover the following:
> 1. Standard positive multiplication (`6 * 2 = 12`).
> 2. Multiplication with zero (`9 * 0 = 0`).
> 3. Sign preservation with negative operands (`-6 * 2 = -12` and `-6 * -2 = 12`).

### LLM Result Summary
* **Created `CalculatorTest.java` with test methods**:
  ```java
  package calculator;

  import org.junit.Test;
  import static org.junit.Assert.assertEquals;

  public class CalculatorTest {
      private final Calculator calculator = new Calculator();

      @Test
      public void multipliesPositiveNumbers() {
          assertEquals(12, calculator.multiply(6, 2));
      }

      @Test
      public void multiplicationByZeroReturnsZero() {
          assertEquals(0, calculator.multiply(9, 0));
      }

      @Test
      public void multiplicationPreservesExpectedSign() {
          assertEquals(-12, calculator.multiply(-6, 2));
          assertEquals(12, calculator.multiply(-6, -2));
      }
  }
  ```

---

## 13. Commit `3524842` — Define Division and Divide-by-Zero Behavior

- **Commit Hash**: `3524842d084183fd3f0eec3adc1ae911ac85d70f`
- **Author**: `Arshia Izdyari <izdyaria@gmail.com>`
- **Branch**: `feature/calculator-edge-verification`
- **Affected Files**: [`src/test/java/calculator/CalculatorTest.java`](file:///Users/amin/Desktop/Software_Workshop_4/src/test/java/calculator/CalculatorTest.java)

### Prompt to Gemini 3.8 Flash
> Add JUnit test cases to `CalculatorTest.java` for `Calculator.divide`:
> 1. Regular integer division (`6 / 2 = 3` and truncation check `7 / 2 = 3`).
> 2. Exception verification for division by zero (`6 / 0`), asserting that `ArithmeticException` is thrown using JUnit's `@Test(expected = ...)` annotation.

### LLM Result Summary
* **Added Tests**:
  ```java
  @Test
  public void dividesIntegers() {
      assertEquals(3, calculator.divide(6, 2));
      assertEquals(3, calculator.divide(7, 2));
  }

  @Test(expected = ArithmeticException.class)
  public void divisionByZeroThrowsArithmeticException() {
      calculator.divide(6, 0);
  }
  ```

---

## 14. Commit `b95c3a1` — Add Exponent Edge-Case Verification

- **Commit Hash**: `b95c3a11b67f526b9c61c2b1aa4ee78813a31cea`
- **Author**: `Arshia Izdyari <izdyaria@gmail.com>`
- **Branch**: `feature/calculator-edge-verification`
- **Affected Files**: [`src/test/java/calculator/CalculatorTest.java`](file:///Users/amin/Desktop/Software_Workshop_4/src/test/java/calculator/CalculatorTest.java)

### Prompt to Gemini 3.8 Flash
> Add unit tests to `CalculatorTest.java` for mathematical boundary cases of the `power` method:
> 1. Any number to power 0 equals 1 (`6 ^ 0 = 1`).
> 2. Any number to power 1 equals the base (`6 ^ 1 = 6`).
> 3. Representative positive power (`6 ^ 2 = 36`).

### LLM Result Summary
* **Added Tests**:
  ```java
  @Test
  public void anyBaseToZeroExponentReturnsOne() {
      assertEquals(1, calculator.power(6, 0));
  }

  @Test
  public void exponentOneReturnsTheBase() {
      assertEquals(6, calculator.power(6, 1));
  }

  @Test
  public void calculatesRepresentativePower() {
      assertEquals(36, calculator.power(6, 2));
  }
  ```

---

## 15. Commit `24fc8c3` — Reproduce Undefined Negative Scenario Outline Step

- **Commit Hash**: `24fc8c33504d167de49169534e327413ac4e08aa`
- **Author**: `Mohammad Amin Koohi <MohammadAminKoohi>`
- **Branch**: `feature/bdd-undefined-step-report`
- **Affected Files**: [`src/test/resources/features/calculator.feature`](file:///Users/amin/Desktop/Software_Workshop_4/src/test/resources/features/calculator.feature)

### Prompt to Gemini 3.8 Flash
> In the lab assignment instructions, we are given a sample Scenario Outline for addition with three example rows:
> - `| 1 | 12 | 13 |`
> - `| -1 | 6 | 5 |`
> - `| 2 | 2 | 4 |`
> 
> Add this `Scenario Outline: add pairs of numbers` to `calculator.feature` so that we can reproduce and examine the Undefined Step error caused by the negative number row.

### LLM Result Summary
* **Added Gherkin Scenario Outline**:
  ```gherkin
    Scenario Outline: add pairs of numbers
      Given Two input values, <first> and <second>
      When I add the two values
      Then I expect the result <result>

      Examples:
        | first | second | result |
        | 1     | 12     | 13     |
        | -1    | 6      | 5      |
        | 2     | 2      | 4      |
  ```
* Executing `mvn test` reproduces the error: `Given Two input values, -1 and 6` is reported as Undefined because `-1` fails to match the existing regex `(\\d+)`.

---

## 16. Commit `0e2b474` — Support Signed Operands in BDD Step Definitions

- **Commit Hash**: `0e2b4749114bf5b987b5da16e446e8d76e8c0bd8`
- **Author**: `Mohammad Amin Koohi <MohammadAminKoohi>`
- **Branch**: `feature/bdd-undefined-step-report`
- **Affected Files**: [`src/test/java/calculator/CalculatorStepDefinitions.java`](file:///Users/amin/Desktop/Software_Workshop_4/src/test/java/calculator/CalculatorStepDefinitions.java)

### Prompt to Gemini 3.8 Flash
> When running the addition Scenario Outline with `| -1 | 6 | 5 |`, Cucumber reports:
> `You can implement missing steps with the snippets below: @Given("^Two input values, -(\\d+) and (\\d+)$")`
> 
> Why did this step fail as Undefined with `@Given("^Two input values, (\\d+) and (\\d+)$")`, and what is the proper regular expression fix so that both positive and negative integer operands are accepted by the same method?

### LLM Result Summary
* **Root Cause Diagnosis**:
  The regex token `\d+` matches only digit characters (0–9) and fails on the negative sign `-`. Thus, `Given Two input values, -1 and 6` cannot match `(\\d+)`. The issue is purely syntactic in the step definition pattern, as `Calculator.add` natively supports negative integers.
* **Regex Fix in `CalculatorStepDefinitions.java`**:
  ```java
  @Given("^Two input values, (-?\\d+) and (-?\\d+)$")
  public void twoInputValues(int firstInput, int secondInput) {
      this.firstInput = firstInput;
      this.secondInput = secondInput;
  }
  ```
  The `-?` makes the hyphen optional, enabling matching of both positive and negative integers.

---

## 17. Commit `3b68cc8` — Add Signed-Number BDD Regression Coverage

- **Commit Hash**: `3b68cc8d32899ebf747c617c78995dba0d081bd7`
- **Author**: `Mohammad Amin Koohi <MohammadAminKoohi>`
- **Branch**: `feature/bdd-undefined-step-report`
- **Affected Files**: [`src/test/java/calculator/CalculatorStepDefinitions.java`](file:///Users/amin/Desktop/Software_Workshop_4/src/test/java/calculator/CalculatorStepDefinitions.java), [`src/test/resources/features/calculator.feature`](file:///Users/amin/Desktop/Software_Workshop_4/src/test/resources/features/calculator.feature)

### Prompt to Gemini 3.8 Flash
> Now that input operands accept negative values, the expected result in the `@Then` step could also be negative (for instance, `-4 + -5 = -9`).
> 
> 1. Update the regex in `@Then("^I expect the result (\\d+)$")` to accept signed integers.
> 2. Add regression test rows to `calculator.feature`:
>    - `| 8 | -3 | 5 |` (second operand negative)
>    - `| -4 | -5 | -9 |` (both operands and result negative)

### LLM Result Summary
* **Updated `@Then` Regex**:
  ```java
  @Then("^I expect the result (-?\\d+)$")
  public void expectTheResult(int expectedResult) {
      assertEquals(expectedResult, result);
  }
  ```
* **Expanded Examples in `calculator.feature`**:
  ```gherkin
      Examples:
        | first | second | result |
        | 1     | 12     | 13     |
        | -1    | 6      | 5      |
        | 2     | 2      | 4      |
        | 8     | -3     | 5      |
        | -4    | -5     | -9     |
  ```

---

## 18. Commit `ae9ff2d` — Add Persian Undefined-Step Analysis and Verification

- **Commit Hash**: `ae9ff2d6bcd6cfa21a63f56e2d9a4ed179667b96`
- **Author**: `Mohammad Amin Koohi <MohammadAminKoohi>`
- **Branch**: `feature/bdd-undefined-step-report`
- **Affected Files**: [`docs/bdd-undefined-step-report-fa.md`](file:///Users/amin/Desktop/Software_Workshop_4/docs/bdd-undefined-step-report-fa.md)

### Prompt to Gemini 3.8 Flash
> Write a technical lab report in Persian at `docs/bdd-undefined-step-report-fa.md` answering the assignment question regarding the undefined step:
> 1. Document the error reproduction (`10 scenarios, 1 undefined, 2 skipped`).
> 2. Explain the root cause (`\d+` rejecting `-1`).
> 3. Explain the fix using `(-?\d+)` and regression additions.
> 4. Confirm that the required operations (`6*2=12`, `6/2=3`, `6^2=36`) remain operational and passing.

### LLM Result Summary
* **Generated Report**:
  - Authored `docs/bdd-undefined-step-report-fa.md` with structured sections:
    - بازتولید خطا (Error reproduction with execution metrics)
    - علت (Technical explanation of regex mismatch vs domain logic)
    - اصلاح و پوشش رگرسیون (Fix documentation and regression test matrix)
    - سناریوهای الزامی ماشین‌حساب (Confirmation of required multiplication, division, and power operations)

---

## 19. Commit `347e0e3` — Use Shared Calculator Fixture in BDD Steps

- **Commit Hash**: `347e0e35c553e3851184f2757a0571478c97cebe`
- **Author**: `Arshia Izdyari <izdyaria@gmail.com>`
- **Branch**: `feature/calculator-bdd-integration`
- **Affected Files**: [`src/test/java/calculator/CalculatorStepDefinitions.java`](file:///Users/amin/Desktop/Software_Workshop_4/src/test/java/calculator/CalculatorStepDefinitions.java)

### Prompt to Gemini 3.8 Flash
> In `CalculatorStepDefinitions.java`, multiple methods currently create ad-hoc `new Calculator()` instances inline.
> 
> Refactor `CalculatorStepDefinitions.java` to use a single `private Calculator calculator;` field initialized cleanly before each scenario using Cucumber's `@Before` lifecycle hook.

### LLM Result Summary
* **Refactored Fixture Setup**:
  ```java
  import cucumber.api.java.Before;

  public class CalculatorStepDefinitions {
      private Calculator calculator;
      private int firstInput;
      private int secondInput;
      private int result;

      @Before
      public void setUpCalculator() {
          calculator = new Calculator();
      }
  ```
* Updated all `@When` methods (`add`, `multiply`, `divide`, `power`, and dynamic operation runner) to reuse the `calculator` instance.

---

## 20. Commit `9a1d4ee` — Add Signed Addition Calculator Regression

- **Commit Hash**: `9a1d4ee2d14fa613bd646f445f0a7e73df9d9669`
- **Author**: `Arshia Izdyari <izdyaria@gmail.com>`
- **Branch**: `feature/calculator-bdd-integration`
- **Affected Files**: [`src/test/java/calculator/CalculatorTest.java`](file:///Users/amin/Desktop/Software_Workshop_4/src/test/java/calculator/CalculatorTest.java)

### Prompt to Gemini 3.8 Flash
> Add comprehensive direct unit tests for `Calculator.add` in `CalculatorTest.java` to match the signed scenarios tested in BDD:
> - `addsPositiveNumbers` (`1 + 2 = 3`)
> - `addsNegativeAndPositiveNumbers` (`-1 + 6 = 5`)
> - `addsPositiveAndNegativeNumbers` (`8 + -3 = 5`)
> - `addsNegativeNumbers` (`-4 + -5 = -9`)

### LLM Result Summary
* **Added Tests**:
  ```java
  @Test
  public void addsPositiveNumbers() {
      assertEquals(3, calculator.add(1, 2));
  }

  @Test
  public void addsNegativeAndPositiveNumbers() {
      assertEquals(5, calculator.add(-1, 6));
  }

  @Test
  public void addsPositiveAndNegativeNumbers() {
      assertEquals(5, calculator.add(8, -3));
  }

  @Test
  public void addsNegativeNumbers() {
      assertEquals(-9, calculator.add(-4, -5));
  }
  ```

---

## 21. Commit `62b7243` — Configure Java 17 Compatibility for Cucumber Tests

- **Commit Hash**: `62b7243a04a7853ca00b22d4d546b3b482d2283a`
- **Author**: `Arshia Izdyari <izdyaria@gmail.com>`
- **Branch**: `feature/calculator-bdd-integration`
- **Affected Files**: [`pom.xml`](file:///Users/amin/Desktop/Software_Workshop_4/pom.xml)

### Prompt to Gemini 3.8 Flash
> When running `mvn test` on JDK 17, Cucumber 1.2.5 fails with reflective access violations on Java internal modules (such as `java.base/java.lang.reflect` and `java.base/java.util`).
> 
> How do we configure `maven-surefire-plugin` in `pom.xml` so that the tests run cleanly under Java 17 without requiring developers to manually pass `--add-opens` flags on the command line?

### LLM Result Summary
* **Maven Surefire Configuration**:
  Configured `maven-surefire-plugin` version `2.22.2` with JVM `<argLine>` options:
  ```xml
  <build>
      <plugins>
          <plugin>
              <groupId>org.apache.maven.plugins</groupId>
              <artifactId>maven-surefire-plugin</artifactId>
              <version>2.22.2</version>
              <configuration>
                  <argLine>
                      --add-opens java.base/java.util=ALL-UNNAMED
                      --add-opens java.base/java.lang.reflect=ALL-UNNAMED
                      --add-opens java.base/java.text=ALL-UNNAMED
                      --add-opens java.desktop/java.beans=ALL-UNNAMED
                      --add-opens java.desktop/java.awt.font=ALL-UNNAMED
                  </argLine>
              </configuration>
          </plugin>
      </plugins>
  </build>
  ```
* Resolves JPMS encapsulation restrictions during test execution on modern JDK runtimes while keeping source/target compatibility at 1.8.

---

## 22. Commit `0b96d45` — Add Final Report and Evidence

- **Commit Hash**: `0b96d45b828c57cefc219e4e27ae5500b8036c45`
- **Author**: `Mohammad Amin Koohi <MohammadAminKoohi>`
- **Branch**: `report/evidence` -> `main`
- **Affected Files**: [`README.md`](file:///Users/amin/Desktop/Software_Workshop_4/README.md), `Evidence/1.png`, `Evidence/2.png`, `Evidence/3.png`, `Evidence/4.png`

### Prompt to Gemini 3.8 Flash
> Write the comprehensive, formal final project report in Persian for our lab assignment in `README.md`.
> 
> Required Sections:
> 1. Introduction and BDD objectives.
> 2. Team members and GitHub handles (`arshiaizd` & `MohammadAminKoohi`).
> 3. Division of labor and mutual code reviews across PRs #5, #8, #9, #10, and #11.
> 4. Project structure tree and Maven dependency breakdown.
> 5. Calculator implementation and core operations.
> 6. BDD scenarios, Scenario Outline, and Step Definitions.
> 7. Detailed analysis of the Undefined Step bug and regex resolution (`Evidence/1.png`).
> 8. Direct JUnit unit test verification.
> 9. Build execution results showing all 60 tests passed (`Evidence/2.png`).
> 10. Kanban task board overview (`Evidence/3.png`) and PR peer review documentation (`Evidence/4.png`).
> 11. Git commit statistics confirming 20 development commits (10 per member).
> 12. Formal response to the lab question regarding the undefined step.

### LLM Result Summary
* **Generated Comprehensive Documentation**:
  - Authored complete 566-line Persian `README.md` covering all 12 required sections.
  - Formatted all code blocks, Gherkin scenarios, terminal test outputs, and Git graphs.
  - Linked visual artifacts in `Evidence/`:
    - `Evidence/1.png`: Reproduction of the undefined step.
    - `Evidence/2.png`: Successful execution of 60 tests under Maven.
    - `Evidence/3.png`: GitHub Project Kanban board with all tasks completed.
    - `Evidence/4.png`: Merged PRs with approvals and code reviews.

---

## Commit & Interaction Summary Matrix

| # | Commit Hash | Author | Domain | Core Prompt Objective | Deliverable / Output |
|---|---|---|---|---|---|
| **1** | `cb78460` | Arshia | Build Config | Maven BDD dependencies & .gitignore | `pom.xml`, `.gitignore` |
| **2** | `6e87eb1` | Arshia | Domain Model | Calculator skeleton class | `Calculator.java` skeleton |
| **3** | `d18073b` | Arshia | Domain Model | Integer multiplication implementation | `Calculator.multiply` |
| **4** | `02fb176` | Arshia | Domain Model | Integer division with exception behavior | `Calculator.divide` |
| **5** | `7b1970d` | Arshia | Domain Model | Iterative multiplication power method | `Calculator.power` |
| **6** | `db8a474` | Amin | Test Framework | Cucumber JUnit runner class | `RunnerTest.java` |
| **7** | `22a559e` | Amin | BDD Spec | Addition Gherkin scenario & @Given binding | `calculator.feature`, `CalculatorStepDefinitions.java` |
| **8** | `709f7cf` | Amin | BDD Spec | Multiplication & division scenarios & @When | `calculator.feature`, `CalculatorStepDefinitions.java` |
| **9** | `217a69e` | Amin | BDD Spec | Power scenario & @Then assertion | `calculator.feature`, `CalculatorStepDefinitions.java` |
| **10** | `8fe3318` | Amin | BDD Spec | Parameterized Scenario Outline & regex router | `calculator.feature`, `CalculatorStepDefinitions.java` |
| **11** | `a0c1298` | Amin | Architecture | Delegate BDD addition to Calculator model | `Calculator.add`, step def update |
| **12** | `ac4f961` | Arshia | Unit Testing | Direct JUnit tests for multiplication | `CalculatorTest.java` |
| **13** | `3524842` | Arshia | Unit Testing | Division & ArithmeticException tests | `CalculatorTest.java` |
| **14** | `b95c3a1` | Arshia | Unit Testing | Exponent edge-case verification tests | `CalculatorTest.java` |
| **15** | `24fc8c3` | Amin | Bug Analysis | Reproduce negative number undefined step | `calculator.feature` Scenario Outline |
| **16** | `0e2b474` | Amin | Bug Fix | Upgrade @Given regex to `(-?\\d+)` | `CalculatorStepDefinitions.java` |
| **17** | `3b68cc8` | Amin | Regression | Signed @Then regex & negative examples | `calculator.feature`, `CalculatorStepDefinitions.java` |
| **18** | `ae9ff2d` | Amin | Technical Docs | Persian undefined step report | `docs/bdd-undefined-step-report-fa.md` |
| **19** | `347e0e3` | Arshia | Refactoring | Shared `@Before` fixture for Calculator | `CalculatorStepDefinitions.java` |
| **20** | `9a1d4ee` | Arshia | Unit Testing | Signed addition regression tests | `CalculatorTest.java` |
| **21** | `62b7243` | Arshia | Build Config | Surefire `--add-opens` for Java 17 | `pom.xml` surefire configuration |
| **22** | `0b96d45` | Amin | Technical Docs | Comprehensive project report & evidence | `README.md`, evidence images |
