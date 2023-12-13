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

        if (ksq1 <= hsq || ksq2 <= hsq || ksq3 <= hsq) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
