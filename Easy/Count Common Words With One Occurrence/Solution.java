class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for (String x: words1){
            map1.put(x, map1.getOrDefault(x, 0)+1);
        }

        for (String x: words2){
            map2.put(x, map2.getOrDefault(x, 0)+1);
        }

        int count = 0;
        for (String x: words1){
            if(map1.get(x)!=null&&map2.get(x)!=null&&map1.get(x)==1 && map2.get(x)==1){
                count++;
            }
        }

        return count;

    }
}