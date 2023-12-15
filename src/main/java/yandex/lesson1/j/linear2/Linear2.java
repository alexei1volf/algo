package yandex.lesson1.j.linear2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Linear2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        double c = Double.parseDouble(sc.nextLine());
        double d = Double.parseDouble(sc.nextLine());
        double e = Double.parseDouble(sc.nextLine());
        double f = Double.parseDouble(sc.nextLine());
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

    public static Number[] calcResult(double a, double b, double c, double d, double e, double f)
    {
        if (a == 0 && b == 0 && c == 0 && d == 0 && e ==0 && f == 0) {
            return new Number[] {5};
        }
        if (a == 0 && c == 0) {
            if (b == 0) {
                return new Number[] {0};
            }
            double y = (double) e / (double) b;
            return new Number[] {4, formatNumber(y)};
        }

        if (b == 0 && d == 0) {
            if (a == 0) {
                return new Number[] {0};
            }
            double x = e / a;
            return new Number[] {3, formatNumber(x)};
        }

        double k1 = -a / b;
        double m1 = e / b;

        double k2 = - c / d;
        double m2 = f / d;

        if (k1 == k2 && m1 == m2) {
            return new Number[] {1, formatNumber(k1), formatNumber(m1)};
        }

        double de = (e * d) - (b * f);
        double zn = (a * d) - (c * b);
        if (zn == 0) {
            return new Number[] {0};
        }
        double x = de / zn;

        double y;
        if (d == 0) {
            y = (e - (a * x)) / b;
        } else {
            y = (f - (c * x)) / d;
        }

        return new Number[] {2, formatNumber(x), formatNumber(y)};

    }

    public static Number formatNumber(Number number) {
        if (number.doubleValue() % 1 == 0)
        {
            return number.intValue();
        } else {
            BigDecimal instance = BigDecimal.valueOf(number.doubleValue());
            instance = instance.setScale(5, RoundingMode.HALF_UP);
            return instance.doubleValue();
        }
    }
}
