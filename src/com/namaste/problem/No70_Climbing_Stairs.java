package com.namaste.problem;

public class No70_Climbing_Stairs {

    /*
    递归算法
     */
    public static int climbStairs1(int n) {
        if(n<=1) return 1;
        int[] dp=new int[n];
        dp[0]=1;dp[1]=2;
        for(int i=2;i<n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n-1];
    }

    /*
    递归算法简化版，减少了变量，节省了空间
     */
    public static int climbStairs2(int n){
        int a=1,b=1;
        while (n-->0){
            b+=a;
            a=b-a;
        }
        return a;
    }

    public static void main(String[] args){
        System.out.println(climbStairs2(5));
    }
}
