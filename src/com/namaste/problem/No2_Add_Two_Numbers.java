package com.namaste.problem;

import com.namaste.common.*;

public class No2_Add_Two_Numbers {
	
	public static ListNode ElementaryMath(ListNode l1,ListNode l2) {
		ListNode dummyHead=new ListNode(0);
		ListNode p=l1,q=l2,curr=dummyHead;
		int carry=0;
		while(p!=null||q!=null) {
			int x=(p!=null)?p.val:0;
			int y=(q!=null)?q.val:0;
			int sum=carry+x+y;
			carry=sum/10;
			curr.next=new ListNode(sum%10);
			curr=curr.next;
			if(p!=null) p=p.next;
			if(q!=null) q=q.next;
		}
		if(carry>0) {
			curr.next=new ListNode(carry);
		}
		return dummyHead.next;
	}
	
	public static void main(String[] args) {
		ListNode p1=new ListNode(2);
		ListNode p2=new ListNode(4);
		ListNode p3=new ListNode(3);
		p1.next=p2;
		p2.next=p3;
		
		ListNode q1=new ListNode(5);
		ListNode q2=new ListNode(6);
		ListNode q3=new ListNode(4);
		q1.next=q2;
		q2.next=q3;
		
		ListNode res=ElementaryMath(p1,q1);
		PrintListNode(res);
	}
	
	public static void PrintListNode(ListNode res) {
		ListNode p=res;
		while(p!=null) {
			System.out.println(p.val);
			p=p.next;
		}
	}
}

