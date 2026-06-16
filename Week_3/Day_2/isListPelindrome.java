class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null) slow=slow.next;

        ListNode pre=null;
        while (slow!=null) {
            ListNode tmp=slow.next;
            slow.next=pre;
            pre=slow;
            slow=tmp;
        }

        while(pre!=null) {
            if(head.val!=pre.val) return false;
            pre=pre.next;
            head=head.next;
        }
        return true;
    }
}
