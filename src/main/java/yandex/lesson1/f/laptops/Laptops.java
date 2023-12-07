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
        int width1;
        int length1;
        if (a1 > b1) {
            length1 = a1;
            width1 = b1;
        } else {
            length1 = b1;
            width1 = a1;
        }

        int width2;
        int length2;
        if (a2 > b2) {
            length2 = a2;
            width2 = b2;
        } else {
            length2 = b2;
            width2 = a2;
        }

        int maxWidth;
        if (width1 > width2) {
            maxWidth = width1;
        } else {
            maxWidth = width2;
        }

        int totalLength1 = length1 + length2;
        int totalWidth1 = maxWidth;
        int sq1 = totalLength1 * totalWidth1;

        int totalLength2 = length1 + width2;

        int totalWidth2;
        if (maxWidth > length2) {
            totalWidth2 = maxWidth;
        } else {
            totalWidth2 = length2;
        }

        int sq2 = totalLength2 * totalWidth2;

        if (sq1 > sq2) {
            return new int[] {totalLength2, totalWidth2};
        } else {
            return new int[] {totalLength1, totalWidth1};
        }
    }
}
