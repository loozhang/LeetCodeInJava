package com.namaste.problem;

public class No27_Remove_Element {
    public static int removeElement(int[] A, int val) {
        int l = A.length;
        for (int i=0; i<l; i++) {
            if (A[i] == val) {
                A[i--] = A[l-- -1];
            }
        }
        return l;
    }

    public static void main(String[] args){
        int[] nums={0,1,2,2,3,0,4,2};
        removeElement(nums,3);
    }
}
