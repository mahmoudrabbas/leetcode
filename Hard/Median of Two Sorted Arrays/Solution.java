class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] nums = new int[nums1.length+nums2.length];
        int a = 0;
        int b = 0;
        for (int i = 0; i < nums.length; i++) {
            if(a==nums1.length){
                nums[i]= nums2[b++];
            } else if (b==nums2.length) {
                nums[i]= nums1[a++];
            } else if (nums1[a] >= nums2[b]) {
                nums[i]= nums2[b++];
            }else if (nums1[a] <= nums2[b]) {
                nums[i]= nums1[a++];
            }
        }

        if(nums.length%2!=0){
            return (double) nums[nums.length/2];
        }else {
            return (double) (nums[nums.length/2]+nums[nums.length/2 -1])/2;
        }
    }
}