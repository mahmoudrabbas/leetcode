class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int [] newArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newArr[i] = nums[i];
        }

        Arrays.sort(newArr);

        LinkedList<Integer> arr = new LinkedList<>();

        int stop = newArr.length-k-1;

        for(int i=newArr.length-1; i>stop; i--){
            arr.addFirst(newArr[i]);
        }

        int [] res = new int[k];
        int c =0;

        for (int i = 0; i < nums.length; i++) {
            if(arr.contains(nums[i])){
                res[c++] = nums[i];
                arr.removeFirstOccurrence(nums[i]);
                if(c==k) break;
            }
        }

        return res;

    }
}