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
    public ListNode swapNodes(ListNode head, int k) {
    ListNode first = head;
    ListNode second = head;
    
    // Move the second pointer to the kth node from the beginning
    for (int i = 1; i < k; i++) {
        second = second.next;
    }
    
    ListNode temp = second;
    
    // Move the second pointer to the end of the list
    while (temp.next != null) {
        first = first.next;
        temp = temp.next;
    }
    
    // Swap the values of the kth node from the beginning and the end
    int val = first.val;
    first.val = second.val;
    second.val = val;
    
    return head;
}

}