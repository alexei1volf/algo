package yandex.lesson1.b.triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest
{
    private Triangle trio = new Triangle();

    @Test
    void should_return_YES() {
        int a = 3;
        int b = 4;
        int c = 5;

        String result = trio.validate(a, b, c);

        assertEquals("YES", result);
    }

    @Test
    void should_return_NO() {
        int a = 10;
        int b = 1;
        int c = 20;

        String result = trio.validate(a, b, c);

        assertEquals("NO", result);
    }

    @Test
    void should_return_NO_zero() {
        int a = 10;
        int b = 1;
        int c = 0;

        String result = trio.validate(a, b, c);

        assertEquals("NO", result);
    }

    @Test
    void should_return_NO_equals() {
        int a = 10;
        int b = 10;
        int c = 10;

        String result = trio.validate(a, b, c);

        assertEquals("YES", result);
    }
}