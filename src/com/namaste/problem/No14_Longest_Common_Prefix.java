package com.namaste.problem;

import java.util.Arrays;

public class No14_Longest_Common_Prefix {
    public static String longestCommonPrefix1(String[] strs) {
        if(strs==null||strs.length==0) return "";
        String res=new String();
        for(int j=0;j<strs[0].length();j++){
            char c=strs[0].charAt(j);
            for(int i=1;i<strs.length;i++){
                if(j>=strs[i].length()||strs[i].charAt(j)!=c) return res;
            }
            res+=Character.toString(c);
        }
        return res;
    }

    public static String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int j = 0; j < strs[0].length(); ++j) {
            for (int i = 0; i < strs.length; ++i) {//i=0,i=1都可以
                if (j >= strs[i].length() || strs[i].charAt(j) != strs[0].charAt(j)) {
                    return strs[0].substring(0, j);//strs[0],strs[i]都可以
                }
            }
        }
        return strs[0];
    }

    /*
    1、按照字母顺序将所有字符串排序
    2、取第一个和最后一个字符串，获取其中最小的一个长度
    3、按照这个长度去遍历并比较所有字母
     */
    public static String longestCommonPrefix3(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        Arrays.sort(strs);
        int i = 0, len = Math.min(strs[0].length(), strs[strs.length - 1].length());
        while (i < len && strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) i++;
        return strs[0].substring(0, i);
    }

    public static void main(String[] args){
        String[] strs =new  String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix3(strs));
    }
}
