class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l=0;
        int maxl=0;
        for (int i=0;i<nums.length;i++) {
        	if (nums[i]==0) {
        		if (l>maxl)
        			maxl = l;
        		l = 0;
        	} else {
        		l++;
        	}
        }
        return maxl;
    }
}