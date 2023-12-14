package yandex.lesson1.j.linear2;

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
        if (a == b && c == d) {
            int k = - a / a;
            int m = e / a;
            return new Number[] {1, k, m};
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

        int de = (d * f) - (e * b);
        int zn = (c * d) - (a * b);
        if (zn == 0) {
            zn = 1;
        }
        int x = de / zn;

        de = (a * e) - (c * f);
        zn = (b * a) - (d * c);
        if (zn == 0) {
            zn = 1;
        }
        int y = de / zn;

        return new Number[] {2, x, y};

    }
}
