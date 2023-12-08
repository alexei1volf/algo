package yandex.lesson1.g.details;

import java.util.Scanner;

public class Details
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int m = sc.nextInt();
        int num = findDetails(n, k, m);
        System.out.println(num);
    }

    public static int findDetails(int n, int k, int m) {
        int met = n;
        int det = 0;

        if (m > k) {
            return det;
        }

        while (met / k > 0) {
            int met1 = met % k;
            int zag = met / k;

            int met2 = (k % m) * zag;
            det = det + ((k / m) * zag);
            met = met1 + met2;
        }

        return det;
    }
}
