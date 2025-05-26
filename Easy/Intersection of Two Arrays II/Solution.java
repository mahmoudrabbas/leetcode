class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> a = IntStream.of(nums1).boxed().collect(Collectors.toList());
        List<Integer> b = IntStream.of(nums2).boxed().collect(Collectors.toList());
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            if(b.contains(a.get(i))){
                res.add(a.get(i));
//                System.out.println(a.get(i));
//                System.out.println("Before =>>>"+b);
                b.remove(b.indexOf(a.get(i)));
//                System.out.println("After =>>>"+b);

            }
        }

        int [] result = new int[res.size()];
        int pointer = 0;
        for (int x: res){
            result[pointer++] = x;
        }

        return result;

    }
}