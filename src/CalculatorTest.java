import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


class CalculatorTest {

    Calculator calculator;

    @Test
    public void additionWithIntegers() {

        calculator = new Calculator();

        int result = calculator.addition(10,-2,30,-50);
        assertEquals(-12, result);
    }

}