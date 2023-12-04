package yandex.lesson1.b.triangle;

import java.util.Scanner;

public class Triangle
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(validate(a, b, c));
    }

    static String validate(int a, int b, int c) {
        boolean isValid = (a < b + c) && (a > Math.abs(b - c));
        if (isValid) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
