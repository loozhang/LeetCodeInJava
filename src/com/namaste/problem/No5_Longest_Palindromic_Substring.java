package com.namaste.problem;

public class No5_Longest_Palindromic_Substring {
	
	public static String myAnswer(String s) {
        if(s==null||s.length()<1) return "";
		int n=s.length();
		int ans=0,p=0,q=0;
		for(int i=0;i<n-1;i++)
			for(int j=i+1;j<n;j++) {
				if(isPalindromic(s,i,j)&&((j-i+1)>=ans)) {
					ans=j-i+1;
					p=i;q=j;
				}
			}
		return s.substring(p, q+1);
	}
	
	public static Boolean isPalindromic(String s,int start,int end) {
		int n=(end-start+1)/2;
		for(int i=0;i<=n;i++) {
			if(s.charAt(start+i)!=s.charAt(end-i)) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String s="abcedeed";
		System.out.println(myAnswer(s));
	}
}
