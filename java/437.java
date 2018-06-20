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
    public int pathSum(TreeNode root, int sum) {
    	// have to use two functions to do two situations;
        /*
        total = 0;
        t1 = pathSum(root, sum-root.val)
        tl = pathSum(root.left, sum)
        tr = pathSum(root.right, sum)
        total = t1 + tl + tr;
        */
        if (root==null)
        	return 0;
        int total = 0;
        if (root.val==sum) {
        	total++;
        }
        if (root.left!=null) {
        	total += help(root.left, sum-root.val);
        	total += pathSum(root.left, sum);
        }
        if (root.right!=null) {
        	total += help(root.right, sum-root.val);
        	total += pathSum(root.right, sum);
        }
        return total;
    }

    private int help(TreeNode root, int sum) {
    	if (root==null)
        	return 0;
        int total = 0;
        if (root.val==sum) {
        	total++;
        }
        if (root.left!=null) {
        	total += help(root.left, sum-root.val);
        }
        if (root.right!=null) {
        	total += help(root.right, sum-root.val);
        }
        return total;
    }
}