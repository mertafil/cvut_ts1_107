package cz.cvut.fel.ts1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    public void calculatorSetup() {
        calculator = new Calculator();
    }

    @Test
    public void add_AddNumbers_Equals13() {
        int excepted = 13;
        int result = calculator.add(7, 6);

        Assertions.assertEquals(excepted, result);
    }

    @Test
    public void subtract_SubtractNumbers_Equals3() {
        int excepted = 3;
        int result = calculator.subtract(13, 10);

        Assertions.assertEquals(excepted, result);
    }

    @Test
    public void multiply_MultiplyNumbers_Equals18() {
        int excepted = 18;
        int result = calculator.multiply(6, 3);

        Assertions.assertEquals(excepted, result);
    }

    @Test
    public void divide_DivideNumbers_Equals7() {
        int excepted = 7;
        int result = calculator.divide(21, 3);

        Assertions.assertEquals(excepted, result);
    }

    @Test
    void divide_DivideNumbers_throwsException() {
        Assertions.assertThrows(
                Exception.class,
                () -> calculator.divide(6, 0)
        );
    }
}
