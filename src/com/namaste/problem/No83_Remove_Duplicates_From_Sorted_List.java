package com.namaste.problem;

import com.namaste.common.ListNode;

public class No83_Remove_Duplicates_From_Sorted_List {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head==null) return null;
        ListNode cur=head;
        while (cur.next!=null){
            if(cur.val==cur.next.val){
                cur.next=cur.next.next;
            }else {
                cur=cur.next;
            }
        }
        return head;
    }

    public static void main(String[] args){
        ListNode a3=new ListNode(4);
        ListNode a2=new ListNode(2,a3);
        ListNode a1=new ListNode(2,a2);

        getDataByLoop(deleteDuplicates(a1));
    }

    public static void getDataByLoop(ListNode node){
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
