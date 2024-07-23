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
    ArrayList<Integer> a=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        postorder(root);
        return a;
    }
    public void postorder(TreeNode Node){
        if(Node==null){
            return;
        }
        postorder(Node.left);
        postorder(Node.right);
        a.add(Node.val);
    }
}