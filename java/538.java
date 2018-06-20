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
    public TreeNode convertBST(TreeNode root) {
        /*
        if root.right!=null
            root.right = convertBST(root.right);
            root.val += root.right.val;
        if root.left!=null
            help(root.left, root.val)
            root.left = convertBST(root.left);
        return root;
        */
        if (root==null)
        	return null;
        if (root.right!=null) {
        	root.right = convertBST(root.right);
        	root.val += help2(root.right);
        }
        if (root.left!=null) {
        	help(root.left, root.val);
        	root.left = convertBST(root.left);
        }
        return root;
    }

    private void help(TreeNode root, int adds) {
    	/*
    	if root.right==null
    	    root.val += adds;
    	else
    	    help(root.right, adds);
    	*/
    	if (root.right==null)
    		root.val += adds;
    	else
    		help(root.right, adds);
    }

    private int help2(TreeNode root) {
    	int res;
    	if (root.left!=null)
    		res = help2(root.left); 
    	else
    	    res = root.val;   		
    	return res;
    }
}