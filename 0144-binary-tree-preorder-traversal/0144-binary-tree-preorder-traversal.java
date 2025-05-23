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
        
        List<Integer> preorder =new ArrayList <> ();
        traversal(root,preorder);
        return preorder;
    }

    public void traversal(TreeNode root,List <Integer> preorder){
        if(root==null){
            return;
        }

        preorder.add(root.val);
        traversal(root.left,preorder);
        traversal(root.right,preorder);
    }


}