package com.namaste.common;

public class TreeNode {
    public Object val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(Object val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    /**
     * 初始化二叉树头结点
     *
     * @param node ：头结点
     */
    public void initBinTree(TreeNode node) {
        node.left = null;
        node.right = null;
    }

    /**
     * 左插入节点
     *
     * @param curr_node
     * @param element
     * @return
     */
    public TreeNode insertLeftChild(TreeNode curr_node, Object element) {
        if (curr_node == null) {
            return null;
        }

        TreeNode newnode = new TreeNode(); //初始化新节点
        newnode.val = element;
        newnode.left = curr_node.left; //插入新节点左子树为原子树node的左子树（---> null）
        newnode.left = null;

        curr_node.left = newnode; //转换curr_node节点为当前插入后的左子树
        return curr_node.left;
    }

    /**
     * 右插入节点
     *
     * @param curr_node
     * @param element
     * @return
     */
    public TreeNode insertRightChild(TreeNode curr_node, Object element) {
        if (curr_node == null) {
            return null;
        }

        TreeNode saveNode = curr_node.right;

        TreeNode newNode = new TreeNode();
        newNode.val = element;
        newNode.right = newNode;
        newNode.right = null;

        curr_node.right = newNode;
        return curr_node.right;
    }

    /**
     * 删除左子树
     *
     * @param currNode
     * @return
     */
    public TreeNode deleteLeftChild(TreeNode currNode) {
        if (currNode == null || currNode.left == null) {
            return null;
        }
        currNode.left = null;
        return currNode;
    }

    /**
     * 删除右节点
     *
     * @param currNode
     * @return
     */
    public TreeNode deleteRightChild(TreeNode currNode) {
        if (currNode == null || currNode.right == null) {
            return null;
        }
        currNode.right = null;
        return currNode;
    }

    /**
     * 前序遍历
     *
     * @param root
     */
    public void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    /**
     * 中序遍历
     *
     * @param root
     */
    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }

    /**
     * 后序遍历
     *
     * @param root
     */
    public void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val + " ");
        }
    }


    /**
     * 打印二叉树
     *
     * @param root
     * @param n
     */
    public void printf(TreeNode root, int n) {

        if (root == null) {   //为空判断
            return;
        }
        printf(root.right, n + 1);  //遍历打印右子树

        for (int i = 0; i < n - 1; i++) {
            System.out.print("\t");
        }

        if (n > 0) {
            System.out.println("----" + root.val);
        }
        printf(root.left, n + 1);
    }

    /**
     * 二叉树查找元素
     * @param root
     * @param x
     * @return
     */
    public TreeNode search(TreeNode root, Object x) {
        TreeNode findNode = null;   //找到就返回该节点指针，找不到就返回空

        if (root != null) {
            if (root.val == x) {
                findNode = root;
            } else {
                findNode = search(root.left, x);
                if (findNode == null) {
                    findNode = search(root.right, x);
                }
            }
        }
        return findNode;
    }

    /**
     * 使用数组初始化二叉树
     * @param array
     * @param index
     * @return
     */
    public TreeNode createBinaryTreeByArray(Integer[] array,int index)
    {
        TreeNode tn = null;
        if (index<array.length) {
            Integer value = array[index];
            if (value == null) {
                return null;
            }
            tn = new TreeNode(value);
            tn.left = createBinaryTreeByArray(array, 2*index+1);
            tn.right = createBinaryTreeByArray(array, 2*index+2);
            return tn;
        }
        return tn;
    }
}

