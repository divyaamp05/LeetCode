/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) 
    {
        ListNode temp=head;
        HashMap <ListNode,Integer> mp=new HashMap <> ();

        while(temp!=null)
        {
            if(mp.containsKey(temp))
            {
                return temp;
            }

            mp.put(temp,1);
            temp=temp.next;
        }

        return null;
    }
}