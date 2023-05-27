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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        ListNode x=head;
        while(head!=null && head.next!=null){
            if(head.next.val==head.val){
                head.next=head.next.next;
            }
            else head=head.next;
        }
        return x;
    }
}