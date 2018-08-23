package main.java;

import java.math.BigInteger;

import static java.lang.Math.toIntExact;

public class Calculator {

    public int addition(int... numbers) {

        if(numbers.length <= 0)
            throw new NullPointerException("Addition:: Values can not be null");

        BigInteger bigIntegerAddition = BigInteger.valueOf(0);

        for(int number : numbers)
            bigIntegerAddition = bigIntegerAddition.add(BigInteger.valueOf(number));

        int addition = toIntExact(bigIntegerAddition.intValue());
        return addition;
    }

    public double subtraction(double... numbers) {

        if (numbers.length <= 0)
            throw new NullPointerException("Substraction:: Values can not be null");

        double sub = 0;

        for (double number : numbers)
            sub -= number;

        return sub;
    }

}
