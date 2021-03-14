package com.namaste.problem;

import static java.lang.Math.abs;

public class No69_Sqrtx {

    /*
    二分法
     */
    public static int mySqrt1(int x) {
        if(x<=1) return 1;
        int left=0,right=x;
        while (left<right){
            int mid=left+(right-left)/2;
            if(mid*mid<=x) left=mid+1;
            else right=mid;
        }
        return right-1;
    }

    /*
    牛顿迭代法
     */
    public static int mySqrt2(int x) {
        if (x == 0) return 0;
        double res = 1, pre = 0;
        while (abs(res - pre) > 1e-6) {
            pre = res;
            res = (res + x / res) / 2;
        }
        return (int)res;
    }

    /*
    牛顿迭代法简化版
     */
    public static int mySqrt3(int x){
        long res=x;
        while (res*res>x){
            res=(res+x/res)/2;
        }
        return (int)res;
    }

    public static void main(String[] args){
        System.out.println(mySqrt3(1));
    }
}
