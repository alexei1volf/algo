package squareroot;

public class Square {

    int getSquare(int input) {
        int res = input;
        while (res * res >= input) {
            if (res * res > input) {
                res = res / 2;
            } else {
                res = res - 1;
            }
        }
        return res;
    }
}
