class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        
        ListNode temp = new ListNode();
        temp=head;
        while(temp!=null){
            ListNode front =temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}