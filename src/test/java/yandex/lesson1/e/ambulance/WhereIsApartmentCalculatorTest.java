package yandex.lesson1.e.ambulance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhereIsApartmentCalculatorTest
{

    private WhereIsApartmentCalculator whereIsApartmentCalculator = new WhereIsApartmentCalculator();

    @Test
    void should_find_apartment()
    {
        int k1 = 9;
        int m = 3;
        int k2 = 3;
        int p2 = 1;
        int n2 = 2;

        String result = whereIsApartmentCalculator.whereIsApartment(k1, m, k2, p2, n2);

        String[] s = result.split(" ");
        Integer p1 = Integer.valueOf(s[0]);
        Integer n1 = Integer.valueOf(s[1]);
        assertEquals(2, p1);
        assertEquals(3, n1);
    }

    @Test
    void should_find_apartment1()
    {
        int k1 = 11;
        int m = 5;
        int k2 = 34;
        int p2 = 2;
        int n2 = 4;

        String result = whereIsApartmentCalculator.whereIsApartment(k1, m, k2, p2, n2);

        String[] s = result.split(" ");
        Integer p1 = Integer.valueOf(s[0]);
        Integer n1 = Integer.valueOf(s[1]);
        assertEquals(1, p1);
        assertEquals(3, n1);
    }

    @Test
    void should_find_apartment2()
    {
        int k1 = 89;
        int m = 20;
        int k2 = 41;
        int p2 = 1;
        int n2 = 11;

        String result = whereIsApartmentCalculator.whereIsApartment(k1, m, k2, p2, n2);

        String[] s = result.split(" ");
        Integer p1 = Integer.valueOf(s[0]);
        Integer n1 = Integer.valueOf(s[1]);
        assertEquals(2, p1);
        assertEquals(3, n1);
    }

    @Test
    void should_find_apartment3()
    {
        int k1 = 20;
        int m = 2;
        int k2 = 10;
        int p2 = 1;
        int n2 = 1;

        String result = whereIsApartmentCalculator.whereIsApartment(k1, m, k2, p2, n2);

        String[] s = result.split(" ");
        Integer p1 = Integer.valueOf(s[0]);
        Integer n1 = Integer.valueOf(s[1]);
        assertEquals(2, p1);
        assertEquals(3, n1);
    }
}