/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        Map<Integer, ListNode> map = new HashMap<>();
        int index = 0;
        int n = 0;
        while(head!=null){
            map.put(index++, head);
            head = head.next;
            n++;
        }

        int max = Integer.MIN_VALUE;

        for(int i=0; i<map.size()/2; i++){
            int sum = map.get(i).val+map.get(n-1-i).val;
            if(sum>max){
                max = sum;
            }
        }

        return max;
    }
}