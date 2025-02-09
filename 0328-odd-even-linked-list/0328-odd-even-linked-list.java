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
    public ListNode oddEvenList(ListNode head) 
    {
        if(head==null || head.next==null)
        {
            return head;
        }

        ListNode slow=head;
        ListNode fast=head.next;
        ListNode newHead=fast;

        while(fast!=null && fast.next!=null)
        {
            slow.next=slow.next.next;
            slow=slow.next;
            fast.next=fast.next.next;
            fast=fast.next;
        }   

        slow.next=newHead;

        return head;


    }
}