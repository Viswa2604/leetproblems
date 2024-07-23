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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> b=new ArrayList<>();
        preorder(root,b);
        return b;
    }
    public void preorder(TreeNode Node,ArrayList a){
        if(Node==null){
            return;
        }
        a.add(Node.val);
        preorder(Node.left,a);
        preorder(Node.right,a);
    }
}