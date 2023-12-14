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
        assertEquals(-0.666667, result[1]);
        assertEquals(0.333333, result[2]);
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
        assertEquals(-1, result[1]);
        assertEquals(1, result[2]);
    }
}