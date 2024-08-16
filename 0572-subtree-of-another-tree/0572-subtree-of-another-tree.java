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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null){
            return false;
        }
        if(isidentical(root,subRoot)){
            return true;
        }
        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
    }
    public boolean isidentical(TreeNode r1,TreeNode r2){
        if(r1==null||r2==null){
            return r1==r2;
        }
        return isidentical(r1.left,r2.left)&&isidentical(r1.right,r2.right)&&r1.val==r2.val;
    }
}