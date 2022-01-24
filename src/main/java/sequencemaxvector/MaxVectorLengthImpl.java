package sequencemaxvector;

import java.util.List;

public class MaxVectorLengthImpl implements MaxVectorLength {

    @Override
    public Integer findMaxLength(List<Integer> numbers) {
        Integer maxCounter;
        Integer currentCounter = 0;

        maxCounter = currentCounter;

        for (Integer number : numbers) {
            if (number == 1) {
                currentCounter += 1;
            } else {
                currentCounter = 0;
            }
            if (currentCounter >= maxCounter) {
                maxCounter = currentCounter;
            }
        }

        return maxCounter;
    }
}
