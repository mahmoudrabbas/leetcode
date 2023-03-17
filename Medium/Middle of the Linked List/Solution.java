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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int index =0;
        Map<Integer, ListNode> map = new HashMap<>();
        while(temp!=null){
            map.put(index++, temp);
            temp = temp.next;
        }


        return map.get(map.size()/2);

    }
}