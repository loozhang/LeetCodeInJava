package com.namaste.problem;

import com.namaste.common.TreeNode;

public class No100_Same_Tree {
    public static boolean isSameTree(TreeNode p,TreeNode q){
        if(p==null && q==null) return true;
        if(p!=null && q!=null && p.val==q.val){
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }else {
            return false;
        }
    }
}
