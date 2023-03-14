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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return new ListNode().next;
        int [] arr = {};

        int index = 0;
        for(int i=0; i<lists.length; i++){
            ListNode list = lists[i];
            while(list!=null){
                arr = Arrays.copyOf(arr, arr.length+1);
                arr[index++] = list.val;
                list = list.next;
            }
        }

        Arrays.sort(arr);

        ListNode ans = new ListNode();
        ListNode temp = ans;

        for(int i=0; i<arr.length;i++){
            ListNode node = new ListNode(arr[i]);
            temp.next = node;
            temp = temp.next;
        }

        return ans.next;
    }
}