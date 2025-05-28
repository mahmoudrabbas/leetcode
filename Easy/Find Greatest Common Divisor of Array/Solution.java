import java.util.Arrays;

class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int c = 1;
        int min = nums[0], max = nums[nums.length - 1];
        for (int i = 1; i <= nums[0]; i++) {
            if (min % i == 0 && max % i == 0) {
                c = i;
            }
        }
        return c;
    }
}