class Solution {
    public ListNode mergeTwoLists(ListNode h, ListNode l) {
        ListNode ans=new ListNode(0);
        ListNode tmp=ans;

        while(h!=null && l!=null){
            if(h.val<=l.val){
                tmp.next=h;
                h=h.next;
            }
            else {
                tmp.next=l;
                l=l.next;
            }
            tmp=tmp.next;
        }
        while(h!=null){
            tmp.next=h;
            h=h.next;
            tmp=tmp.next;
        }
        while(l!=null){
            tmp.next=l;
            l=l.next;
            tmp=tmp.next;
        }
        return ans.next;
    }
}
