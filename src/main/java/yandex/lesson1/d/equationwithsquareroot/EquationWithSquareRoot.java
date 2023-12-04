package yandex.lesson1.d.equationwithsquareroot;

import java.util.Scanner;

public class EquationWithSquareRoot
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(calculate(a, b, c));
    }

    public static String calculate(int a, int b, int c) {
        if (c < 0) {
            return "NO SOLUTIONS";
        }
        if (b == 0 && c == 0) {
            return "0";
        }

        if (a == 0) {
            return "MANY SOLUTIONS";
        }

        int result = ((c * c) - b) / a;
        return String.valueOf(result);
    }
}
