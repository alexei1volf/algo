package yandex.lesson1.conditioner;

public class Conditioner
{
    public String getTemp(String tempPair, String mode) {
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
