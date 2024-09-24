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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode temp = head;
       int correctIndx= 0;
       while(temp!=null){
            correctIndx+=1;
            temp=temp.next;
       }
       correctIndx=(correctIndx-n);
       if(correctIndx==0){
       return head.next;
       }
       temp=head;
       while((--correctIndx)!=0){
            temp=temp.next;
       }
       temp.next=temp.next.next;
       return head;
    }
    
}