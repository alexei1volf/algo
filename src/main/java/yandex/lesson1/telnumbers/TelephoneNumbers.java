package yandex.lesson1.telnumbers;

import javax.swing.*;
import java.util.List;

public class TelephoneNumbers
{

    public String[] add(String newNumber, String existingNumbers)
    {
        String[] result = new String[3];
        String[] existingNumbersArr = existingNumbers.split(" ");
        for (int i = 0; i < existingNumbersArr.length; i++) {
            boolean compare = compare(newNumber, existingNumbersArr[i]);
            if (compare) {
                result[i] = "YES";
            } else {
                result[i] = "NO";
            }
        }
        return result;
    }

    private boolean compare(String first, String second) {
        String firstReplaced = replace(first);
        String secondReplaced = replace(second);
        return firstReplaced.equals(secondReplaced);
    }

    private String replace(String number)
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
