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
    public boolean isBalanced(TreeNode root) {
    	return help(root)!=-1;
    }

    private int help(TreeNode root) {
    	if (root==null)
    		return 0;
    	int left = help(root.left);
    	int right = help(root.right);
    	if (left==-1||right==-1)
    		return -1;
    	if ((Math.abs(left-right))>1)
            return -1;
        return Math.max(left, right) + 1;

    }
}