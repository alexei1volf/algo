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
        if (c < 0) {
            result.add("NO SOLUTIONS");
            return result;
        }
        if (b == 0 && c == 0) {
            result.add("0");
            return result;
        }

        if (a == 0) {
            result.add("MANY SOLUTIONS");
            return result;
        }

        for (int i = 0; i < Integer.MAX_VALUE; i ++) {
            if ((a * i) + b == c * c) {
               result.add(String.valueOf(i));
            }
        }
        return result;
    }
}
