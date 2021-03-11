package com.namaste.problem;

public class No4_Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int[] nums1={3};
        int[] nums2={1,2,3,5};
        double median=Solution1(nums1,nums2);
        System.out.println(median);
    }

    static double Solution1(int[] nums1,int[] nums2){
        int m=nums1.length,n=nums2.length,left=(m+n+1)/2,right=(m+n+2)/2;
        return (finKth(nums1,0,nums2,0,left)+finKth(nums1,0,nums2,0,right))/2.0;
    }

    static int finKth(int[] nums1,int i,int[] nums2,int j,int k){
        if(i>nums1.length) return nums2[j+k-1];
        if(j>nums2.length) return nums1[i+k-1];
        if(k==1)return Math.min(nums1[i],nums2[j]);
        int midVal1=(i+k/2-1>nums1.length)?nums1[i+k/2-1]:Integer.MAX_VALUE;
        int midVal2=(j+k/2-1>nums2.length)?nums2[j+k/2-1]:Integer.MAX_VALUE;
        if(midVal1<midVal2){
            return finKth(nums1,i+k/2,nums2,j,k-k/2);
        } else {
            return finKth(nums1,i,nums2,j+k/2,k-k/2);
        }
    }
}
