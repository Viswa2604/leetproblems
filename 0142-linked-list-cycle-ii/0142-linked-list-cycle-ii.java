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
    public ListNode detectCycle(ListNode head) {
       ListNode s1=find(head);
       if(head==null){
        return null;
       }
       ListNode s2=head;
       if(s1==null){
            return null;
       }
       
       else{
        while(s1!=s2){
            s1=s1.next;
            s2=s2.next;
        }
       }
       return s1;
    }
    public ListNode find(ListNode head){
         ListNode fast=head;
        ListNode slow=head;
        
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return fast;
            }
        }
        return null;
    }
}
