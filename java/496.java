class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Stack<Integer> s = new Stack<Integer>();
        for (int i=0;i<nums2.length;i++) {
        	if (s.size()==0)
        		s.add(nums2[i]);
        	else {
        		while (s.size()>0&&s.peek()<nums2[i]) {
        			map.put(s.pop(), nums2[i]);
        		} 
        		s.add(nums2[i]);
        	}
        }
        while (s.size()!=0) {
        	map.put(s.pop(), -1);
        }
        int[] res = new int[nums1.length];
        for (int i=0;i<nums1.length;i++) {
        	res[i] = map.get(nums1[i]);
        }
        return res;
    }
}