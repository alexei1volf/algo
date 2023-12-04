package yandex.lesson1.b.triangle;

public class Triangle
{
    String validate(int a, int b, int c) {
        boolean isValid = (a < b + c) && (a > Math.abs(b - c));
        if (isValid) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
