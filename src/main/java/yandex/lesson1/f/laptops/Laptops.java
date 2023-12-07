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
        int minWidth;
        if (width1 > width2) {
            maxWidth = width1;
            minWidth = width2;
        } else {
            maxWidth = width2;
            minWidth = width1;
        }

        int maxLength;
        int minLength;
        if (length1 > length2) {
            maxLength = length1;
            minLength = length2;
        } else {
            maxLength = length2;
            minLength = length1;
        }

        int totalLength1 = length1 + length2;
        int totalWidth1 = maxWidth;
        int sq1 = totalLength1 * totalWidth1;

        int totalLength2 = maxLength + minWidth;
        int totalWidth2;
        if (maxWidth > minLength) {
            totalWidth2 = maxWidth;
        } else {
            totalWidth2 = minLength;
        }

        int sq2 = totalLength2 * totalWidth2;

        if (sq1 > sq2) {
            return new int[] {totalLength2, totalWidth2};
        } else {
            return new int[] {totalLength1, totalWidth1};
        }
    }
}
