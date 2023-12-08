package yandex.lesson1.g.details;

import org.junit.jupiter.api.Test;
import yandex.lesson1.f.laptops.Laptops;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DetailsTest
{

    @Test
    void test_findDetails_case1() {
        int n = 10;
        int k = 5;
        int m = 2;

        int result = Details.findDetails(n, k, m);

        assertEquals(4, result);
    }

    @Test
    void test_findDetails_case2() {
        int n = 13;
        int k = 5;
        int m = 3;

        int result = Details.findDetails(n, k, m);

        assertEquals(3, result);
    }

    @Test
    void test_findDetails_case3() {
        int n = 14;
        int k = 5;
        int m = 3;

        int result = Details.findDetails(n, k, m);

        assertEquals(4, result);
    }

    @Test
    void test_findDetails_case14() {
        int n = 30;
        int k = 5;
        int m = 7;

        int result = Details.findDetails(n, k, m);

        assertEquals(0, result);
    }

    @Test
    void test_findDetails_case14_my() {
        int n = 10;
        int k = 20;
        int m = 5;

        int result = Details.findDetails(n, k, m);

        assertEquals(0, result);
    }
}