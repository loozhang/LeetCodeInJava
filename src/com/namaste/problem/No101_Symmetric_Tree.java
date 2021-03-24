package com.namaste.problem;

import com.namaste.common.TreeNode;

public class No101_Symmetric_Tree {
    public static void main(String[] args) {

        //使用数组初始化二叉树，并打印
        TreeNode root = new TreeNode();
        root.left = null;
        root.right = null;

        Integer[] arr = new Integer[]{1,2,2,3,4,4,3};
        root.left = root.createBinaryTreeByArray(arr, 0);
        root.printf(root, 0);
        System.out.println(isSymmetric(root.left));
    }

    public static boolean isSymmetric(TreeNode root){
        if(root==null) return true;
        return isSymmetric(root.left,root.right);
    }

    public static boolean isSymmetric(TreeNode left,TreeNode right){
        if(left==null && right==null) return true;
        if(left!=null&&right==null || left==null&&right!=null || left.val!=right.val) return false;
        return isSymmetric(left.left,right.right) && isSymmetric(left.right,right.left);
    }
}
