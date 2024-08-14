/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int h1=diameterOfBinaryTree(root.left);
        int h2=diameterOfBinaryTree(root.right);
        int h3=height(root.left)+height(root.right);
        return Math.max(h1,Math.max(h2,h3));
    }
    public int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int h1=height(node.left);
        int h2=height(node.right);
        return Math.max(h1,h2)+1;
    }
}