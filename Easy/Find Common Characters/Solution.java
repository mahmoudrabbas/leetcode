class Solution {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();

        if(words.length==1){
            result = Arrays.asList(words[0].split(""));
            return result;
        }


        for (int i = 0; i <words[0].length(); i++) {
            int count = 0;
            char y = '0';
            for (int j = 1; j < words.length; j++) {
                y = words[0].charAt(i);
                if(words[j].contains(y+"")){
                    words[j] = words[j].replaceFirst(y+"", "_");
                    count++;
                }
            }
            if (count==words.length-1){
                result.add(y+"");
            }
        }



        return result;


    }
}