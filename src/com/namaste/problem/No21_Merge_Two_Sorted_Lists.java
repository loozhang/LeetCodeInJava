package com.namaste.problem;

import com.namaste.common.ListNode;

public class No21_Merge_Two_Sorted_Lists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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

    public static void main(String[] args){
        ListNode a3=new ListNode(4);
        ListNode a2=new ListNode(2,a3);
        ListNode a1=new ListNode(1,a2);

        ListNode b3=new ListNode(4);
        ListNode b2=new ListNode(3,b3);
        ListNode b1=new ListNode(1,b2);
        getDataByLoop(mergeTwoLists(a1,b1));
    }

    public static void getDataByLoop(ListNode node){
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
