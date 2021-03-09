package com.namaste.problem;

public class No9_Palindrome_Number {
    public static boolean isPalindrome(int x){
        int res=0;
        int ori=x;
        if(x<0) return false;
        while (x!=0){
            if(res>Integer.MAX_VALUE/10) return false;//此处判断的是反转后是否溢出
            res=res*10+x%10;
            x/=10;
        }
        return res==ori;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome(323));
    }
}
