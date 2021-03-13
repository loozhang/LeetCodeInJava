package com.namaste.problem;

import com.namaste.common.Print;

public class No66_Plus_One {
    public static int[] plusOne(int[] digits) {
        int i=digits.length-1;
        int[] nums=new int[digits.length+1];
        while (i>=0){
            if(digits[i]!=9){
                digits[i]++;
                break;
            }else {
                digits[i]=0;
                i--;
            }
        }
        if(i<0) {
            nums[0]=1;
            return nums;
        }
        return digits;
    }

    public static void main(String[] args){
        int[] digits=new int[]{9,9,9,9};
        Print.PrintArray(plusOne(digits));
    }
}
