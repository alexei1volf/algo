package yandex.lesson1.a.conditioner;

import java.util.Scanner;

public class Conditioner
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String temp = getTemp(sc.nextLine(), sc.nextLine());
        System.out.println(temp);
    }

    public static String getTemp(String tempPair, String mode) {
        String[] s = tempPair.split(" ");
        String tCurrent = s[0];
        String tExpected = s[1];

        if (mode.equals("fan")) {
            return tCurrent;
        }
        if (mode.equals("auto")) {
            return tExpected;
        }
        if (mode.equals("heat")) {
            int tCurrentInt = Integer.parseInt(tCurrent);
            int tExpectedInt = Integer.parseInt(tExpected);
            if (tCurrentInt < tExpectedInt) {
                return tExpected;
            }
            return tCurrent;
        }
        if (mode.equals("freeze")) {
            int tCurrentInt = Integer.parseInt(tCurrent);
            int tExpectedInt = Integer.parseInt(tExpected);
            if (tCurrentInt > tExpectedInt) {
                return tExpected;
            }
            return tCurrent;
        }
        return "mode is unknown";
    }

}
