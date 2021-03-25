package com.namaste.problem;

import com.namaste.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class No104_Maximum_Depth_Of_Binary_Tree {

    public static void main(String[] args) {

        //使用数组初始化二叉树，并打印
        TreeNode root = new TreeNode();
        root.left = null;
        root.right = null;

        Integer[] arr = new Integer[]{1, 2, 2, null, 3, null, 3};
        root.left = root.createBinaryTreeByArray(arr, 0);
        root.printf(root, 0);
        System.out.println(maxDepth1(root.left));
        System.out.println(maxDepth2(root.left));
    }

    public static int maxDepth1(TreeNode root){
        return root==null ? 0:(1+Math.max(maxDepth1(root.left),maxDepth1(root.right)));
    }

    public static int maxDepth2(TreeNode root){
        if(root==null) return 0;
        int res=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            ++res;
            for (int i=q.size();i>0;i--){
                TreeNode tn=q.poll();
                if(tn.left!=null) q.offer(tn.left);
                if(tn.right!=null) q.offer(tn.right);
            }
        }
        return res;
    }
}
