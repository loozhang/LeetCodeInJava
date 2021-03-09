package com.namaste.problem;

public class No7_Reverse_Integer {
    public static int reverse1(int x) {
        int res=0;
        while(x!=0){
            if(Math.abs(res)>Integer.MAX_VALUE/10) return 0;//在这一步可以截住最大位数10位数时的继续运算，判断截止到倒数第二位，防止了继续运算到最后一位使得结果溢出，同时，恰好判断输入的整数反转后是否会溢出的界线值也不用判断到最后一位，判断到倒数第二位即可
            res=res*10+x%10;
            x/=10;
        }
        return res;
    }

    public static int reverse2(int x) {
        long res = 0;
        while (x != 0) {
            res = 10 * res + x % 10;
            x /= 10;
        }
        return (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) ? 0 : (int)res;
    }

    public static void main(String[] args)
    {
        System.out.println(reverse1(1563847412));
    }
}
