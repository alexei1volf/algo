package yandex.lesson1.f.laptops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LaptopsTest
{
    @Test
    void test_findTableSize_case1() {
        int a1 = 10;
        int b1 = 2;
        int a2 = 2;
        int b2 = 10;

        int[] result = Laptops.findTableSize(a1, b1, a2, b2);

        int l = result[0];
        int w = result[1];
        assertEquals(20, l);
        assertEquals(2, w);
    }

    @Test
    void test_findTableSize_case2() {
        int a1 = 5;
        int b1 = 7;
        int a2 = 3;
        int b2 = 2;

        int[] result = Laptops.findTableSize(a1, b1, a2, b2);

        int l = result[0];
        int w = result[1];
        assertEquals(9, l);
        assertEquals(5, w);
    }
}