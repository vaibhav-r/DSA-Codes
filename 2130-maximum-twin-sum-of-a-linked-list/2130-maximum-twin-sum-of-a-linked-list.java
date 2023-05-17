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
// class Solution {
//     public int pairSum(ListNode head) {
//         ListNode slow=head,fast=head;
//         while(fast!=null && fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         ListNode prev=null,NextNode=null;
//         while(slow!=null){
//             NextNode=slow.next;
//             slow.next=prev;
//             prev=slow;
//             slow=NextNode;
//         }
//         int maxi=0;
//         slow=head;
//         while(prev!=null){
//             maxi=Math.max(maxi,(slow.val+prev.val));
//             prev=prev.next;
//             slow=slow.next;
//         }
//         return maxi;
//     }
// }
class Solution {
    public int pairSum(ListNode head) {
        ListNode cur=head;
        Stack<Integer> st=new Stack<>();
        while(cur!=null){
            st.push(cur.val);
            cur=cur.next;
        }
        cur=head;
        int maxi=0,count=st.size(),i=1;
        while(i<=count/2){
            maxi=Math.max(maxi,(cur.val+st.peek()));
            cur=cur.next;
            st.pop();
            i++;
        }
        return maxi;
    }
}