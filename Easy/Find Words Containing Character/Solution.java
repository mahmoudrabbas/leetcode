class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();

        int c = 0;
        for(String str: words){
            if(str.contains(x+"")){
                list.add(c);
            }

            c++;
        }

        return list;
    }
}