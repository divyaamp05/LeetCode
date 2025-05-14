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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postorder =new ArrayList <> ();
        traversal(root,postorder);
        return postorder;
    }

    public void traversal(TreeNode root,List <Integer> postorder){
        if(root==null){
            return;
        }

        traversal(root.left,postorder);
        traversal(root.right,postorder);
        postorder.add(root.val);
    }
}