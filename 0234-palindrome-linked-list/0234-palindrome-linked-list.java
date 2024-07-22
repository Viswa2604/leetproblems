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
    public boolean isPalindrome(ListNode head) {
        ListNode t1=head;
        ListNode t2=reverse(middle(head));
        while(t2!=null){
            if(t1.val!=t2.val){
                return false;
            }
            t1=t1.next;
            t2=t2.next;
        }
        return true;
    }
    public ListNode middle(ListNode head){
        ListNode rabb=head;
        ListNode tort=head;
        while(rabb!=null&&rabb.next!=null){
            rabb=rabb.next.next;
            tort=tort.next;
        } 
        return tort;
    }
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode forw=null;
        ListNode prev=null;
        while(curr!=null){
            forw=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forw;
        }
        return prev;
    }

}