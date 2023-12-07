package yandex.lesson1.e.ambulance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhereIsApartmentCalculatorTest
{

    private WhereIsApartmentCalculator whereIsApartmentCalculator = new WhereIsApartmentCalculator();

    @Test
    void should_find_apartment_case1()
    {
        int k1 = 89;
        int m = 20;
        int k2 = 41;
        int p2 = 1;
        int n2 = 11;

        int[] result = whereIsApartmentCalculator.whereIsApartment(k1, m, k2, p2, n2);

        int p1 = result[0];
        int n1 = result[1];
        assertEquals(2, p1);
        assertEquals(3, n1);
    }

    @Test
    void should_find_apartment_case1_my()
    {
        int k1 = 89;
        int m = 20;
        int k2 = 172;
        int p2 = 3;
        int n2 = 3;

        int[] result = whereIsApartmentCalculator.whereIsApartment(k1, m, k2, p2, n2);

        int p1 = result[0];
        int n1 = result[1];
        assertEquals(2, p1);
        assertEquals(3, n1);
    }

    @Test
    void should_find_apartment_case2()
    {
        int k1 = 11;
        int m = 1;
        int k2 = 1;
        int p2 = 1;
        int n2 = 1;

        int[] result = whereIsApartmentCalculator.whereIsApartment(k1, m, k2, p2, n2);

        int p1 = result[0];
        int n1 = result[1];
        assertEquals(0, p1);
        assertEquals(1, n1);
    }

    @Test
    void should_find_apartment_case3()
    {
        int k1 = 3;
        int m = 2;
        int k2 = 2;
        int p2 = 2;
        int n2 = 1;

        int[] result = whereIsApartmentCalculator.whereIsApartment(k1, m, k2, p2, n2);

        int p1 = result[0];
        int n1 = result[1];
        assertEquals(-1, p1);
        assertEquals(-1, n1);
    }

}