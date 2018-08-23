package test.java;

import main.java.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class CalculatorTest {

    Calculator calculator;

    @Test
    public void additionWithIntegers() {
        calculator = new Calculator();

        int result =  calculator.addition(10,-2,30,-50);
        assertEquals(-12, result);
    }

    @Test
    public void additionWithNull() {
        calculator = new Calculator();

        try {
            calculator.addition();
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException);
        }
    }

    @Test
    public void additionOutOfRange() {
        calculator = new Calculator();

        try {
            calculator.addition(Integer.MAX_VALUE, 1);
        } catch (Exception e) {
            assertTrue(e instanceof IndexOutOfBoundsException);
        }
    }

    @Test
    public void subtractionWithDoubles() {
        calculator = new Calculator();

        double result = calculator.subtraction(123.4, 1.234e2, 132.4f);
        assertEquals(259.154359776, result);
    }
}