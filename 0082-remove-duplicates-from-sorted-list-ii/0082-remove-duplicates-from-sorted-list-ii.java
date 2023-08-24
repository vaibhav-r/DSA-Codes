class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0); // Create a dummy node
        dummy.next = head;
        ListNode prev = dummy; // Previous distinct node
        
        while (head != null) {
            boolean isDuplicate = false;
            
            // Check for duplicates
            while (head.next != null && head.val == head.next.val) {
                head = head.next;
                isDuplicate = true;
            }
            
            if (isDuplicate) {
                prev.next = head.next; // Skip duplicates
            } else {
                prev = prev.next; // Move the previous pointer
            }
            
            head = head.next; // Move to the next node
        }
        
        return dummy.next; // Return the updated list
    }
}
