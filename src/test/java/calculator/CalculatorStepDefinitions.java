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
