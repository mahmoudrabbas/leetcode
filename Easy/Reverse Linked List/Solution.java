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
    public ListNode reverseList(ListNode head) {
        int index = 0;
        int size = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while(head!=null){
            map.put(index++, head.val);
            head = head.next;
            size++;
        }

        head = new ListNode(0);
        ListNode temp = head;
        for(int i=size-1; i>=0; i--){
            temp.next = new ListNode(map.get(i));
            temp = temp.next;
        }

        return head.next;

    }
}