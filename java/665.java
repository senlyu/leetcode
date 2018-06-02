class Solution {
    public boolean checkPossibility(int[] nums) {
        int count =0;
        for (int i=0;i<nums.length-1;i++) {
        	if (nums[i]>nums[i+1]) {
        		count++;
        		if (((i-1)<0) || nums[i+1]>nums[i-1])
        			nums[i] = nums[i+1];
        		else
        			nums[i+1] = nums[i];
        		if (count>=2)
        			return false;
        	}
        }
        return true;
    }
}