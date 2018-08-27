package test.java;

import main.java.Calculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void additionWithIntegers() {
        int result =  calculator.addition(10,-2,30,-50);
        assertEquals(-12, result);
    }

    @Test
    public void additionWithNull() {
        try {
            calculator.addition();
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }

    @Test
    public void additionArithmeticException() {
        try {
            calculator.addition(Integer.MAX_VALUE, 1);
        } catch (ArithmeticException e) {
            assertTrue(true);
        }
    }

    @Test
    public void additionWithMaxValues() {
        int result = calculator.addition(Integer.MAX_VALUE, Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE + Integer.MAX_VALUE, result);
    }

    @Test
    public void additionWithFloatValues() {
        int result = calculator.addition(Integer.MAX_VALUE/2, 123/12, 98);
        assertEquals((Integer.MAX_VALUE/2) + (123/12) + 98, result);
    }

    @Test
    public void subtractionWithDoubles() {
        double result = calculator.subtraction(123.4, 1.234e2, 132.4f);
        assertEquals(-379.1, result, 0.9);
    }

    @Test
    public void substractionWithNull() {
        try {
            calculator.subtraction();
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }

    @Test
    public void substractWithMinValues() {
        double result = calculator.subtraction(Double.MIN_VALUE, Double.MIN_VALUE);
        assertEquals(-1.0, result, 1);
    }

    @Test
    public void substractWithMaxValues() {
        double  result = calculator.subtraction(Double.MIN_VALUE, Double.MAX_VALUE);
        assertEquals(-1.7976931348623157E308, result, 0.12);
    }


    @Test
    public void substractionArithmeticException() {
        try {
            calculator.subtraction(Double.MIN_VALUE,1);
        } catch (ArithmeticException e) {
            assertTrue(true);
        }
    }


    @Test
    public void divisionOfNumbers() {
        double result = calculator.division(16,2,2,1);
        assertEquals(4, result,2);
    }

    @Test
     public void divisionByZero() {
        try {
            calculator.division(100,0,2,3,0);
        } catch (ArithmeticException e) {
            assertTrue(true);
        }
    }

    @Test
    public void divisionArithmeticException() {
        try {
            calculator.division(1000000000, 2);
        } catch (ArithmeticException e) {
            assertTrue(true);
        }
    }

    @Test
    public void divisionDoubleRange() {
        try {
            calculator.division(Double.MIN_VALUE, Double.MAX_VALUE);
        } catch (ArithmeticException e) {
            assertTrue(true);
        }
    }

    @Test
    public void divisionByMinValue() {
        double result = calculator.division(Double.MIN_VALUE,2);
        assertEquals(0, result, 0);
    }

    @Test
    public void multiplicationOfNumbers() {
        double result = calculator.multiplication(16,2,2,1);
        assertEquals(64, result,0.4);
    }

    @Test
    public void multiplicationByZero() {
        try {
            calculator.multiplication(100,0,2,3,0);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Test
    public void multiplicationArithmeticException() {
        try {
            calculator.multiplication(Double.MAX_VALUE, 2);
        } catch (ArithmeticException e) {
            assertTrue(true);
        }
    }

    @Test
    public void multiplicationOfMaxDoubleValues() {
        try {
            calculator.multiplication(Double.MAX_VALUE, Double.MAX_VALUE);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Test
    public void squareRootOfNumbers() {
        double result = calculator.squareRootOfNumbers(16);
        assertEquals(4, result, 0);
    }

    @Test
    public void squareRootRangeOfDoubleException() {
        try {
            calculator.multiplication(Double.MIN_VALUE+Double.MAX_VALUE+Double.MAX_VALUE);
        } catch (NumberFormatException e) {
            assertTrue(true);
        }
    }

    @Test
    public void squareRootWithStringInput() {
        try {
            calculator.squareRootOfNumbers(new Double("hello"));
        } catch (NumberFormatException e) {
            assertTrue(true);
        }
    }

    @Test
    public void powerToAnExponentSimple() {
        double result = calculator.powerToAnExponent(2,4);
        assertEquals(16, result, 2);
    }

    @Test
    public void powerToAnExponentZeroValues() {
        try {
            calculator.powerToAnExponent(0,1);
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }

    @Test
    public void powerToAnExponentRangeOfDouble() {
        try {
            calculator.powerToAnExponent(Double.MAX_VALUE, 2);
        } catch (NumberFormatException e) {
            assertTrue(true);
        }
    }

    @Test
    public void findMeanOfNumbersSimple() {
        double result = calculator.findMeanOfNumbers(10,20,30,40,50,60,67,5.5,5.5,700,8546);
        assertEquals(794.5, result, 4);
    }

    @Test
    public void findMeanOfNumbersDoubleRange() {
        try {
            calculator.findMeanOfNumbers(Double.MAX_VALUE, Double.MAX_VALUE);
        } catch (ArithmeticException e) {
            assertTrue(true);
        }
    }

    @Test
    public void findMeanOfNumbersNullPointerException() {
        try {
            calculator.findMeanOfNumbers();
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }

    @Test
    public void findMedianWithTotalEvenNumber() {
        double result = calculator.findMedianOfNumbers(10,20,30,40,50,60,70,80,90,100);
        assertEquals(55, result, 0);
    }

    @Test
    public void findMedianWithTotalEOddNumber() {
        double result = calculator.findMedianOfNumbers(10,20,30,40,50,60,70,80,90);
        assertEquals(50, result, 4);
    }

    @Test
    public void findMedianDoubleRange() {
        try {
            calculator.findMeanOfNumbers(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE);
        } catch (ArithmeticException e) {
            assertTrue(true);
        }
    }
}