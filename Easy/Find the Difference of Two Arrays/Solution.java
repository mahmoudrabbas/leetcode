class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>(Arrays.stream(nums1).boxed().collect(Collectors.toList()));
        Set<Integer> set2 = new HashSet<>(Arrays.stream(nums2).boxed().collect(Collectors.toList()));

        List<Integer> first = new ArrayList<>();
        for (int x: set1){
            if(!set2.contains(x)){
                first.add(x);
            }
        }

        List<Integer> second = new ArrayList<>();
        for (int x: set2){
            if(!set1.contains(x)){
                second.add(x);
            }
        }

        res.add(first);
        res.add(second);


        return res;

    }
}