package com.namaste.problem;

import java.util.*;

public class No3_Longest_Substring {
	
	public static int BruteForce(String s) {
		int n=s.length();
		int ans=0;
		for(int i=0;i<n;i++)
			for(int j=i+1;j<=n;j++)
				if(allUnique(s,i,j)) ans=Math.max(ans, j-i);
		return ans;
	}
	
	public static Boolean allUnique(String s,int start,int end) {
		Set<Character> set=new HashSet<>();
		for(int i=start;i<end;i++) {
			Character ch=s.charAt(i);
			if(set.contains(ch)) return false;
			set.add(ch);
		}
		return true;
	}
	
	
	public static int SlidingWindow(String s) {
		int n=s.length();
		Set<Character> set=new HashSet<>();
		int ans=0,i=0,j=0;
		while(i<n&&j<n) {
			if(!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				ans=Math.max(ans, j-i);
			}
			else {
				set.remove(s.charAt(i++));
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		System.out.println(BruteForce("lyuydifnelqwzrfdvjyyizcczjwosklfigenojauwtqwkybijbgrajwbusqmcbuk"));
		System.out.println(SlidingWindow("lyuydifnelqwzrfdvjyyizcczjwosklfigenojauwtqwkybijbgrajwbusqmcbuk"));
	}
}
