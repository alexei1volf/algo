package yandex.lesson1.d.equationwithsquareroot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquationWithSquareRootTest
{

    private EquationWithSquareRoot equation = new EquationWithSquareRoot();

    @Test
    void should_return_result1()
    {
        int a = 1;
        int b = 0;
        int c = 0;

        String result = equation.calculate(a, b, c);

        assertEquals(0, Integer.valueOf(result));
    }

    @Test
    void should_return_result2()
    {
        int a = 1;
        int b = 2;
        int c = 3;

        String result = equation.calculate(a, b, c);

        assertEquals(7, Integer.valueOf(result));
    }

    @Test
    void should_return_no_solutions()
    {
        int a = 1;
        int b = 2;
        int c = -3;

        String result = equation.calculate(a, b, c);

        assertEquals("NO SOLUTIONS", result);
    }

    @Test
    void should_return_many_solutions()
    {
        int a = 0;
        int b = 2;
        int c = 3;

        String result = equation.calculate(a, b, c);

        assertEquals("MANY SOLUTIONS", result);
    }
}