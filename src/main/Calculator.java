package main;

// Pass an instance of the Validator class in to the Calculator constructor so that the Add,
// Subtract, Multiply and Divide methods can use it to validate their values rather than use the
// duplicate code we currently have
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private Validation validation;
    private List<String> errors;

    public Calculator(Validation validation) {
        this.validation = validation;
    }

    public String add(String s1, String s2) {
        validateDecimals(s1, s2);
        return new BigDecimal(s1).add(new BigDecimal(s2)).toString();
    }

    public String subtract(String s1, String s2) {

        validateDecimals(s1, s2);
        return new BigDecimal(s1).subtract(new BigDecimal(s2)).toString();
    }

    public String multiply(String s1, String s2) {
        validateDecimals(s1, s2);
        return new BigDecimal(s1).multiply(new BigDecimal(s2)).toString();
    }

    public String divide(String s1, String s2) {
        if (s2.equals(BigDecimal.ZERO)) {
            throw new IllegalArgumentException("Cannot Divide By Zero");
        }
        validateDecimals(s1, s2);
        return new BigDecimal(s1).divide(new BigDecimal(s2)).toString();
    }

    private void validateDecimals(String... values) {
        List<String> errors = this.validation.validate(values);

        if (!errors.isEmpty()) {
            throw new IllegalArgumentException("Too many decs ya dork!");
        }
    }

}
