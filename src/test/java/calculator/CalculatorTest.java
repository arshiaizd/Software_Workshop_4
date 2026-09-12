package calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

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

    @Test
    public void dividesIntegers() {
        assertEquals(3, calculator.divide(6, 2));
        assertEquals(3, calculator.divide(7, 2));
    }

    @Test(expected = ArithmeticException.class)
    public void divisionByZeroThrowsArithmeticException() {
        calculator.divide(6, 0);
    }

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
}
