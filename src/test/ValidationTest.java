package test;

import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import main.Validation;

public class ValidationTest {


    private Validation validation;

    @Before
    public void setup() {
        validation = new Validation();
    }


    @Test
    public void shouldReturnAnInstanceOfValidationClass() {
        Assert.assertNotNull(validation);
    }


    @Test
    public void shouldReturntAnEmptyListWhenNoErrorsPassedIn() {
        List<String> errors = validation.validate("1.11", "1.11");
        Assert.assertTrue(errors.isEmpty());;
    }

    @Test
    public void shouldReturntOneErrorInListWhenErrorDecimalPassedIn() {
        List<String> errors = validation.validate("1.111");
        Assert.assertEquals(1, errors.size());
        Assert.assertEquals("Too many decimal places for value 1.111", errors.get(0));
    }

    @Test
    public void shouldReturnTwoErrors() {
        List<String> errors = validation.validate("1.111", "2.222");
        Assert.assertEquals(2, errors.size());
        Assert.assertEquals("Too many decimal places for value 1.111", errors.get(0));
        Assert.assertEquals("Too many decimal places for value 2.222", errors.get(1));
    }



}
