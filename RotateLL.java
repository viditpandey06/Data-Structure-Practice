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
       if(head==null||head.next==null||k==0){
        return head;
       }
        int len=0;
        ListNode temp = head;
        while(temp.next!=null){
            len++;
            temp=temp.next;
        }
        len++;
        k=k%len;
        if(k==0){
            return head;
        }
        else{
            temp.next=head;
        }
        temp=head;
        int newEnd=len-k-1;
        while(newEnd!=0){
            temp=temp.next;
            newEnd--;
        }
        ListNode newHead = temp.next;
        temp.next=null;
        return newHead;
    }
}