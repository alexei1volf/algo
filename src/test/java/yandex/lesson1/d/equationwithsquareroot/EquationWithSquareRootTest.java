package yandex.lesson1.d.equationwithsquareroot;

import org.junit.jupiter.api.Test;

import java.util.List;

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

        List<String> result = equation.calculate(a, b, c);

        assertEquals(0, Integer.valueOf(result.get(0)));
    }

    @Test
    void should_return_result2()
    {
        int a = 1;
        int b = 2;
        int c = 3;

        List<String> result = equation.calculate(a, b, c);

        assertEquals(7, Integer.valueOf(result.get(0)));
    }

    @Test
    void should_return_no_solution_c_is_neg()
    {
        int a = 1;
        int b = 2;
        int c = -3;

        List<String> result = equation.calculate(a, b, c);

        assertEquals("NO SOLUTION", result.get(0));
    }

    @Test
    void should_return_all_zero()
    {
        int a = 0;
        int b = 0;
        int c = 0;

        List<String> result = equation.calculate(a, b, c);

        assertEquals("MANY SOLUTIONS", result.get(0));
    }

    @Test
    void should_return_no_solution_a_is_zero()
    {
        int a = 0;
        int b = 3;
        int c = 4;

        List<String> result = equation.calculate(a, b, c);

        assertEquals("NO SOLUTION", result.get(0));
    }

    @Test
    void should_return_no_solution()
    {
        int a = 10;
        int b = 3;
        int c = 4;

        List<String> result = equation.calculate(a, b, c);

        assertEquals("NO SOLUTION", result.get(0));
    }

}