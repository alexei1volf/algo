package yandex.lesson1.i.castle;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CastleTest
{
    @Test
    void test_checkHole_case1()
    {
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 1;
        int e = 1;

        String result = Castle.checkHole(a, b, c, d, e);

        assertEquals("YES", result);
    }

    @Test
    void test_checkHole_case2()
    {
        int a = 2;
        int b = 2;
        int c = 2;
        int d = 1;
        int e = 1;

        String result = Castle.checkHole(a, b, c, d, e);

        assertEquals("NO", result);
    }

    @Test
    void test_checkHole_my1()
    {
        int a = 2;
        int b = 2;
        int c = 1;
        int d = 1;
        int e = 1;

        String result = Castle.checkHole(a, b, c, d, e);

        assertEquals("NO", result);
    }

    @Test
    void test_checkHole_my2()
    {
        int a = 2;
        int b = 1;
        int c = 1;
        int d = 1;
        int e = 1;

        String result = Castle.checkHole(a, b, c, d, e);

        assertEquals("YES", result);
    }
}