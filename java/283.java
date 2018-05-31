class Solution {
    public void moveZeroes(int[] nums) {
    	int k = 0;
    	int place = 0;
        outerloop:
        for (int i=0;i<(nums.length-1);i++) {
        	if (k>=(nums.length-1)) break outerloop;
        	if (nums[i]==0) {
        		if (i>k)
        			k=i;
        		k+=1;
        		while (nums[k]==0) {
        			k+=1;
        			if (k>=nums.length) break outerloop;
        		}
                place = nums[i];
                nums[i] = nums[k];
                nums[k] = place;
        	}
        }
    }
}