package com.namaste.problem;

public class No53_Maximum_Subarray {

    /*
    my solution,can't pass leetcode test,cause one case time out
     */
    public static int maxSubArray1(int[] nums) {
        int sum=Integer.MIN_VALUE;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            for (int j=i;j<nums.length;j++){
                for(int k=i;k<=j;k++){
                    temp+=nums[k];
                }
                if(temp>sum){
                    sum=temp;
                }
                temp=0;
            }
        }
        return sum;
    }

    /*
    动态规划法：核心思想是，从第一个元素开始，计算的都是截止到当前元素，包含当前元素的所有子数组的和的最大值
    https://www.bilibili.com/video/av85185603/
     */
    public static int maxSubArray2(int[] nums){
        int res = Integer.MIN_VALUE, curSum = 0;
        for (int num : nums) {
            curSum = Math.max(curSum + num, num);
            res = Math.max(res, curSum);
        }
        return res;
    }

    public static void main(String[] args){
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray2(nums));
    }
}
