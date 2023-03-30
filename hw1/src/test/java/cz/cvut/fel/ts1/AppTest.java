package cz.cvut.fel.ts1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void Factorial_TestingFactorial_Return24() {
        App app = new App();
        int expectedValue = 24;
        int result = app.factorial(4);

        Assertions.assertEquals(expectedValue, result);
    }

}