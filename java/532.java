class Solution {
    public int findPairs(int[] nums, int k) {
        Set<Integer> s = new HashSet<Integer>();
        int res = 0;
        if (k<0)
        	return 0;
        if (k==0) {
        	Set<Integer> ss = new HashSet<Integer>();
        	for (int i=0;i<nums.length;i++) {
        		if (s.contains(nums[i])&&!ss.contains(nums[i])) {
        			res += 1;
        			ss.add(nums[i]);
        		} else {
                	s.add(nums[i]);
        		}
        	}
        } else {
        	for (int i=0;i<nums.length;i++) {
        		s.add(nums[i]);
        	}
        	for (int i:s) {
        		if (s.contains(i+k)) {
        			res += 1;
        		}
        	}
        }
        return res;
    }
}