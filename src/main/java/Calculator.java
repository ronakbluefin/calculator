package main.java;

import java.math.BigInteger;

import static java.lang.Math.toIntExact;

public class Calculator {

    public int addition(int... numbers) {

        if(numbers.length <= 0)
            throw new NullPointerException("Values can not be null");

        BigInteger bigIntegerAddition = BigInteger.valueOf(0);

        for(int number : numbers)
            bigIntegerAddition = bigIntegerAddition.add(BigInteger.valueOf(number));

        int addition = toIntExact(bigIntegerAddition.intValue());
        return addition;
    }

    public double subtraction(double... numbers) {

        return 0;
    }

}
