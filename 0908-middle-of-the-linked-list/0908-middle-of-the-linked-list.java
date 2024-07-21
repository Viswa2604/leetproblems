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
    public ListNode middleNode(ListNode head) {
       // ListNode currNode = head;
        ListNode rab=head,tort =head;
        while(rab!=null&&rab.next!=null){
            rab=rab.next.next;
            tort=tort.next;
        }
        return tort;
    }
}