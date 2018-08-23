package main.java;

public class Calculator {

    public int addition(int... numbers) {

        int sum = 0;

        for(int number: numbers)
            sum+= number;

        return sum;
    }

}
