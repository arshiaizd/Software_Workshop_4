package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class CalculatorStepDefinitions {
    private Calculator calculator;
    private int firstInput;
    private int secondInput;
    private int result;

    @Before
    public void setUpCalculator() {
        calculator = new Calculator();
    }

    @Given("^Two input values, (-?\\d+) and (-?\\d+)$")
    public void twoInputValues(int firstInput, int secondInput) {
        this.firstInput = firstInput;
        this.secondInput = secondInput;
    }

    @When("^I add the two values$")
    public void addTheTwoValues() {
        result = calculator.add(firstInput, secondInput);
    }

    @When("^I multiply the two values$")
    public void multiplyTheTwoValues() {
        result = calculator.multiply(firstInput, secondInput);
    }

    @When("^I divide the two values$")
    public void divideTheTwoValues() {
        result = calculator.divide(firstInput, secondInput);
    }

    @When("^I raise the first value to the second value$")
    public void raiseTheFirstValueToTheSecondValue() {
        result = calculator.power(firstInput, secondInput);
    }

    @When("^I perform the (multiply|divide|power) operation$")
    public void calculateUsingTheRequestedOperation(String operation) {
        if ("multiply".equals(operation)) {
            result = calculator.multiply(firstInput, secondInput);
        } else if ("divide".equals(operation)) {
            result = calculator.divide(firstInput, secondInput);
        } else {
            result = calculator.power(firstInput, secondInput);
        }
    }

    @Then("^I expect the result (-?\\d+)$")
    public void expectTheResult(int expectedResult) {
        assertEquals(expectedResult, result);
    }
}
