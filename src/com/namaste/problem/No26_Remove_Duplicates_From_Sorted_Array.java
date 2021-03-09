package com.namaste.problem;

import java.util.Vector;

public class No26_Remove_Duplicates_From_Sorted_Array {

    /*
    快慢指针方法，i是慢指针，j是快指针
     */
    public static int removeDuplicates1(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int i=0,j=0;
        while(j!=nums.length){
            if(nums[i]==nums[j]){
                j++;
                continue;
            }
            if(nums[j]>nums[i]){
                nums[i+1]=nums[j];
                i++;
                j++;
            }
        }
        return i+1;
    }

    /*
    用变量i表示当前覆盖到到位置，由于不能有重复数字，则只需要用当前数字 num 跟上一个覆盖到到数字 nums[i-1] 做个比较，只要 num 大，则一定不会有重复（前提是数组必须有序）
     */
    public static int removeDuplicates2(int[] nums){
        int i=0;
        for(int n:nums){
            if(i<1 || n>nums[i-1]){
                nums[i++]=n;
            }
        }
        return i;
    }

    public static void main(String[] args){
        int[] nums =new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates2(nums));
    }
}
