package com.namaste.problem;

public class No1_Two_Sum {
	public static int[] twoSum(int[] nums, int target) {
	    for (int i = 0; i < nums.length; i++) {
	        for (int j = i + 1; j < nums.length; j++) {
	            if (nums[j] == target - nums[i]) {
	                return new int[] { i, j };
	            }
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
	
	public static void main(String[] args) {
		int[] nums =new int[]{2, 7, 11, 15};
		int target = 9;
		Print(twoSum(nums,target));
	}
	
    public static void Print(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+",");
        }
        System.out.println("-------------------------");
    }
}
