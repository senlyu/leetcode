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
    public String tree2str(TreeNode t) {
        if (t==null)
        	return "";
        String left = "()";
        String right = "()";
        if (t.left==null)
        	if (t.right==null) {
        		left = "";
        		right = "";
        	} else {
        		right = "("+tree2str(t.right)+")";
        	}
        else {
        	left = "("+tree2str(t.left)+")";
        	if (t.right==null) {
        		right = "";
        	} else {
        		right = "("+tree2str(t.right)+")";
        	}
        }
        return String.valueOf(t.val)+left+right;
    }
}