package calculator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class CalculatorStepDefinitions {
    private int firstInput;
    private int secondInput;
    private int result;

    @Given("^Two input values, (\\d+) and (\\d+)$")
    public void twoInputValues(int firstInput, int secondInput) {
        this.firstInput = firstInput;
        this.secondInput = secondInput;
    }

    @When("^I add the two values$")
    public void addTheTwoValues() {
        result = new Calculator().add(firstInput, secondInput);
    }

    @When("^I multiply the two values$")
    public void multiplyTheTwoValues() {
        result = new Calculator().multiply(firstInput, secondInput);
    }

    @When("^I divide the two values$")
    public void divideTheTwoValues() {
        result = new Calculator().divide(firstInput, secondInput);
    }

    @When("^I raise the first value to the second value$")
    public void raiseTheFirstValueToTheSecondValue() {
        result = new Calculator().power(firstInput, secondInput);
    }

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

    @Then("^I expect the result (\\d+)$")
    public void expectTheResult(int expectedResult) {
        assertEquals(expectedResult, result);
    }
}
