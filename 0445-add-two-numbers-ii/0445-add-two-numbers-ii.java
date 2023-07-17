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
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode reversedL1 = reverseLinkedList(l1);
        ListNode reversedL2 = reverseLinkedList(l2);

        ListNode result = new ListNode(0);
        ListNode current = result;
        int carry = 0;

        while (reversedL1 != null || reversedL2 != null || carry != 0) {
            int sum = carry;
            if (reversedL1 != null) {
                sum += reversedL1.val;
                reversedL1 = reversedL1.next;
            }
            if (reversedL2 != null) {
                sum += reversedL2.val;
                reversedL2 = reversedL2.next;
            }

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        return reverseLinkedList(result.next);
    }

    private ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}