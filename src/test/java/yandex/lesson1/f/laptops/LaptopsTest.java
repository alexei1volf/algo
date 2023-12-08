package yandex.lesson1.f.laptops;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

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

        int[] r1 = new int[] {20, 2};
        int[] r2 = new int[] {2, 20};
        int[] r3 = new int[] {4, 10};
        int[] r4 = new int[] {10, 4};
        assertTrue(Arrays.equals(result, r1) || Arrays.equals(result, r2) || Arrays.equals(result, r3) || Arrays.equals(result, r4));
    }

    @Test
    void test_findTableSize_case2() {
        int a1 = 5;
        int b1 = 7;
        int a2 = 3;
        int b2 = 2;

        int[] result = Laptops.findTableSize(a1, b1, a2, b2);

        int[] r1 = new int[] {9, 5};
        int[] r2 = new int[] {5, 9};
        assertTrue(Arrays.equals(result, r1) || Arrays.equals(result, r2));
    }

    @Test
    void test_findTableSize_case2_my() {
        int a1 = 3;
        int b1 = 2;
        int a2 = 5;
        int b2 = 7;

        int[] result = Laptops.findTableSize(a1, b1, a2, b2);

        int[] r1 = new int[] {9, 5};
        int[] r2 = new int[] {5, 9};
        assertTrue(Arrays.equals(result, r1) || Arrays.equals(result, r2));
    }

    @Test
    void test_findTableSize_case3() {
        int a1 = 3;
        int b1 = 5;
        int a2 = 4;
        int b2 = 6;

        int[] result = Laptops.findTableSize(a1, b1, a2, b2);

        int[] r1 = new int[] {6, 7};
        int[] r2 = new int[] {7, 6};
        assertTrue(Arrays.equals(result, r1) || Arrays.equals(result, r2));
    }

}