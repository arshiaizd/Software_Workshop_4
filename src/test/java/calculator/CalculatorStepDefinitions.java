package calculator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CalculatorStepDefinitions {
    private int firstInput;
    private int secondInput;
    private int result;

    @Given("^Two input values, (\\d+) and (\\d+)$")
    public void twoInputValues(int firstInput, int secondInput) {
        this.firstInput = firstInput;
        this.secondInput = secondInput;
    }

    @When("^I multiply the two values$")
    public void multiplyTheTwoValues() {
        result = new Calculator().multiply(firstInput, secondInput);
    }

    @When("^I divide the two values$")
    public void divideTheTwoValues() {
        result = new Calculator().divide(firstInput, secondInput);
    }
}
