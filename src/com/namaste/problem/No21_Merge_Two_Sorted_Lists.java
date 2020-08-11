package com.namaste.problem;

import com.namaste.common.ListNode;

public class No21_Merge_Two_Sorted_Lists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(-1),cur=dummy;
        while (l1!=null&&l2!=null) {
            if(l1.val<l2.val){
                cur.next=l1;
                l1=l1.next;
            }
            else{
                cur.next=l2;
                l2=l2.next;
            }
            cur=cur.next;
        }
        cur.next=(l1!=null)?l1:l2;
        return dummy.next;
    }
}
