class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head;
        ListNode ans=new ListNode(0);
        ListNode tmp=ans;
        ListNode slow=head,fast=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            tmp.next=slow;
            tmp=slow;
            slow=slow.next;
            fast=fast.next;
        }
        tmp.next=slow.next;
        return ans.next;
    }
}
