class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp=new ListNode();
        ListNode ret=temp;
        while(list1!=null && list2!=null){
                if(list1.val<list2.val){
                    temp.next=new ListNode(list1.val);
                    if(list1.next!=null){
                        list1=list1.next;
                    }
                    else{
                        list1=null;
                    }
                    temp=temp.next;
                }
            else{
                temp.next=new ListNode(list2.val);
                if(list2.next!=null){
                    list2=list2.next;
                }
                else{
                    list2=null;
                }
                temp=temp.next;
                
            }
            }
            if(list1!=null){
                temp.next=list1;
            }
            if(list2!=null){
                temp.next=list2;
            }
        return ret.next;
        
    }
}
