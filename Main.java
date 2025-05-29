import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};
        for (int x: transformArray(arr)){
            System.out.println(x);
        }
    }

    public static int[] transformArray(int[] nums) {
        int e = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0) e++;
        }


        for(int i=0; i<nums.length; i++){
            if(e>=0){
                nums[i] = 0;
                e--;
            }else{
                nums[i] = 1;
            }
        }

        return nums;

    }

}

