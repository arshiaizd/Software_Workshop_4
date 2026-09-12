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
