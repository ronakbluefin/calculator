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
            throw new NullPointerException("Substraction:: Values can not be Empty");

        double sub = 0;

        for (double number : numbers)
            sub -= number;

        return sub;
    }

    public double division(double... numbers) {

        if(numbers.length <=0)
            throw new NullPointerException("Division:: Values can not be Empty");

        double div = 0;

        for(int i=0; i<numbers.length; i++) {
            div = numbers[i];

            if(numbers.length <= i) {
                div /= numbers[i+1];
            } else
                return div;
        }
        return div;
    }
}
