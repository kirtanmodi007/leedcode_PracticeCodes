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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        //OVERALL TIME COMPLEXITY = O(MAX(L1.SIZE(),L2.SIZE())) THIS SIMPLY MEANS THAT WHICHEVER LIST IS LARGER WILL CONTRIBUTE TOWARDS THE TIME COMPLEXITY.
       //OVERALL SPACE COMPLEXITY = O(MAX(L1.SIZE(),L2.SIZE())) THIS SIMPLY MEANS THAT WHICHEVER LIST IS LARGER WILL CONTRIBUTE TOWARDS THE SPACE COMPLEXITY.
        
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        
        ListNode list = new ListNode(-1);
        ListNode temp = list;
        
        //We need to take care of carry situation for sure.

        //Initially sum is equal to 0.
        int sum = 0;
        
        //SO WE NEED TO TRAVERSE TILL WE REACH END OF BOTH THE LISTS.
        while(temp1!=null || temp2!=null)
        {
            
            if(temp1!=null)
            {
                sum = sum + temp1.val;
                temp1 = temp1.next;
            }
            
            if(temp2!=null)
            {
                sum = sum + temp2.val;
                temp2 = temp2.next;
            }
            
            //Now handle the carry situation.
            int carry = sum % 10;
            
            //WE JUST HAVE TO PUT THE VALUE OF CARRY INSIDE NEW NODE AND SET THE LINKS.
            ListNode newNode = new ListNode(carry);
            temp.next = newNode;  
            temp = temp.next;
            sum = sum / 10;
        }

        //So, now we have to handle the situation where we have a Last Digit carry
        if(sum==1)
        {
            //THIS SIMPLY MEANS WE NEED TO ADD THAT LAST CARRY IN A NEW NODE.
            ListNode newNode = new ListNode(1);
            temp.next = newNode;
            temp = temp.next;
        }
        return list.next;
    }
}
