package com.namaste.problem;

public class No28_Implement_Str_Str {
    public static int strStr(String haystack, String needle) {
        char[] str1=haystack.toCharArray();
        char[] str2=needle.toCharArray();
        int j,k;
        if(str2.length==0){
            return 0;
        }
        if(str1.length>=str2.length){
            for(int i=0;i<str1.length;i++){
                j=0;k=i;
                while(str1[k++]==str2[j++]){
                    if(k==str1.length){
                        return -1;
                    }
                    if(j==str2.length){
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack="mississippi";
        String needle="issipi";
        int a=strStr(haystack,needle);
        System.out.println(a);
    }
}
