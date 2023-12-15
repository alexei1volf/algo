package yandex.lesson1.j.linear2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Linear2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        Number[] result = calcResult(a, b, c, d, e, f);
        if (result.length == 1) {
            System.out.println(result[0]);
        }
        if (result.length == 2) {
            System.out.println(result[0]);
            System.out.println(result[1]);
        }
        if (result.length == 3) {
            System.out.println(result[0]);
            System.out.println(result[1]);
            System.out.println(result[2]);
        }

    }

    public static Number[] calcResult(int a, int b, int c, int d, int e, int f)
    {
        if (a == 0 && b == 0 && c == 0 && d == 0 && e ==0 && f == 0) {
            return new Number[] {5};
        }
        if (a == 0 && c == 0) {
            if (b == 0) {
                return new Number[] {0};
            }
            double y = (double) e / (double) b;
            return new Number[] {4, y};
        }

        if (b == 0 && d == 0) {
            if (a == 0) {
                return new Number[] {0};
            }
            double x = (double) e / (double) a;
            return new Number[] {3, x};
        }

        double k1 = (double) -a / (double) b;
        double m1 = (double) e / (double) b;

        double k2 = (double) - c / (double) d;
        double m2 = (double) f / (double) d;

        if (k1 == k2 && m1 == m2) {
            if (k1 % 1 == 0 || m1 % 1 == 0)
            {
                int k = Double.valueOf(k1).intValue();
                int m = Double.valueOf(m1).intValue();
                return new Number[] {1, k, m};
            } else {
                double k = Math.floor(k1 * 1e6) / 1e6;
                double m = Math.floor(m1 * 1e6) / 1e6;
                return new Number[] {1, k, m};
            }
        }

        int x = ((e * d) - (b * f)) / ((a * d) - (c * b));
        int y = (f - (c * x)) / d;

        return new Number[] {2, x, y};

    }
}
