package yandex.lesson1.j.linear2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Linear2Test
{
    @Test
    void test_calcResult_case1()
    {
        int a = 1;
        int b = 0;
        int c = 0;
        int d = 1;
        int e = 3;
        int f = 3;

        Number[] result = Linear2.calcResult(a, b, c, d, e, f);

        assertEquals(2, result[0]);
        assertEquals(3, result[1]);
        assertEquals(3, result[2]);
    }

    @Test
    void test_calcResult_case2()
    {
        int a = 1;
        int b = 1;
        int c = 2;
        int d = 2;
        int e = 1;
        int f = 2;

        Number[] result = Linear2.calcResult(a, b, c, d, e, f);

        assertEquals(1, result[0]);
        assertEquals(-1, result[1]);
        assertEquals(1, result[2]);
    }

    @Test
    void test_calcResult_case3()
    {
        int a = 0;
        int b = 2;
        int c = 0;
        int d = 4;
        int e = 1;
        int f = 2;

        Number[] result = Linear2.calcResult(a, b, c, d, e, f);

        assertEquals(4, result[0]);
        assertEquals(0.5, result[1]);
    }

    @Test
    void test_calcResult_case4()
    {
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 6;
        int e = 1;
        int f = 2;

        Number[] result = Linear2.calcResult(a, b, c, d, e, f);

        assertEquals(1, result[0]);
        assertEquals(-0.66667, result[1]);
        assertEquals(0.33333, result[2]);
    }

    @Test
    void test_calcResult_case7()
    {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = -1;
        int f = -1;

        Number[] result = Linear2.calcResult(a, b, c, d, e, f);

        assertEquals(2, result[0]);
        assertEquals(1, result[1]);
        assertEquals(-1, result[2]);
    }

    @Test
    void test_calcResult_case8()
    {
        int a = 3;
        int b = 5;
        int c = 4;
        int d = 4;
        int e = 11;
        int f = 12;

        Number[] result = Linear2.calcResult(a, b, c, d, e, f);

        assertEquals(2, result[0]);
        assertEquals(2, result[1]);
        assertEquals(1, result[2]);
    }

    @Test
    void test_calcResult_case10()
    {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;

        Number[] result = Linear2.calcResult(a, b, c, d, e, f);

        assertEquals(5, result[0]);
    }

    @Test
    void test_calcResult_case11()
    {
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 6;
        int e = 1;
        int f = 1;

        Number[] result = Linear2.calcResult(a, b, c, d, e, f);

        assertEquals(0, result[0]);
    }

    @Test
    void test_calcResult_case14()
    {
        int a = 8;
        int b = -3;
        int c = 2;
        int d = -3;
        int e = -5;
        int f = 6;

        Number[] result = Linear2.calcResult(a, b, c, d, e, f);

        assertEquals(2, result[0]);
        assertEquals(-1.83333, result[1]);
        assertEquals(-3.22222, result[2]);
    }
}