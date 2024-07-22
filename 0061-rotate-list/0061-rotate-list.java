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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null){
            return head;
        }
        int size=size(head);
        int l=k%size;
        ListNode temp=head;
        if (l == 0) {
            return head;
        }
        while(l>0){
            temp=temp.next;
            l--;
        }
        ListNode p1=temp;
        ListNode p2=head;
        while(p1.next!=null){
            p1=p1.next;
            p2=p2.next;
        }
        p1.next=head;
        head=p2.next;
        p2.next=null;
        return head;

    }
    public int size(ListNode head){
        int count=0;
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            count++;
        }
        return count;
    }
    
}