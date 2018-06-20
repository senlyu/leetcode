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
    public int sumOfLeftLeaves(TreeNode root) {
        /*
        sums = 0;
        if root==null
            return 0;
        if root.left is null
            left 0;
        if left is leave
            left = left.val
        else
            left = sumOfLeftLeaves(root.left)
        if root.right is not null
            right = sumOfLeftLeaves(root.right)
        return left + right;
        */
        if (root==null)
        	return 0;
        int left = 0;
        int right = 0;
        if (root.left==null)
        	left = 0;
        else 
        	if (root.left.left==null&&root.left.right==null)
        	    left = root.left.val;
            else
        	    left = sumOfLeftLeaves(root.left);
        if (root.right!=null)
        	right = sumOfLeftLeaves(root.right);
        return left+right;
    }
}