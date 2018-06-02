class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int maxlen = 1;
        int poslen = 1;
        if (nums.length<=1) {
        	return nums.length;
        }
        for (int i=0;i<nums.length-1;i++) {
            if (nums[i]<nums[i+1]) {
                poslen++;
                if (poslen>maxlen)
                	maxlen = poslen;
            } else {
            	poslen = 1;
            }
        }
        return maxlen;
    }
}