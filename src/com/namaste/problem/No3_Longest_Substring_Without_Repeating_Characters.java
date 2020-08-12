package com.namaste.problem;

import java.util.*;

public class No3_Longest_Substring_Without_Repeating_Characters {
	
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
	
	public static int SlidingWindowOptimized(String s) {
		int n=s.length(),ans=0;
		Map<Character,Integer> map=new HashMap<>();
		for(int j=0,i=0;j<n;j++) {
			if(map.containsKey(s.charAt(j))) {
				i=Math.max(map.get(s.charAt(j)), i);
				//如果发现了重复字符，则比较重复字符所在位置（的下一位）与当前i值的大小，取更大的一个，也就是说，如果重复字符在i之前，则不会影响i的取值，也就不会影响
				//字串长度的计算，如果重复字符在i后，那就将i拖后到重复字符的下一位
			}
			ans=Math.max(ans, j-i+1);
			map.put(s.charAt(j), j+1);
		}
		return ans;
	}
	
	public static void main(String[] args) {
		String testStr="lfyuydinelqwzrfdvjyyizcczjwosklfigenojauwtqwkybijbgrajwbusqmcbuk";
		System.out.println(BruteForce(testStr));
		System.out.println(SlidingWindow(testStr));
		System.out.println(SlidingWindowOptimized(testStr));
	}
}
