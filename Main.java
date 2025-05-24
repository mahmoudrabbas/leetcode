import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
//        String[] arr = {"abc","bcd","aaaa","cbc"};
        for(int x: findEvenNumbers(new int[]{2,1,3,0})){
            System.out.print(x+" ");
        };
        System.out.println();




    }
    // [2, 1, 3, 0]
    public static int[] findEvenNumbers(int[] digits) {
        List<Integer> list = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();
        for (int digit : digits) {
            map.put(digit, map.getOrDefault(digit, 0) + 1);
        }

        for(int i=100; i<998; i+=2){
            Map<Integer, Integer> temp = new HashMap<>(map);
            String x = i+"";
            int c = 0;
            for(int j=0; j<3; j++){
                int n= Integer.parseInt(""+x.charAt(j));
                if(temp.get(n)!=null && temp.get(n)>0) {
                    c++;
                    temp.put(n, temp.get(n) - 1);
                }
            }
            if(c==3){
                list.add(i);
            }
        }

        int [] res = new int[list.size()];
        int p=0;
        for(int v: list){
            res[p++] = v;
        }


        return res;
    }
}

