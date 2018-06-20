/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
    	if (root==null)
    		return false;
    	int newSum = sum - root.val;
    	if ((root.left!=null&&hasPathSum(root.left, newSum))||
    		(root.right!=null&&hasPathSum(root.right, newSum)))
    		return true;
    	if (root.left==null&&root.right==null&&newSum==0)
    		return true;
    	return false;
    }
}