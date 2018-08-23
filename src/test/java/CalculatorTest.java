package test.java;

import main.java.Calculator;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class CalculatorTest {

    Calculator calculator;

    @Test
    public void additionWithIntegers() {
        calculator = new Calculator();

        BigInteger result =  calculator.addition(10,-2,30,-50);
        assertEquals(BigInteger.valueOf(-12), result);
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

}