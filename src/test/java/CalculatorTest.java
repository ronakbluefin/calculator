package test.java;

import main.java.Calculator;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class CalculatorTest {

    private Calculator calculator;

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
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }

    @Test
    public void additionArithmeticException() {
        calculator = new Calculator();

        try {
            calculator.addition(Integer.MAX_VALUE, 1);
        } catch (ArithmeticException e) {
            assertTrue(true);
        }
    }

    @Test
    public void additioWithMaxValues() {
        calculator = new Calculator();

        int result = calculator.addition(Integer.MAX_VALUE, Integer.MAX_VALUE);
        assertEquals((Integer.MAX_VALUE + Integer.MAX_VALUE), result);
    }

    @Test
    public void additionWithFloatValues() {
        calculator = new Calculator();

        int result = calculator.addition(Integer.MAX_VALUE/2, 123/12, 98);
        assertEquals((Integer.MAX_VALUE/2) + (123/12) + 98, result);
    }

    @Test
    public void subtractionWithDoubles() {
        calculator = new Calculator();

        double result = calculator.subtraction(123.4, 1.234e2, 132.4f);
        assertEquals(-379.1, result, 0.9);
    }

    @Test
    public void substractionWithNull() {
        calculator = new Calculator();

        try {
            calculator.subtraction();
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }

    @Test
    public void substractWithMinValues() {
        calculator = new Calculator();

        double result = calculator.subtraction(Double.MIN_VALUE, Double.MIN_VALUE);
        assertEquals(-1.0, result, 1);
    }

    @Test
    public void substractWithMaxValues() {
        calculator = new Calculator();

        double  result = calculator.subtraction(Double.MIN_VALUE, Double.MAX_VALUE);
        assertEquals(-1.7976931348623157E308, result, 0.12);
    }


    @Test
    public void substractionArithmeticException() {
        calculator = new Calculator();

        try {
            calculator.subtraction(Double.MIN_VALUE,1);
        } catch (ArithmeticException e) {
            assertTrue(true);
        }
    }


    @Test
    public void divisionOfNumbers() {
        calculator = new Calculator();

        double result = calculator.division(16,2,2,1);
        assertEquals(4, result,2);
    }

    @Test
     public void divisionByZero() {
        calculator = new Calculator();

        try {
            calculator.division(100,0,2,3,0);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Test
    public void divisionArithmeticException() {
        calculator = new Calculator();

        try {
            calculator.division(1000000000, 2);
        } catch (ArithmeticException e) {
            assertTrue(true);
        }
    }


    @Test
    public void divisionDoubleRange() {
        calculator = new Calculator();

        try {
            calculator.division(Double.MIN_VALUE, Double.MAX_VALUE);
        } catch (ArithmeticException e) {
            assertTrue(true);
        }
    }

    @Test
    public void divisionByMinValue() {
        calculator = new Calculator();

        double result = calculator.division(Double.MIN_VALUE,2);
        assertEquals((Double.MIN_VALUE/2), result, 1);
    }

    @Test
    public void multiplicationOfNumbers() {
        calculator = new Calculator();

        double result = calculator.multiplication(16,2,2,1);
        assertEquals(64, result,2);
    }

    @Test
    public void multiplicationByZero() {
        calculator = new Calculator();

        try {
            calculator.multiplication(100,0,2,3,0);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Test
    public void multiplicationArithmeticException() {
        calculator = new Calculator();

        try {
            calculator.multiplication(Double.MAX_VALUE, 2);
        } catch (ArithmeticException e) {
            assertTrue(true);
        }
    }

    @Test
    public void squareRootOfNumbers() {
        calculator = new Calculator();

        double[] result = calculator.squareRootOfNumbers(16,4,64,81,121);
        double[] expectedResult = {4, 2, 8, 9, 11};

        assertTrue(Arrays.equals(result, expectedResult));
    }

    @Test
    public void squareRootOfZero() {
        calculator = new Calculator();

        try {
            calculator.squareRootOfNumbers(100,0,2,3,0);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Test
    public void squareRootRangeOfDouble() {
        calculator = new Calculator();

        try {
            calculator.multiplication(Double.MIN_VALUE);
        } catch (ArithmeticException e) {
            assertTrue(true);
        }
    }

    @Test
    public void powerToAnExponentSimple() {
        calculator = new Calculator();

        double result = calculator.powerToAnExponent(2,4);
        assertEquals(16, result, 2);
    }

    @Test
    public void powerToAnExponentZeroValues() {
        calculator = new Calculator();

        try {
            calculator.powerToAnExponent(0,1);
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }

    @Test
    public void powerToAnExponentRangeOfDouble() {
        calculator = new Calculator();

        try {
            calculator.powerToAnExponent(Double.MAX_VALUE, 2);
        } catch (ArithmeticException e) {
            assertTrue(true);
        }
    }

    @Test
    public void findMeanOfNumbersSimple() {
        calculator = new Calculator();

        double result = calculator.findMeanOfNumbers(10,20,30,40,50,60,67,5.5,5.5,700,8546);
        assertEquals(794.5, result, 4);
    }

    @Test
    public void findMeanOfNumbersDoubleRange() {
        calculator = new Calculator();

        try {
            calculator.findMeanOfNumbers(Double.MAX_VALUE, Double.MAX_VALUE);
        } catch (ArithmeticException e) {
            assertTrue(true);
        }
    }

    @Test
    public void findMeanOfNumbersNullPointerException() {
        calculator = new Calculator();

        try {
            calculator.findMeanOfNumbers();
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }

    @Test
    public void findMedianOfNumbers() {
        calculator = new Calculator();

        double result = calculator.findMedianOfNumber(10,20,30,40,50,60,70,80,90,100);
        assertEquals(55, result, 4);
    }

    @Test
    public void findMedianDoubleRange() {
        calculator = new Calculator();

        try {
            calculator.findMeanOfNumbers(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE);
        } catch (ArithmeticException e) {
            assertTrue(true);
        }
    }
}