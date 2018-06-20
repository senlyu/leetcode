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
    public int diameterOfBinaryTree(TreeNode root) {
        int tl = 0;
        int tr = 0;
        int tm = 0;
        if (root==null)
            return 0;
        if (root.left==null)
            tl = 0;
        else {
	        tl = diameterOfBinaryTree(root.left);
            tm += help(root.left);
        }
            
        if (root.right==null)
            tl = 0;
        else {
            tr = diameterOfBinaryTree(root.right);
            tm += help(root.right);
        }
        return Math.max(Math.max(tl,tr),tm);
    }

    private int help(TreeNode root) {
    	int left = 0;
    	int right = 0;
    	if (root==null)
    		return 0;
    	if (root.left!=null)
    		left = help(root.left);
    	if (root.right!=null)
    		right = help(root.right);
    	return (Math.max(right,left)+1);
    }
}