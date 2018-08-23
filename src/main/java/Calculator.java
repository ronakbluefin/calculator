package main.java;

import java.math.BigInteger;

import static java.lang.Math.toIntExact;

public class Calculator {

    public int addition(int... numbers) {

        if(numbers.length <= 0)
            throw new NullPointerException("Addition:: Values can not be Empty");

        BigInteger bigIntegerAddition = BigInteger.valueOf(0);

        for(int number : numbers)
            bigIntegerAddition = bigIntegerAddition.add(BigInteger.valueOf(number));

        int addition = toIntExact(bigIntegerAddition.intValue());
        return addition;
    }

    public double subtraction(double... numbers) {

        if (numbers.length <= 0)
            throw new NullPointerException("Subtraction:: Values can not be Empty");

        double sub = 0;

        for (double number : numbers)
            sub -= number;

        return sub;
    }

    public double division(double... numbers) {

        if(numbers.length <=0)
            throw new NullPointerException("Division:: Values can not be Empty");

        double div = numbers[0]*numbers[0];

        for(double number : numbers)
            div/= number;

        return div;
    }

    public double multiplication(double... numbers) {

        if (numbers.length <= 0)
            throw new NullPointerException("Multiplication:: Values can not be Empty");

        double mul = 1;

        for (double number : numbers)
            mul *= number;

        return mul;
    }

    public double[] squareRootOfNumbers(double... numbers) {

        if (numbers.length<=0)
            throw new NullPointerException("Multiplication:: Values can not be Empty");

        double[] squareRootResult = new double[numbers.length];

        for(int i = 0; i<numbers.length; i++)
            squareRootResult[i] = Math.sqrt(numbers[i]);

        return squareRootResult;
    }

    public double powerToAnExponent(double number, int exponent) {

        if(number == 0)
            throw new NullPointerException("Power of Number:: Values can not be Empty");

        return Math.pow(number, exponent);
    }

    public double findMeanOfNumbers(double... numbers) {
        return 0;
    }
}
