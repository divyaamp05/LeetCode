/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        ListNode t1=headA;
        ListNode t2=headB;

        HashMap <ListNode,Integer> mp =new HashMap <> ();

        while(t1!=null)
        {
            mp.put(t1,1);
            t1=t1.next;
        }

        while(t2!=null)
        {
            if(mp.containsKey(t2))
            {
                return t2;
            }
            t2=t2.next;
        }

        return null;
    }
}