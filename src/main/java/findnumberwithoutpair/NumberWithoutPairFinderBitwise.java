package findnumberwithoutpair;

import java.util.List;

public class NumberWithoutPairFinderBitwise implements NumberWithoutPairFinder {

    @Override
    public Integer findNumberWithoutPair(List<Integer> numbers) {
        return numbers.stream().reduce((a, b) -> a ^ b).orElse(null);
    }
}
