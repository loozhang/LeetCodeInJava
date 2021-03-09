package com.namaste.problem;

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

    public static void main(String[] args){
        String[] strs =new  String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix2(strs));
    }
}
