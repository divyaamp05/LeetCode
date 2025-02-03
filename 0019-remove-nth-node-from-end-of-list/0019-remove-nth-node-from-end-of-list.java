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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        ListNode temp=head;
        int cnt=0;

        while(temp!=null)
        {
            cnt++;
            temp=temp.next;
        }

        if(cnt==n)
        {
            return head.next;
        }
        
        int length=cnt-n;
        temp=head;

        while(temp!=null)
        {
            length--;
            if(length==0)
            {
                break;
            }
            temp=temp.next;
        }

        temp.next=temp.next.next;

        return head;
    }
}