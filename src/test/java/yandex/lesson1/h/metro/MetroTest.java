package yandex.lesson1.h.metro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MetroTest
{

    @Test
    void test_findInterval_my1()
    {
        int a = 1;
        int b = 2;
        int n = 2;
        int m = 1;

        int[] interval = Metro.findInterval(a, b, n, m);

        assertEquals(3, interval[0]);
        assertEquals(5, interval[1]);
    }

    @Test
    void test_findInterval_my2()
    {
        int a = 2;
        int b = 3;
        int n = 3;
        int m = 2;

        int[] interval = Metro.findInterval(a, b, n, m);

        assertEquals(7, interval[0]);
        assertEquals(11, interval[1]);
    }

    @Test
    void test_findInterval_my22()
    {
        int a = 3;
        int b = 2;
        int n = 2;
        int m = 3;

        int[] interval = Metro.findInterval(a, b, n, m);

        assertEquals(7, interval[0]);
        assertEquals(11, interval[1]);
    }

    @Test
    void test_findInterval_case1()
    {
        int a = 1;
        int b = 3;
        int n = 3;
        int m = 2;

        int[] interval = Metro.findInterval(a, b, n, m);

        assertEquals(5, interval[0]);
        assertEquals(7, interval[1]);
    }

    @Test
    void test_findInterval_case1_my()
    {
        int a = 3;
        int b = 1;
        int n = 2;
        int m = 3;

        int[] interval = Metro.findInterval(a, b, n, m);

        assertEquals(5, interval[0]);
        assertEquals(7, interval[1]);
    }

    @Test
    void test_findInterval_case2()
    {
        int a = 1;
        int b = 5;
        int n = 1;
        int m = 2;

        int[] interval = Metro.findInterval(a, b, n, m);

        assertEquals(-1, interval[0]);
    }

    @Test
    void test_findInterval_case2_my()
    {
        int a = 5;
        int b = 1;
        int n = 2;
        int m = 1;

        int[] interval = Metro.findInterval(a, b, n, m);

        assertEquals(-1, interval[0]);
    }

    @Test
    void test_findInterval_case3()
    {
        int a = 3;
        int b = 2;
        int n = 7;
        int m = 11;

        int[] interval = Metro.findInterval(a, b, n, m);

        assertEquals(31, interval[0]);
        assertEquals(31, interval[1]);
    }
}