package yandex.lesson1.e.ambulance;

import java.util.List;
import java.util.Scanner;

public class WhereIsApartmentCalculator
{

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int k1 = sc.nextInt();
        int m = sc.nextInt();
        int k2 = sc.nextInt();
        int p2 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] p1_n1 = whereIsApartment(k1, m, k2, p2, n2);
        System.out.println(p1_n1[0]);
        System.out.println(p1_n1[1]);
    }

    /*public static int[] whereIsApartment(int k1, int m, int k2, int p2, int n2) {
        int appOnFlat = 0;
        int calcApp = 1;

        while (calcApp <= k2) {
            appOnFlat ++;
            int before = appOnFlat * m * (p2 - 1);
            int current = appOnFlat * n2;
            calcApp = before + current;
        }

        int p1 = k1 / (appOnFlat * m) + 1;


        int numBefore = k1 - (appOnFlat * m) * (p1 - 1);
        int n1 = ((numBefore / appOnFlat) + 1);

        return new int[] { p1, n1 };

    }*/

    public static int[] whereIsApartment(int k1, int m, int k2, int p2, int n2) {
        int p1 = 0;
        int n1 = 0;

        for (n1 = 1; n1 <= 1000000; n1++) {
            for (p1 = 1; p1 <= 1000000; p1++)
            {
                int appOnFlatCalc;
                if (n1 == 1)
                {
                    appOnFlatCalc = k1 / n1;
                } else
                {
                    appOnFlatCalc = k1 / ((m * (p1 - 1)) + n1);
                }

                int i1;
                double i11;
                if (p2 == 1)
                {
                    i11 = (double) k2 / (double) n2;
                } else
                {
                    i11 = (double) k2 / (double) ((m * (p2 - 1)) + n2);
                }
                i1 = Math.toIntExact(Math.round(i11));

            }
        }

        return new int[] { p1, n1 };
    }


}
