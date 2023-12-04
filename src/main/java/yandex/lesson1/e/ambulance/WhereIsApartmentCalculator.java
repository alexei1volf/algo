package yandex.lesson1.e.ambulance;

public class WhereIsApartmentCalculator
{

    public String whereIsApartment(int k1, int m, int k2, int p2, int n2) {
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

        return p1 + " " + n1;

    }


}
