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
    public ListNode reverseEvenLengthGroups(ListNode head) {
      
      // The key idea is to check if we are at an even no of group if yes then we will reverse the nodes in that grp else we skip all the nodes in that group
      
      if(head==null|| head.next==null || head.next.next==null) return head ;
      
      ListNode node = head ; // using this we will traverse the list 
      
      int group = 1;
      
      while(node!=null && node.next!=null)
      {
       
        group++;
        
        // calculate the no of nodes in this group , this will tell us if there are even or odd no of nodes present if they are even reverse them else just skip them
        
     
      ListNode temp = node.next ; // why node. next ? ---> because the node represents the last node of the previous group , so we take its next element so that we can                                        start iterating through the next group 
        
      int countNodes = 0;   // using 0-based indexing
        
        while(temp != null && countNodes<group)
        {
          temp=temp.next;
            countNodes++;
        }
      
        // now , as we have the number of nodes we can check if they are even or not and can continue our logic 

        if(countNodes%2==0) // they are even ---> reverse the nodes within that group 
        {
          ListNode curr = node.next ; // as said earlier the node represts the last node of previous group , so we take                                                 node.next as the first node of this fresh group
          
          ListNode prev = null , next = null;
          
          
          // standard reverse technique 
          for(int i=0 ; i<countNodes; i++)
          {
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            
          }
          
          // This is the most confusing part 
          // taking example 1-->1-->0-->6  , group 2 is even containing 1 and 0 
          // after this loop the list will look some what like the following :
          //     1----------        the last node of previous group (node) will be pointing at the end node of this current group after reversing
          //               |      
          //        null<--1<--0  6  now what we want , we want that the  1 pointing to null should point to 6  and the 1 of previous group should point at 0
          
          // after the loop prev will be at 0  , curr will be at 6  and  our node is the tail element of previous group 
          
          ListNode tailNode= node.next;
          
          tailNode.next = curr;  // making 1 pointing to 6 instead of null
          node.next =prev;
          
          // at the end make out node to point at the tail element of this group 
          
          node = tailNode;
        }
        
        else  
        {
          // if the no of nodes are odd , we are in odd group , skip all the nodes in this group 
          for(int i=0 ; i<countNodes ; i++) node=node.next;
        }
          
      }
      
      return head;
    }
}