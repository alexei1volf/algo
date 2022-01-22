package findnumberwithoutpair;

import lombok.RequiredArgsConstructor;

import java.util.*;

public class NumberWithoutPair {

    private Set<Integer> uniqueSet = new HashSet<>();

    Integer findNumberWithoutPair(List<Integer> numbers) {

        for (Integer number : numbers) {
            if (uniqueSet.contains(number)) {
                uniqueSet.remove(number);
            } else {
                uniqueSet.add(number);
            }
        }

        return uniqueSet.stream().findFirst().orElse(null);
    }

}

