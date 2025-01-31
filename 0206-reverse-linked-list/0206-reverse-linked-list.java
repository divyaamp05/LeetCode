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
class Solution 
{
    public ListNode reverseList(ListNode head) 
    {
        if(head==null)
        {
            return null;
        }

        if(head.next==null)
        {
            return head;
        }

        ListNode temp=head;

        Stack <Integer> st=new Stack <> ();

        while(temp!=null)
        {
           st.push(temp.val);
           temp=temp.next;
        }
        
        ListNode newHead=new ListNode(st.pop());
        temp=newHead;

        while(!st.isEmpty())
        {
            int x=st.pop();
            temp.next=new ListNode(x);
            temp=temp.next;

        }

        return newHead;


    }
}