package yandex.lesson1.f.laptops;

import java.util.Scanner;

public class Laptops
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int[] tableSize = findTableSize(a1, b1, a2, b2);
        System.out.println(tableSize[0]);
        System.out.println(tableSize[1]);
    }

    public static int[] findTableSize(int a1, int b1, int a2, int b2) {
        int l0 = Math.max(a1, a2);
        int w0 = b1 + b2;
        int sq0 = l0 * w0;

        int l1 = Math.max(a1, b2);
        int w1 = b1 + a2;
        int sq1 = l1 * w1;

        int l2 = Math.max(b1, b2);
        int w2 = a1 + a2;
        int sq2 = l2 * w2;

        int l3 = Math.max(b1, a2);
        int w3 = a1 + b2;
        int sq3 = l3 * w3;

        int sq = sq0;
        int[] res = new int[] {l0, w0};

        if (sq1 < sq) {
            sq = sq1;
            res[0] = l1;
            res[1] = w1;
        }

        if (sq2 < sq) {
            sq = sq2;
            res[0] = l2;
            res[1] = w2;
        }

        if (sq3 < sq) {
            sq = sq3;
            res[0] = l3;
            res[1] = w3;
        }

        return res;

    }
}
