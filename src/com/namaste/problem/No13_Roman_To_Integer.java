package com.namaste.problem;

import java.util.HashMap;

public class No13_Roman_To_Integer {
    /*
    my solution
     */
    public static int romanToInt1(String s) {
        int res=0;
        int cur=0;
        int pre=0;
        for (int i=s.length()-1;i>=0;i--) {
            switch(s.charAt(i)){
                case 'I': cur=1;break;
                case 'V': cur=5;break;
                case 'X': cur=10;break;
                case 'L': cur=50;break;
                case 'C': cur=100;break;
                case 'D': cur=500;break;
                case 'M': cur=1000;
            }
            if(cur>=pre){
                res=res+cur;
            }
            else{
                res=res-cur;
            }
            pre=cur;
        }
        return res;
    }

    /*
    HashMap solution
     */
    public static int romanToInt2(String s) {
        int res = 0;
        HashMap<String,Integer> m= new HashMap(){
            {
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
            }
        };
        for (int i = 0; i < s.length(); i++) {
            int val = m.get(s.charAt(i));
            if (i == s.length() - 1 || m.get(s.charAt(i+1)) <= m.get(s.charAt(i))) res += val;
            else res -= val;
        }
        return res;
    }

    public static void main(String[] args){
        System.out.println(romanToInt2("MCMXCIV"));
    }
}
