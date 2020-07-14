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
public class Solution 
{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB)
    {
        //You can do one thing, you can create a new Hashset and put, Node into it, when you get the same node just return that node.
        
        HashSet<ListNode> mySet = new HashSet<ListNode>();
        
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        
        while(temp1!=null)
        {
            mySet.add(temp1);
            temp1 = temp1.next;
        }
        
        while(temp2!=null)
        {
            if(mySet.contains(temp2))
            {
                return temp2;
            }
            
            mySet.add(temp2);
            temp2 = temp2.next;
            
        }
        
        return null;
    }
}
