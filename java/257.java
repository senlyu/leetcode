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
    public List<String> binaryTreePaths(TreeNode root) {
        /*
        if root==null
            return new List<String>();
        if root==leave
            create string "root"
            add root to list
            return list
        if root.left!=null
            list = b(root.left)
        if root.right!=null
            list = b(root.right)
        for strings in list
            add root-> in the front
        return list
        */
        List<String> newL = new ArrayList<String>();
        if (root==null)
        	return newL;
        String newS = String.valueOf(root.val);
        if (root.left==null&&root.right==null) {
        	newL.add(newS);
        	return newL;
        }
        if (root.left!=null) {
        	List<String> leftL = binaryTreePaths(root.left);
        	for (String s:leftL) {
        		newL.add(s);
        	}
        }
        if (root.right!=null) {
        	List<String> rightL = binaryTreePaths(root.right);
        	for (String s:rightL) {
        		newL.add(s);
        	}
        }
        for (final ListIterator<String> i = newL.listIterator(); i.hasNext();) {
		    final String element = i.next();
		    i.set(newS + "->" + element);
		}
        return newL;
    }
}
