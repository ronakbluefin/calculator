package main.java;
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

        return mul.doubleValue();
    }

    public double squareRootOfNumbers(double number) {

        if(number == 0)
             throw new IllegalArgumentException("Square Root:: Square root not possible");

        BigDecimal squareRoot;

        try {
            squareRoot  = new BigDecimal(sqrt(number));
        } catch (Exception e) {
            throw new NumberFormatException("Answer is Infinity");
        }
        return squareRoot.doubleValue();
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

    public double findMedianOfNumbers(double... numbers) {
        return 0;
    }

    public double findModeOfNumbers(double... numbers) {
        return 0;
    }

    public double findHypotenuse(double side1, double side2, double side3) {

        // side3 = Math.sqrt(side1+side2);
        return 0;
    }
}
