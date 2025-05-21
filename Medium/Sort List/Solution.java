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
    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<>();

        while(head!=null){
            list.add(head.val);
            head = head.next;
        }

        Collections.sort(list);
        ListNode res = new ListNode();
        ListNode pointer = res;
        int l = list.size();
        for(int i=0; i< l; i++){
            pointer.next = new ListNode(list.get(i));
            pointer = pointer.next;
        }

        return res.next;

    }
}