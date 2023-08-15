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
    public ListNode partition(ListNode head, int x) {
        ListNode lessHead = new ListNode(0);
        ListNode lessTail = lessHead;
        ListNode greaterHead = new ListNode(0);
        ListNode greaterTail = greaterHead;
        
        while (head != null) {
            if (head.val < x) {
                lessTail.next = head;
                lessTail = lessTail.next;
            } else {
                greaterTail.next = head;
                greaterTail = greaterTail.next;
            }
            head = head.next;
        }
        
        greaterTail.next = null; 
        
        lessTail.next = greaterHead.next;
        
        return lessHead.next;
    }
}