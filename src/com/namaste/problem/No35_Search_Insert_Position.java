package com.namaste.problem;

public class No35_Search_Insert_Position {
    public static int searchInsert(int[] nums, int target) {
        for (int i=0;i<nums.length;i++) {
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int a=searchInsert(nums,2);
        System.out.println(a);
    }
}
