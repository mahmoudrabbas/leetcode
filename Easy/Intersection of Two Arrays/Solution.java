class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for (int x: nums1) set.add(x);
        for (int x:nums2){
            if(set.contains(x)){
                res.add(x);
            }
        }

        int [] result = new int[res.size()];
        int idx = 0;
        for (int x: res){
            result[idx++] = x;
        }

        return result;

    }
}