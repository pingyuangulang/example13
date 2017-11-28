/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 吉彬
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}
public class Solution {
    public static void main(String[] args){
        
    }
    /*
    问题：
    操作给定的二叉树，将其变换为源二叉树的镜像。
    （每个节点的左右子树互换）
    */
    
    /*
    解决思路：
    从根节点开始，每一个节点的左右子节点互换。
    */
    public void Mirror(TreeNode root) {
        if(root==null)
            return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        Mirror(root.left);
        Mirror(root.right);
    }
}
