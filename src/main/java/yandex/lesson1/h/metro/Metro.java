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

        if (interval.length > 1) {
            System.out.println(interval[0]);
            System.out.println(interval[1]);
        } else {
            System.out.println(interval[0]);
        }
    }

    public static int[] findInterval(int a, int b, int n, int m) {
        int min1 = n + (n - 1) * a;
        int min2 = m + (m - 1) * b;
        int min = Math.max(min1, min2);

        int max1 = min1 + 2 * a;
        int max2 = min2 + 2 * b;
        int max = Math.min(max1, max2);

        if (min > max) {
            return new int[] {-1};
        }

        return new int[] {min, max};
    }

}
