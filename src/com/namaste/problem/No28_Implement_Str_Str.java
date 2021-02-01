package com.namaste.problem;

public class No28_Implement_Str_Str {
    /*
    my solution
     */
    public static int strStr(String haystack, String needle) {
        int j,k;
        if(needle.length()==0){
            return 0;
        }
        if(haystack.length()>=needle.length()){
            for(int i=0;i<haystack.length();i++){
                j=0;k=i;
                while(haystack.charAt(k++)==needle.charAt(j++)){
                    if(j==needle.length()){
                        return i;
                    }
                    if(k==haystack.length()){
                        return -1;
                    }
                }
            }
        }
        return -1;
    }

    /*
    Standard Solution
     */
    public static int strStr1(String haystack, String needle){
        if(needle.length()==0) return 0;
        int m=haystack.length(),n=needle.length();
        if(m<n) return -1;
        for(int i=0;i<=m-n;i++){
            int j=0;
            for(j=0;j<n;j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)) break;
            }
            if(j==n) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack="a";
        String needle="a";
        int a=strStr1(haystack,needle);
        System.out.println(a);
    }
}
