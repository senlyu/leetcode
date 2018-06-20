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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null)
        	return null;
        TreeNode nowL = lowestCommonAncestor(root.left, p, q);
        TreeNode nowR = lowestCommonAncestor(root.right, p, q);
        if (nowL!=null&&nowR!=null)
        	return root;
        if (root.val==p.val||root.val==q.val)
        	return root;        
        if (nowL!=null)
        	return nowL;
        if (nowR!=null)
        	return nowR;
        return null;
    }
}