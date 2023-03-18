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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null || head.next == null) return head;
        int size = 0;
        ListNode temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        ListNode [] arr = new ListNode[size];
        for(int i=0; i<size; i++){
            arr[i] = head;
            head = head.next;
        }

        swap(arr, k-1, arr.length-1-k+1);

        ListNode ans = new ListNode(0);
        ListNode temp1 = ans;

        for(int i=0; i<arr.length; i++){
            ListNode node = arr[i];
            node.next = null;
            temp1.next = node;
            temp1 = temp1.next;
        }

        return ans.next;

    }

    public void swap(ListNode [] arr, int k1, int k2){
        ListNode temp = arr[k1];
        arr[k1] = arr[k2];
        arr[k2] = temp;
    }
}