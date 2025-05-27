class Solution {
    public int differenceOfSums(int n, int m) {
        int sum =(int) n*(n+1)/2;

        for(int i=1; i<=n;i++){
            if(i%m==0){
                sum-=i*2;
            }
        }

        return sum;
    }
}