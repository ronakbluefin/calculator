package main.java;

import sun.reflect.annotation.ExceptionProxy;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;

import static java.lang.Math.sqrt;
import static java.lang.Math.toIntExact;

public class Calculator {

    public int addition(int... numbers) {

        if(numbers.length <= 0)
            throw new NullPointerException("Addition:: Values can not be Empty");

        BigInteger bigIntegerAddition = BigInteger.valueOf(0);

        for(int number : numbers)
            bigIntegerAddition = bigIntegerAddition.add(BigInteger.valueOf(number));

        return toIntExact(bigIntegerAddition.intValue());
    }

    public double subtraction(double... numbers) {

        if (numbers.length <= 0)
            throw new NullPointerException("Subtraction:: Values can not be Empty");

        BigDecimal sub = BigDecimal.valueOf(0);

        for (double number : numbers)
            sub = sub.subtract(BigDecimal.valueOf(number));

        return sub.doubleValue();
    }

    public double division(double... numbers) {

        if(numbers.length <=0)
            throw new NullPointerException("Division:: Values can not be Empty");

        BigDecimal div = BigDecimal.valueOf(numbers[0]*numbers[0]);

        for(double number : numbers)
            div = div.divide(BigDecimal.valueOf(number));

        return div.doubleValue();
    }

    public double multiplication(double... numbers) {

        if (numbers.length <= 0)
            throw new NullPointerException("Multiplication:: Values can not be Empty");

        BigDecimal mul = BigDecimal.valueOf(1);

        for (double number : numbers)
            mul = mul.multiply(BigDecimal.valueOf(number));


        if(mul.doubleValue() > Double.MAX_VALUE)
            throw new IllegalArgumentException("Multiplication:: Multiplication not possible using Double");

        return mul.doubleValue();
    }

    public double squareRootOfNumbers(double number) {


        return 0;
    }

    public double powerToAnExponent(double number, int exponent) {

        if(number == 0)
            throw new NullPointerException("Power of Number:: Value can not be Empty");

        return Math.pow(number, exponent);
    }

    public double findMeanOfNumbers(double... numbers) {
        if(numbers.length <=0)
            throw new NullPointerException("Mean of Numbers:: Values can not be Empty");

        double sum = 0;

        for(double number : numbers)
            sum += number;

        return sum/(numbers.length+1);
    }

    public double findMedianOfNumber(double... numbers) {
        return 0;
    }
}
