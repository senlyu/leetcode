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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q1 = new LinkedList<TreeNode>();
        Queue<TreeNode> q2 = new LinkedList<TreeNode>();
        Stack<List<Integer>> s = new Stack<List<Integer>>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        q1.add(root);
        while (q1.size()!=0) {
        	List<Integer> resA = new ArrayList<Integer>();
	        while (q1.size()!=0) {
	        	TreeNode now = q1.poll();
	        	if (now==null)
	        		continue;
	        	else {
	        		q2.add(now.left);
                    q2.add(now.right);
	        		resA.add(now.val);
	        	}
	        }
	        if (resA.size()>0)
	            s.add(resA);
	        q1 = q2;
            q2 = new LinkedList<TreeNode>();
        }
        while (!s.empty()) {
        	res.add(s.pop());
        }
        return res;
    }
}

