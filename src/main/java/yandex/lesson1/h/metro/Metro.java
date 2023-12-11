package yandex.lesson1.h.metro;

import java.util.Scanner;

public class Metro
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] interval = findInterval(a, b, n, m);
        System.out.println(interval[0]);
        System.out.println(interval[1]);
    }

    public static int[] findInterval(int a, int b, int n, int m) {
        int i1 = (a * n) + (n - 1);
        int i2 = (b * m) + (m - 1);

        int p2 = m + (m - 1) * b;
        if (i1 < p2) {
            return new int[] {-1};
        }

        int p1 = n + (n - 1) * a;
        if (i2 < p1) {
            return new int[] {-1};
        }

        int min = Math.min(i1, i2);
        int max = Math.max(i1, i2);
        return new int[] {min, max};
    }

}
