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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        Queue<ListNode> q1 = new LinkedList<>();
        Queue<ListNode> q2 = new LinkedList<>();

        while(head!=null){
            q2.offer(head);
            head = head.next;
            if(head==null) break;
            q1.offer(head);
            head = head.next;
        }
        ListNode ans = new ListNode(0);
        ListNode temp = ans;

        while(!q2.isEmpty()){
            if(!q1.isEmpty()){
                ListNode node1 = q1.poll();
                node1.next = null;
                temp.next = node1;
                temp = temp.next;
            }

            if(!q2.isEmpty()){
                ListNode node2 = q2.poll();
                node2.next = null;
                temp.next = node2;
                temp = temp.next;
            }
        }

        return ans.next;

    }
}