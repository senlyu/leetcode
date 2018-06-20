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
    public int findTilt(TreeNode root) {
        if (root==null)
        	return 0;
        int leftT = 0;
        int rightT = 0;
        int left = 0;
        int right = 0;
        if (root.left==null) {
        	leftT = 0;
        	left = 0;
        }
        else {
        	leftT = findTilt(root.left);
        	left = sum(root.left);
        }
        if (root.right==null) {
        	rightT = 0;
        	right = 0;
        }
        else {
        	rightT = findTilt(root.right);
        	right = sum(root.right);
        }
        return (leftT+rightT+Math.abs(left-right));
    }

    private int sum(TreeNode root) {
    	int total = 0;
    	if (root==null)
    		return total;
    	if (root.left!=null)
    		total += sum(root.left);
    	if (root.right!=null)
            total += sum(root.right);
        return total + root.val;
    }
}