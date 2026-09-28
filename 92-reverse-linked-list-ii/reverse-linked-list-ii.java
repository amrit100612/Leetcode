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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode leftpre = dummy;
        ListNode currnode = head;

        for(int i=0;i<left-1;i++){
            leftpre=leftpre.next;
            currnode=currnode.next;
        }
        ListNode sublistnode = currnode;
        ListNode prenode=null;
        for(int i=0;i<= right-left;i++){
            ListNode nextnode = currnode.next;
            currnode.next=prenode;
            prenode=currnode;
            currnode=nextnode;
        }
        leftpre.next=prenode;
        sublistnode.next=currnode;
        return dummy.next;

    }
}