class Solution {
    public int findTheWinner(int n, int k) {
        // Create a circular linked list with n nodes
        Node head = new Node(1);
        Node current = head;
        for (int i = 2; i <= n; i++) {
            current.next = new Node(i);
            current = current.next;
        }
        current.next = head; // Make it circular

        // Eliminate nodes one by one until only one is left
        while (current.next != current) {
            for (int i = 1; i < k; i++) {
                current = current.next;
            }
            current.next = current.next.next; // Eliminate the next node
        }

        return current.value;
    }
}

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }
}
