class Solution {
    public int compress(char[] chars) {
        if(chars.length == 1) return 1;
        StringBuilder str = new StringBuilder("");

        char ch = chars[0];

        int count = 1;

        for(int i=1; i<chars.length; i++){
            if(ch==chars[i]){
                count++;
            }else{
                if(count==1){
                    str.append(ch+"");
                }else{
                    str.append(ch+""+count);
                }
                ch = chars[i];
                count = 1;
            }
            if(i==chars.length-1){
                if(count==1){
                    str.append(ch+"");
                }else{
                    str.append(ch+""+count);
                }
            }
        }

        for(int i=0; i<str.length(); i++){
            chars[i] = str.charAt(i);
        }

        return str.length();
    }
}