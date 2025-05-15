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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue <TreeNode> q=new LinkedList <> ();

        List<List<Integer>> ls=new ArrayList <> ();

        if(root==null){
            return ls;
        }

        q.add(root);

        while(!q.isEmpty()){
            int s=q.size();
            List <Integer> sublist=new ArrayList <> ();

            for(int i=0;i<s;i++){
                TreeNode curr=q.poll();
                sublist.add(curr.val);

                if(curr.left!=null){
                    q.add(curr.left);
                }

                if(curr.right!=null){
                    q.add(curr.right);
                }
            }

            ls.add(sublist);

        }

        return ls;
    }
}