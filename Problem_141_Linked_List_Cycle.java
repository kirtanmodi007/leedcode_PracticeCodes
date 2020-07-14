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
public class Solution 
{
    public boolean hasCycle(ListNode head) 
    {
        Set<ListNode> mySet = new HashSet<ListNode>();
        
            ListNode temp = head;
            
        //This simply means ke taro last node pan, linked list na koi k node ne refer kare 6e.
            while(temp!=null)
            {
                
                if(mySet.contains(temp))
                {
                    return true;
                }
                else
                {
                    mySet.add(temp);
                }
                
                temp = temp.next;
        }
        
        return false;
    }
}
