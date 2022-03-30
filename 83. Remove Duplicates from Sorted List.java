class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode te=head;
        
        while(te!=null && te.next!=null ){
            if(te.val==te.next.val){
                te.next=te.next.next;
                
            }
            else{
                te=te.next;
            }
        }
        return head;
        
    }
}
