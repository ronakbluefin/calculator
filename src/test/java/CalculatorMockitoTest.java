import main.java.Calculator;
import org.junit.Test;
import org.mockito.Mock;

import java.util.function.BiFunction;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


public class CalculatorMockitoTest {

    @Mock
    Calculator calculator;

    @Test
    public void functionOneTestSimple() {
        when(calculator.functionOne(10,20)).thenReturn(30);
    }
}