package yandex.lesson1.c.telnumbers;

import javax.swing.*;
import java.util.List;
import java.util.Scanner;

public class TelephoneNumbers
{

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String newNumber = sc.nextLine();
        String[] existingNumbers = new String[3];
        existingNumbers[0] = sc.nextLine();
        existingNumbers[1] = sc.nextLine();
        existingNumbers[2] = sc.nextLine();
        String[] result = add(newNumber, existingNumbers);
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
    }

    public static String[] add(String newNumber, String[] existingNumbers)
    {
        String[] result = new String[3];
        for (int i = 0; i < existingNumbers.length; i++) {
            boolean compare = compare(newNumber, existingNumbers[i]);
            if (compare) {
                result[i] = "YES";
            } else {
                result[i] = "NO";
            }
        }
        return result;
    }

    private static boolean compare(String first, String second) {
        String firstReplaced = replace(first);
        String secondReplaced = replace(second);
        return firstReplaced.equals(secondReplaced);
    }

    private static String replace(String number)
    {
        String numberReplaced = number.replace("-", "").replace("(", "").replace(")", "");
        if (numberReplaced.length() == 7) {
            numberReplaced = "8495" + numberReplaced;
        }

        if (numberReplaced.startsWith("+7")) {
            numberReplaced = numberReplaced.substring(2);
        } else if (numberReplaced.startsWith("8")) {
            numberReplaced = numberReplaced.substring(1);
        }

        return numberReplaced;
    }
}
