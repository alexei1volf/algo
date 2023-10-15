package twosum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest
{
    private Solution solution = new Solution();

    @Test
    void twoSum_firstCase()
    {
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] result = solution.twoSum(nums, target);

        int[] expected = {0,1};
        assertThat(result).containsExactlyInAnyOrder(expected);
    }

    @Test
    void twoSum_secondCase()
    {
        int[] nums = {3,2,4};
        int target = 6;

        int[] result = solution.twoSum(nums, target);

        int[] expected = {1,2};
        assertThat(result).containsExactlyInAnyOrder(expected);
    }

    @Test
    void twoSum_thirdCase()
    {
        int[] nums = {3,3};
        int target = 6;

        int[] result = solution.twoSum(nums, target);

        int[] expected = {0,1};
        assertThat(result).containsExactlyInAnyOrder(expected);
    }
}