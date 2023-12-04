package yandex.lesson1.d.equationwithsquareroot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EquationWithSquareRoot
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        List<String> calculate = calculate(a, b, c);
        for (String s : calculate)
        {
            System.out.println(s);
        }
    }

    public static List<String> calculate(int a, int b, int c) {
        List<String> result = new ArrayList<>();
        if (a > 0 && b > 0 && c < 0) {
            result.add("NO SOLUTION");
            return result;
        }
        if (a == 0) {
            result.add("MANY SOLUTIONS");
            return result;
        }

        int x = ((c * c) - b) / a;
        result.add(String.valueOf(x));

        return result;
    }
}
