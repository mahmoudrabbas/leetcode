import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

//        String [] strs = {"bella","label","roller"};
        String [] arr1 = {"a","aa","aaa"};
        String [] arr2 = {"b","bb","bbb"};

        int [] arr = {3,3};
        System.out.println(findGCD(arr));
    }

    public static int findGCD(int[] nums) {
        Arrays.sort(nums);

        int min = nums[0];
        int max = nums[nums.length - 1];

        for (int i = min; i <= max; i--) {
            if (max % i == 0 && min % i == 0) {
                return i;
            }
        }

        return -1;
    }

}

