//import org.junit.Test;
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

    @Test
    public void functionOneTestSimple() {
        when(functionOne.apply(any(), any())).thenReturn(5);
        System.out.println(functionOne.apply(1, 2));
    }

    @Test
    public void functionOneVerify() {
        when(functionOne.apply(any(), any())).thenReturn(5);
        assertEquals(functionOne.apply(2,3), 5, 1);

        verify(functionOne).apply(2, 3);
    }

    @Test
    public void functionTwoTestSimple() {
        when(functionTwo.apply(any(), any())).thenReturn(5);
        System.out.println(functionTwo.apply(1, 2));
    }

    @Test
    public void functionTwoVerify() {
        when(functionTwo.apply(any(), any())).thenReturn(5);
        assertEquals(functionTwo.apply(2,3), 5, 1);

        verify(functionTwo).apply(2, 3);
    }
}