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
    public ListNode reverseList(ListNode head) {
        ListNode temp = new ListNode();temp=head;
        Stack<Integer> st = new Stack<>();
        while(temp!=null){
            st.push(temp.val);
            temp=temp.next;
        }
        temp=head;
        while(st.size()!=0){
            temp.val=st.pop();
            temp=temp.next;
        }
        return head;
    }
}