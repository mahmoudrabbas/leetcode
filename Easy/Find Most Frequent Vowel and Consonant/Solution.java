class Solution {
    public int maxFreqSum(String s) {
        String vowels = "aeiou";
        char [] chars = (s+'{').toCharArray();
        Arrays.sort(chars);
        int maxV = 0;
        int maxC = 0;
        int countOfCurrentChar = 0;

        char currentChar = chars[0];
        //
        for(int i=0; i<chars.length; i++){
            System.out.println("Index: "+i+" and with letter "+chars[i]);
            System.out.println("Is "+chars[i]+" = "+currentChar);
            if(chars[i] == currentChar){
                countOfCurrentChar+=1;
                System.out.println("countOfCurrentChar: "+countOfCurrentChar);
                System.out.println("currentChar: "+currentChar);

            }else{
                System.out.println("Is "+currentChar+" A Vowel: "+ vowels.contains(currentChar+""));
                if(vowels.contains(currentChar+"")){
                    if(countOfCurrentChar > maxV) {
                        maxV = countOfCurrentChar;
                        System.out.println("maV: "+ maxV);
                    }
                }else {
                    if(countOfCurrentChar > maxC){
                        System.out.println(countOfCurrentChar + ": "+ currentChar);
                        maxC = countOfCurrentChar;
                        System.out.println("maxC: "+ maxC);
                    }
                }
                countOfCurrentChar = 1;
                currentChar = chars[i];
            }
        }

        return (maxV+maxC);

    }
}