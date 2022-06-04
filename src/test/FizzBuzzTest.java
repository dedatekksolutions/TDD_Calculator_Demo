package test;

import org.junit.Assert;
import org.junit.Test;
import main.FizzBuzz;

// write a program that has one method test(int value), for multiples of three print "Fizz" instead
// of the number and for the multiples of five print "Buzz". Anything else simple, return the
// number/

public class FizzBuzzTest {

    @Test
    public void shouldReturnAFizzBuzzClassWhenCalled() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        Assert.assertNotNull(fizzbuzz);
    }

    @Test
    public void shouldReturnFizzWhenIntDivisibleByThreeIsPassed() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.test(3);
        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnBuzzWhenIntDivisibleByFiveIsPassed() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.test(5);
        Assert.assertEquals("Buzz", result);
    }

    @Test
    public void shouldReturnIntWhenIntNotDivisibleByThreeIsPassed() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.test(1);
        Assert.assertEquals("1", result);
    }


    @Test
    public void shouldReturnFizzBuzzWhenIntDivisibleByThreeAndFiveIsPassed() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.test(30);
        Assert.assertEquals("FizzBuzz", result);
    }

}
