package yandex.lesson1.d.equationwithsquareroot;

public class EquationWithSquareRoot
{
    public String calculate(int a, int b, int c) {
        if (c < 0) {
            return "NO SOLUTIONS";
        }
        if (a == 0) {
            return "MANY SOLUTIONS";
        }

        int result = ((c * c) - b) / a;
        return String.valueOf(result);
    }
}
