package com.namaste.problem;

import com.namaste.common.Print;

public class No88_Merge_Sorted_Array {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int count=m+n-1;
        --m;--n;
        while (m>=0&&n>=0) nums1[count--]=(nums1[m]>nums2[n])?nums1[m--]:nums2[n--];
        while (n>=0) nums1[count--]=nums2[n--];
        return nums1;
    }

    public static void main(String[] args){
        int[] nums1 =new int[] {1,2,3,0,0,0},  nums2 =new int[] {2,5,6};
        int m=3, n = 3;
        Print.PrintArray(merge(nums1,m,nums2,n));
    }
}
