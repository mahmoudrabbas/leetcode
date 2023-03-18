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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ans = new ListNode(0);
        ans.next = head;
        Map<Integer, ListNode> map = new HashMap<>();
        ListNode temp = ans;
        for(int i=0; temp!=null; i++){
            map.put(i, temp);
            temp = temp.next;
        }
        map.get(map.size()-n-1).next = map.get(map.size()-n-1).next.next;

        return ans.next;

    }
}