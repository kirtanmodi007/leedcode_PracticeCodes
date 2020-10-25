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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
    {
        //OVERALL TIME COMPLEXITY = O(L1+L2) BECAUSE WE ARE LOOPING THROUGH BOTH LISTS
        //OVERALL SPACE COMPLEXITY = O(L1+L2) BECAUSE WE ARE MERGING BOTH THE LISTS.
        
        //We know that both the lists are sorted.
        
        //Here, if we are done traversing one list, all we have to do is traverse the other one.
        
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        
        ListNode list = new ListNode(-1);
        ListNode temp = list;
        
        //If we reach the end of the any list, we will just terminate our while loop and check the seperate conditions for both lists.
        while(temp1!=null && temp2!=null)
        {
            if(temp1.val > temp2.val)
            {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            else
            {
                temp.next = temp1;
                temp1 = temp1.next;
            }
            
            //IN EITHER OF THE CASE I HAVE TO MOVE MY OUTPUT LIST'S POINTER
            temp = temp.next;
        }
        
        if(temp1==null && temp2!=null)
        {
            while(temp2!=null)
            {
                 temp.next = temp2;
                 temp = temp.next;
                 temp2 = temp2.next;
            }
        }
        
        if(temp2==null && temp1!=null)
        {
            while(temp1!=null)
            {
                 temp.next = temp1;
                temp = temp.next;
                temp1 = temp1.next;
            }
        }
        
        return list.next;
        
    }
}
