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
    public int getDecimalValue(ListNode head) 
    {
        ListNode a=  reverse(head);
        int y=1;
        int res=0;

        while(a!=null)
        {
            res=(a.val * y) + res;
            y=y*2;
            a=a.next;
        }

        return res;
    }

    public ListNode reverse(ListNode temp)
    {
        ListNode prev=null;
        ListNode front=null;

        while(temp!=null)
        {
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }

        return prev;
    }
}