import main.java.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.function.BiFunction;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CalculatorMockitoTest {

    @Mock
    private BiFunction<Integer, Integer, Integer> functionOne;

    @Mock
    private BiFunction<Integer, Integer, Integer> functionTwo;

    private Calculator calculator = new Calculator();

    @Test
    public void bothfunctionTestSimple() {
        when(functionOne.apply(2, 3)).thenReturn(5);
        when(functionTwo.apply(2, 3)).thenReturn(5);

        Integer result = calculator.addTwoFunction(functionOne.apply(2,3), functionTwo.apply(2,3));
        assertEquals(10, result, 1);
    }

    @Test
    public void functionOneTestSimple() {
        when(functionOne.apply(10, 4)).thenReturn(14);
        assertEquals(14, functionOne.apply(10,4), 1);
    }

    @Test
    public void functionTwoTestSimple() {
        when(functionTwo.apply(10, 4)).thenReturn(14);
        assertEquals(14, functionTwo.apply(10,4), 1);
    }

    @Test
    public void functionOneVerify() {
        when(functionOne.apply(any(), any())).thenReturn(5);
        assertEquals(functionOne.apply(2,3), 5, 1);

        verify(functionOne).apply(2, 3);
    }

    @Test
    public void functionTwoVerify() {
        when(functionTwo.apply(any(), any())).thenReturn(5);
        assertEquals(functionTwo.apply(2,3), 5, 1);

        verify(functionTwo).apply(2, 3);
    }
}