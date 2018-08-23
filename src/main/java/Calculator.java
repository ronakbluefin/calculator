package main.java;

import java.math.BigInteger;

public class Calculator {

    public BigInteger addition(int... numbers) {

        if(numbers.length <= 0)
            throw new NullPointerException("Values can not be null");

        BigInteger sum = BigInteger.valueOf(0);

        for(int number : numbers)
            sum = sum.add(BigInteger.valueOf(number));

        return sum;
    }

}
