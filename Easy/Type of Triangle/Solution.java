class Solution {
    public String triangleType(int[] nums) {
        int sum = 0;
        for(int x:nums){
            sum+=x;
        }

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int sumOfTwoSides = nums[i]+nums[j];
                if(!(sumOfTwoSides > (sum-sumOfTwoSides))){
                    return "none";
                }
            }
        }


        if(nums[0] == nums[1]){
            if(nums[0] == nums[2]){
                return "equilateral";
            }else{
                return "isosceles";
            }
        }else if(nums[0]==nums[2]){
            return "isosceles";
        }else if(nums[1]==nums[2]){
            return "isosceles";
        }else{
            return "scalene";
        }

    }
}