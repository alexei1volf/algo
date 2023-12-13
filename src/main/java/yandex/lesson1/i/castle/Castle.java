package yandex.lesson1.i.castle;

import java.util.Scanner;

public class Castle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        String result = checkHole(a, b, c, d, e);
        System.out.println(result);
    }

    public static String checkHole(int a, int b, int c, int d, int e) {
        int ksq1 = a * b;
        int ksq2 = b * c;
        int ksq3 = a * c;
        int hsq = d * e;
        int hmin = Math.min(d, e);

        if (ksq1 <= hsq) {
            int kmin = Math.min(a, b);
            if (kmin <= hmin) {
                return "YES";
            }
        }

        if (ksq2 <= hsq) {
            int kmin = Math.min(b, c);
            if (kmin <= hmin) {
                return "YES";
            }
        }

        if (ksq3 <= hsq) {
            int kmin = Math.min(a, c);
            if (kmin <= hmin) {
                return "YES";
            }
        }

        return "NO";
    }
}
