package test;

// Update the calculator to change the subtract method to take two Strings which can contain
// decimals to two places and returns a String.

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import main.Calculator;
import main.Validation;

public class CalculatorTest {

    private Calculator calculator;
    private Validation validation;

    @Before
    public void setUp() {
        validation = new Validation();
        calculator = new Calculator(validation);
    }

    @Test
    public void shouldReturnAnInstanceOfCalculator() {

        Assert.assertNotNull(calculator);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addShouldThrowAnExceptionWhenThreeDecimalPlacesValuePassed() {
        calculator.add("1.11", "1.111");
    }

    @Test
    public void shouldReturnThePositiveSumOfTwoIntegers() {
        String result = calculator.add("1.11", "1.11");
        Assert.assertEquals("2.22", result);
    }

    @Test
    public void shouldReturnTheNegativeSumOfTwoIntegers() {
        String result = calculator.add("-1.11", "-1.11");
        Assert.assertEquals("-2.22", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void subtractShouldThrowAnExceptionWhenThreeDecimalPlacesValuePassed() {
        calculator.subtract("1.11", "1.111");
    }

    @Test
    public void shouldReturnPositiveSubtractionResult() {
        String result = calculator.subtract("-1.11", "-2.22");
        Assert.assertEquals("1.11", result);
    }

    @Test
    public void shouldReturnNegativeSubtractionResult() {
        String result = calculator.subtract("1.11", "2.22");
        Assert.assertEquals("-1.11", result);
    }

    @Test
    public void shouldReturnAPositiveMultiplicationResult() {
        String result = calculator.multiply("1.11", "1.11");
        Assert.assertEquals("1.2321", result);
    }

    @Test
    public void shouldReturnANegativeMultiplicationResult() {
        String result = calculator.multiply("-1.11", "1.11");
        Assert.assertEquals("-1.2321", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void multiplyShouldThrowAnExceptionWhenThreeDecimalPlacesValuePassed() {
        calculator.multiply("1.11", "1.111");
    }

    @Test
    public void divideShouldReturnAPositiveResult() {
        String result = calculator.divide("1.11", "1.11");
        Assert.assertEquals("1", result);
    }

    @Test
    public void divideShouldReturnANegativeResult() {
        String result = calculator.divide("-1.11", "1.11");
        Assert.assertEquals("-1", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divideShouldThrowAnExceptionWhenMoreThanTwoDecimalsArePassed() {
        calculator.divide("1.111", "0");
    }


}
