import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorMockitoTest {

    private main.java.Calculator calculator;

    @Before
    public void setup() {
        calculator = new main.java.Calculator();
    }

    @Test
    public void bifunctionAddition() {
        int result = calculator.bifunctionAddition(10,20);
        assertEquals(60, result);
    }
}