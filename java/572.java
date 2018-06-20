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
    public boolean isSubtree(TreeNode s, TreeNode t) {
    	return (help(s,t)||s.left!=null&&isSubtree(s.left,t)||s.right!=null&&isSubtree(s.right,t));
    }

    public boolean help(TreeNode s, TreeNode t) {
    	if (s==null&&t==null)
    		return true;
    	if (s==null||t==null)
    		return false;
    	boolean left = false;
    	boolean right = false;
    	if (s.left==null&&t.left==null||s.left!=null&&t.left!=null&&help(s.left,t.left))
    		left = true;
    	if (s.right==null&&t.right==null||s.right!=null&&t.right!=null&&help(s.right,t.right))
    		right = true;
    	if (left&&right&&s.val==t.val)
    		return true;
        return false;
    }
}