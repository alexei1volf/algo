package squareroot;

public class Square {

    int getSquare(int input) {
        int left = 0;
        int right = input;

        if (input == 1) {
            return input;
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int squareMid = mid * mid;
            if (squareMid == input) {
                return mid;
            }
            if (squareMid > input) {
                right = mid;
            } else {
                left = mid;
            }
        }

        return -1;
    }
}
