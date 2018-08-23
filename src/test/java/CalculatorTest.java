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
    public void additionArithmeticException() {
        calculator = new Calculator();

        try {
            calculator.addition(Integer.MAX_VALUE, 1);
        } catch (Exception e) {
            assertTrue(e instanceof ArithmeticException);
        }
    }

    @Test
    public void subtractionWithDoubles() {
        calculator = new Calculator();

        double result = calculator.subtraction(123.4, 1.234e2, 132.4f);
        assertEquals(-379.1999938964844, result, 2);
    }

    @Test
    public void substractionWithNull() {
        calculator = new Calculator();

        try {
            calculator.subtraction();
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException);
        }
    }

    @Test
    public void substractionArithmeticException() {
        calculator = new Calculator();

        try {
            calculator.subtraction(Double.MIN_VALUE,1);
        } catch (Exception e) {
            assertTrue(e instanceof ArithmeticException);
        }
    }


    @Test
    public void divisionOfNumbers() {
        calculator = new Calculator();

        double result = calculator.division(16,2,2,1);
        assertEquals(4, result,0);
    }

    @Test
    public void divisionByZero() {
        calculator = new Calculator();

        try {
            calculator.division(100,10,2,3,0);
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
        }
    }

    @Test
    public void divisionArithmeticException() {
        calculator = new Calculator();

        try {
            calculator.division(1000000000, 2);
        } catch (Exception e) {
            assertTrue(e instanceof ArithmeticException);
        }
    }
}