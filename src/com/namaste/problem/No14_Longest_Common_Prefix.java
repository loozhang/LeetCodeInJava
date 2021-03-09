package com.namaste.problem;

public class No14_Longest_Common_Prefix {
    public static String longestCommonPrefix1(String[] strs) {
        if(strs==null||strs.length==0) return "";
        String res=new String();
        for(int j=0;j<strs[0].length();j++){
            char c=strs[0].charAt(j);
            for(int i=1;i<strs.length;i++){
                if(j==strs[i].length()||strs[i].charAt(j)!=c) return res;
            }
            res+=Character.toString(c);
        }
        return res;
    }

    public static void main(String[] args){
        String[] strs =new  String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix1(strs));
    }
}
